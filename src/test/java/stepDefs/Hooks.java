package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.baseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hooks extends baseClass
{
    final static Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void openBrowser()
    {
        String strBrowser = null;
        boolean blnBrowserSupported = true;
        try
        {
            strBrowser = System.getProperty("BROWSER").toLowerCase();
        }
        catch (Exception e)
        {
            strBrowser = "chrome";
        }

        switch (strBrowser.toLowerCase())
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "geckodriver");
                DesiredCapabilities cap = DesiredCapabilities.firefox();
                cap.setCapability("marionette", true);
                cap.setBrowserName("firefox");
                driver = new FirefoxDriver(cap);
                break;
            case "grid":
                //driver = new RemoteWebDriver(new URL("https://someurltoagrid/wd/hub"), cap);

                break;
            default:
                blnBrowserSupported = false;
                logger.error("Browser '" + strBrowser + "' not supported yet.");
                break;
        }

        if (!blnBrowserSupported)
        {
            throw new IllegalStateException("Browser not supported!");
        }
    }

    @After
    public static void shutDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
