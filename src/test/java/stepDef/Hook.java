package stepDef;

import base.GlobalTestData;
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
    Logger logger = LoggerFactory.getLogger(Hook.class);

    @Before
    public void openBrowser() throws InterruptedException {
        if (Strings.isNullOrEmpty(browserType)){
            browserType="ch";
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL="stg";
        }
        driver = initDriver(browserType);
        switch (baseURL){
            case "qa" :
                url = "https://webqa.us.lg.com/us";
                GlobalTestData.VISA_CARD_NO = "4111111111111111";
                GlobalTestData.VISA_EXP_NO = "04/29";
                GlobalTestData.VISA_CVV = "353";
                break;
            case "stg" :
                url = "https://wwwstg.us.lg.com/us";
                GlobalTestData.OMV_Subscription = "LT600P";
                GlobalTestData.OMV_Non_Subscription = "MEC61904928";
                GlobalTestData.OMD_HE_Innovel = "OLED65G1PUA";
                GlobalTestData.OMD_HE_Non_Innovel = "FS21GB";
                GlobalTestData.OMD_HA_Innovel = "WKGX201HBA";
                GlobalTestData.OMD_HA_Non_Innovel = "AM501YWM1";
                GlobalTestData.OMD_KLARNA = "65NANO90UPA";
                GlobalTestData.VISA_CARD_NO = "4111111111111111";
                GlobalTestData.VISA_EXP_NO = "04/29";
                GlobalTestData.VISA_EXP_INVALIDDATE="04/20";
                GlobalTestData.VISA_CVV = "353";
                GlobalTestData.MASTER_CARD_NO = "5425233430109903";
                GlobalTestData.MASTER_EXP_NO = "04/23";
                GlobalTestData.MASTER_CVV = "123";
                GlobalTestData.AMEX_CARD_NO = "371100001000131";
                GlobalTestData.AMEX_EXP_NO = "05/23";
                GlobalTestData.AMEX_CVV = "1234";
                GlobalTestData.GLOBAL_EXISTING_CUSTOMER_EMAIL = "hasanyc@hotmail.com";
                GlobalTestData.GLOBAL_CUSTOMER_EMAIL = "hasanyc@hotmail.com";
                GlobalTestData.OMV_Non_Subscription_With_Accessories = "LT500P3";
                GlobalTestData.HA_OMD_KLARNA = "URETC1408N";
                GlobalTestData.HE_OMD_KLARNA = "OLED65G1PUA";//75QNED99UPA
                GlobalTestData.HE_OMD_NON_INNOVEL_KLARNA = "FS21GB";//65NANO90UPA
                GlobalTestData.PROMO_CODE = "TEST1234";
                GlobalTestData.INVALID_PROMO_CODE ="INVALID";
                GlobalTestData.HE_OMD_KLARNA_PROMO = "17Z95N-G.AAS8U1";
                GlobalTestData.JCB_CARD_NO = "  ";
                
               
                break;
            case "prod" :
                url = "http://lg.com/us";
                GlobalTestData.OMV_Subscription = "LT600P";
                GlobalTestData.OMV_Non_Subscription = "5215ER2002G";
                GlobalTestData.OMD_HE_Innovel = "OLED65B1PUA";
                GlobalTestData.OMD_HE_Non_Innovel = "SPD7Y";
                GlobalTestData.OMD_HA_Innovel = "WKGX201HBA";
                GlobalTestData.OMD_HA_Non_Innovel = "A908VMR";
                GlobalTestData.OMD_KLARNA = "65NANO90UPA";
                GlobalTestData.VISA_CARD_NO = "4111111111111111";
                GlobalTestData.VISA_EXP_NO = "04/29";
                GlobalTestData.VISA_EXP_INVALIDDATE="04/20";
                GlobalTestData.VISA_CVV = "353";
                GlobalTestData.MASTER_CARD_NO = "5425233430109903";
                GlobalTestData.MASTER_EXP_NO = "04/23";
                GlobalTestData.MASTER_CVV = "123";
                GlobalTestData.AMEX_CARD_NO = "371100001000131";
                GlobalTestData.AMEX_EXP_NO = "05/23";
                GlobalTestData.AMEX_CVV = "1234";
                GlobalTestData.GLOBAL_EXISTING_CUSTOMER_EMAIL = "hasanyc@hotmail.com";
                GlobalTestData.OMV_Non_Subscription_With_Accessories = "A927KGMS";
                GlobalTestData.HA_OMD_KLARNA = "URETC1408N";
                GlobalTestData.HE_OMD_KLARNA = "65NANO90UPA";
                GlobalTestData.HE_OMD_KLARNA_PROMO = "OLED77GXPUA";
                GlobalTestData.JCB_CARD_NO = " ";
                GlobalTestData.PROMO_CODE = "SPRINGS";
                GlobalTestData.INVALID_PROMO_CODE ="SPRINGS";
                break;
        }
        driver.get(url);
        logger.info("Test Started");
    }

    @After
    public void tearDown(Scenario scenario){
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            driver.quit();
            logger.info("Test Ended");
        }
    }
}
