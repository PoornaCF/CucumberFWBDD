package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.baseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends baseClass {


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
        }


        //for Grid
        //driver = new RemoteWebDriver(new URL("https://turbo-seleniumgrid.hesos.net/wd/hub"), cap);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Always maximize firefox on windows


        driver.get("http://web2.0calc.com/");

    }

    @After
    public static void shutDown() {
        driver.close();
    }


}
