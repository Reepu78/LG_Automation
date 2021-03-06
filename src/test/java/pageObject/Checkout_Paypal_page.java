package pageObject;

import base.GlobalTestData;
import base.Setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Checkout_Paypal_page extends Setup {

    public Checkout_Paypal_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Faker faker = new Faker();
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Pay with Credit or Debit Card')]")
    public WebElement CHECKOUT_PAYPAL_PAY_BUTTON;
    @FindBy(how = How.XPATH, using = "//input[@id='cardNumber']")
    public WebElement CHECKOUT_PAYPAL_CARDNUMBER_INPUT;
    @FindBy(how = How.XPATH, using = "//input[@id='cardExpiry']")
    public WebElement CHECKOUT_PAYPAL_EXPIRY_DATE_INPUT;
    @FindBy(how = How.XPATH, using = "//input[@id='cardCvv']")
    public WebElement CHECKOUT_PAYPAL_SECURITY_CODE_INPUT;
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement CHECKOUT_PAYPAL_EMAIL_INPUT;
    @FindBy(how = How.XPATH, using = "//input[@id='phone']")
    public WebElement CHECKOUT_PAYPAL_PHONE_INPUT;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue as Guest')]")
    public WebElement CHECKOUT_PAYPAL_CONTINUE_BUTTON;


    public void clickPayButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYPAL_PAY_BUTTON));
        Thread.sleep(1000);
        CHECKOUT_PAYPAL_PAY_BUTTON.click();
        Thread.sleep(1000);
    }

    public void enterCardDetails(String cardNumber, String expiryDate, String securityCode) {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYPAL_CARDNUMBER_INPUT));
        CHECKOUT_PAYPAL_CARDNUMBER_INPUT.clear();
        CHECKOUT_PAYPAL_CARDNUMBER_INPUT.sendKeys(cardNumber);
        CHECKOUT_PAYPAL_EXPIRY_DATE_INPUT.clear();
        CHECKOUT_PAYPAL_EXPIRY_DATE_INPUT.sendKeys(expiryDate);
        CHECKOUT_PAYPAL_SECURITY_CODE_INPUT.clear();
        CHECKOUT_PAYPAL_SECURITY_CODE_INPUT.sendKeys(securityCode);
    }

    public void enter_contact_shipping_info() {
        GlobalTestData.GLOBAL_CUSTOMER_EMAIL = faker.internet().safeEmailAddress();
        GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME = faker.name().firstName();
        GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME = faker.name().lastName();

        
        
        String key = "CA";
        if (Cart_page.productArea.contains("CA")) {
        	 key = "CA";
        } else if (Cart_page.productArea.contains("NY")) {
        	 key = "NY";
        } else if (Cart_page.productArea.contains("TX")) {
        	 key = "TX";
        }else if (Cart_page.productArea.contains("NJ")) {
        	 key = "NJ";
        }else if (Cart_page.productArea.contains("HI")) {
        	 key = "HI";
        }

        String address1 = GlobalTestData.ADDRESS(key);
        String city = GlobalTestData.CITY(key);
        String state = GlobalTestData.STATE(key);
        String ZipCode = GlobalTestData.ZIPCODES(key);
      
       
        enterContactInformation(GlobalTestData.GLOBAL_CUSTOMER_EMAIL,
                GlobalTestData.GLOBAL_CUSTOMER_PHONE_NUMBER, GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME,
                GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME, address1, city, state, ZipCode);
    }

    public void enterContactInformation(String email, String phoneNumber, String firstName, String lastName,
                                        String address, String city, String state, String ZipCode) {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYPAL_EMAIL_INPUT));
        CHECKOUT_PAYPAL_EMAIL_INPUT.clear();
        CHECKOUT_PAYPAL_EMAIL_INPUT.sendKeys(email);
        CHECKOUT_PAYPAL_PHONE_INPUT.clear();
        CHECKOUT_PAYPAL_PHONE_INPUT.sendKeys(phoneNumber);
    }

    public void clickContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYPAL_CONTINUE_BUTTON));
        Thread.sleep(1000);
        jsClick(CHECKOUT_PAYPAL_CONTINUE_BUTTON);
    }


    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

}
