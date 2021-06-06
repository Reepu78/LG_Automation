package stepDef;

import base.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.util.Strings;

public class Hook extends Setup {
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String OMD_HE_Innovel;
    public static String OMD_HE_Non_Innovel;
    public static String OMD_HA_Innovel;
    public static String OMD_HA_Non_Innovel;
    public static String OMV_Subscription;
    public static String OMV_Non_Subscription;
    Logger logger = LoggerFactory.getLogger(Hook.class);

    @Before
    public void openBrowser() throws InterruptedException {
        if (Strings.isNullOrEmpty(browserType)){
            browserType="ch";
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL="prod";
        }
        driver = initDriver(browserType);
        switch (baseURL){
            case "qa" :
                url = "https://webqa.us.lg.com/us";
                break;
            case "stg" :
                url = "https://wwwstg.us.lg.com/us";
                break;
            case "prod" :
                url = "http://lg.com/us";
                OMV_Subscription = "LT600P";
                OMV_Non_Subscription = "5215ER2002G";
                break;
        }
        driver.get(url);
        logger.info("Test Started");
    }

    @After
    public void tearDown(Scenario scenario){
        try{
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } catch (Exception e){
            System.out.println(e + "failed to take screenshot");
        }
//        driver.close();
//        driver.quit();
        logger.info("Test Ended");
    }

}
