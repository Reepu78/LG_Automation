package pageObject;

import base.GenericFunctions;
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
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Checkout_Payment_page extends Setup {

    public Checkout_Payment_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Faker faker = new Faker();
    public static String productArea;
    public static String[] productCode = new String[5];

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements
    @FindBy(how = How.XPATH, using = "//div[@class='step-title']")
    public List<WebElement> CHECKOUT_PAYMENT_INFO_TITLE;
    @FindBy(how = How.XPATH, using = "(//span[text()='Review and Place Order'])[3]")
    public WebElement CHECKOUT_REVIEW_PLACE_ORDER_BUTTON;
    @FindBy(how = How.XPATH, using = "//span[text()='Card Number']/following::input[1]")
    public WebElement CHECKOUT_CARDNUMBER_INPUT;
    @FindBy(how = How.XPATH, using = "//span[text()='Expiration Date']/following::input[1]")
    public WebElement CHECKOUT_EXPIRY_DATE_INPUT;
    @FindBy(how = How.XPATH, using = "//span[text()='Security Code']/following::input[1]")
    public WebElement CHECKOUT_SECURITY_CODE_INPUT;
    @FindBy(how = How.XPATH, using = "//input[@inputmode='numeric']")
    public WebElement CHECKOUT_SSN_CODE_INPUT;
    @FindBy(how = How.NAME, using = "dateOfBirth")
    public WebElement CHECKOUT_DOB_INPUT;
    @FindBy(how = How.XPATH, using = "//span[@id='fixedamount_kp-purchase-approval-form-continue-button__text']")
    public WebElement CHECKOUT_CONTINUE_BUTTON;
    @FindBy(how = How.XPATH, using = "//div[text()='Credit card expired.']")
    public WebElement EXPRATION_DATE_ERROR;
    @FindBy(how = How.XPATH, using = "//*[@id='chcybersource_cc_number-error']")
    public WebElement CARD_TYPE_ERROR;
    @FindBy(how = How.CSS, using = "ul.payment-method-cvv-wrapper")
    public WebElement CVV_DEMO;
    

    public void verifyPaymentInfoPage() {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYMENT_INFO_TITLE.get(0)));
        Boolean isDisplayed = CHECKOUT_PAYMENT_INFO_TITLE.get(0).isDisplayed();
        if (isDisplayed) {
            String actualTitle = CHECKOUT_PAYMENT_INFO_TITLE.get(0).getText().trim();
            String expectedTitle = "Payment Method";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Payment Info Page is not displayed");
        }
    }

    public void selectPaymentMethodFromBillingPage(String paymentMethod) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYMENT_INFO_TITLE.get(0)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]//parent::label"))));
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]//parent::label"));
        element.click();
        Thread.sleep(1000);
    }

    //Clicks on Review Place Order Button Based on Payment Method
    public void clickReviewPlaceOrderButtonFromBillingPage(String paymentMethod) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]/following::span[text()='Review and Place Order']"))));
        //CHECKOUT_REVIEW_PLACE_ORDER_BUTTON.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]/following::span[text()='Review and Place Order']")));
    }

    public void enterCardDetails(String cardNumber, String expiryDate, String securityCode) {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CARDNUMBER_INPUT));
        CHECKOUT_CARDNUMBER_INPUT.clear();
        CHECKOUT_CARDNUMBER_INPUT.sendKeys(cardNumber);
        CHECKOUT_EXPIRY_DATE_INPUT.clear();
        CHECKOUT_EXPIRY_DATE_INPUT.sendKeys(expiryDate);
        CHECKOUT_SECURITY_CODE_INPUT.clear();
        CHECKOUT_SECURITY_CODE_INPUT.sendKeys(securityCode);
    }

    
    public void verrifyDebitCardSelected() {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CARDNUMBER_INPUT));
        Assert.assertNotNull(CHECKOUT_CARDNUMBER_INPUT);
    }

    //Clicks on Review Place Order Button Based on Payment Method
    public void enterKlarnaDetails() throws InterruptedException {
        driver.switchTo().frame("klarna-pay-over-time-fullscreen");
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SSN_CODE_INPUT));
        Thread.sleep(3000);
        CHECKOUT_SSN_CODE_INPUT.sendKeys(GlobalTestData.GLOBAL_KLARNA_SSN_INPUT);
        CHECKOUT_DOB_INPUT.sendKeys(GlobalTestData.GLOBAL_KLARNA_SSN_DOB);
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_BUTTON));
        jsClick(CHECKOUT_CONTINUE_BUTTON);
        driver.switchTo().defaultContent();
    }
    
    public void verifyErrorMessageForVisaExpirationdate() {
        wait.until(ExpectedConditions.elementToBeClickable(EXPRATION_DATE_ERROR));
        Boolean isDisplayed = EXPRATION_DATE_ERROR.isDisplayed();
        if (isDisplayed) {
            String actualTitle = EXPRATION_DATE_ERROR.getText();
            String expectedTitle = "Credit card expired.";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("No message appears");
        }
    }

    public void verifyErrorMessageForCreditCardType() {
        wait.until(ExpectedConditions.elementToBeClickable(CARD_TYPE_ERROR));
        Boolean isDisplayed = CARD_TYPE_ERROR.isDisplayed();
        if (isDisplayed) {
            String actualTitle = CARD_TYPE_ERROR.getText();
            //String expectedTitle = "Please enter a valid credit card type number.";
            String expectedTitle = "Please enter a valid number in this field.";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("No message appears");
        }
    }
    
    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void jsInput(WebElement element, String value) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='" + value + "';", element);
    }
    
    public void click(String elementText) {
    	WebElement element  = driver.findElement(By.xpath("(//*[text(), '"+elementText+"'])[1]")); 
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    
    
    public void verifyCVVDemo() {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
    	Assert.assertTrue(CVV_DEMO.isDisplayed());
    }
	
	
	public void clickoncontinuebutton() throws InterruptedException {
    	driver.switchTo().frame("klarna-pay-over-time-fullscreen");
    	wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_BUTTON));
        jsClick(CHECKOUT_CONTINUE_BUTTON);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
    	
    }

}
