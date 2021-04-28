package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;


public class Config {
    public static WebDriver driver;
    public static DesiredCapabilities caps = new DesiredCapabilities();

    // setup browser (chrome, firefox, ie, safari, opera)
    public static WebDriver initDriver(String driverType) {
        if (driverType.equalsIgnoreCase("ch")) {
            //setup the chromedriver using WebDriverManager
            WebDriverManager.chromedriver().setup();
            //Create Chrome Options
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--incognito");
            option.addArguments("--test-type");
            option.addArguments("--disable-popup-bloacking");
            caps.setCapability(ChromeOptions.CAPABILITY, option);
            caps.setJavascriptEnabled(true);
            //Create driver object for Chrome
            driver = new ChromeDriver(option);
        } else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions option = new FirefoxOptions();
            option.addArguments("-private");
            caps.setCapability("moz:firefoxOptions", option);
            driver = new FirefoxDriver(option);
        } else if (driverType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions option = new EdgeOptions();
            option.setCapability("InPrivate", true);
            driver = new EdgeDriver(option);
        } else if (driverType.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            InternetExplorerOptions option = new InternetExplorerOptions().setPageLoadStrategy(PageLoadStrategy.NONE);
            caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
            caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
            driver = new InternetExplorerDriver(option);
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

}
