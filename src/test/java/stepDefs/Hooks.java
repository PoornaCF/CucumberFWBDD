package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.baseClass;
import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends baseClass {
    static SelendroidLauncher selendroidServer=null;

    @Before
    public void openBrowser() {

        WebDriverWait wait;


        String strBrowser = null;
        try {
            strBrowser = System.getProperty("BROWSER").toLowerCase();
        } catch (Exception e) {
            strBrowser = "chrome";
        }


        switch (strBrowser.toLowerCase()) {
            case "chrome":
                String browser_name = "chrome";
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setBrowserName(browser_name);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "geckodriver");
                DesiredCapabilities cap = DesiredCapabilities.firefox();
                cap.setCapability("marionette", true);
                cap.setBrowserName("firefox");
                driver = new FirefoxDriver(cap);
                break;
            case "android":
                SelendroidConfiguration config = new SelendroidConfiguration();
                // Add the selendroid-test-app to the standalone server
                config.addSupportedApp("src/main/resources/selendroid-test-app-0.17.0.apk");
                selendroidServer = new SelendroidLauncher(config);
                selendroidServer.launchSelendroid();
                // Create the selendroid capabilities and specify to use an emulator and selendroid's test app
                SelendroidCapabilities caps = new SelendroidCapabilities("io.selendroid.testapp:0.17.0");
                try {
                    driver = new SelendroidDriver(caps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }


        //for Grid
        //driver = new RemoteWebDriver(new URL("https://turbo-seleniumgrid.hesos.net/wd/hub"), cap);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Always maximize firefox on windows


        driver.get("http://web2.0calc.com/");

    }

    @After
    public static void shutDown() {
        if (driver != null) {
            driver.quit();
        }
        if (selendroidServer != null) {
            selendroidServer.stopSelendroid();
        }
    }


}
