package pageObject;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import base.GlobalTestData;
import base.Setup;

public class Confirmation_page extends Setup {

    public Confirmation_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    Faker faker = new Faker();
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements
    @FindBy(how = How.XPATH,using = "//*[text()='Thank You!']")
    public WebElement VERIFY_THANKS_YOU_PAGE;
    @FindBy(how = How.XPATH, using = "//*[@class='sub-heading']/h3/span")
    public WebElement VERIFY_ORDER_NUMBER;
    @FindBy(how = How.XPATH, using = "//*[text()='Order Summary']")
    public WebElement VERIFY_ORDER_SUMMARY;
    @FindBy(how = How.XPATH, using = "//*[text()='Your Order']")
    public WebElement VERIFY_YOUR_ORDER;
    @FindBy(how = How.XPATH, using = "//*[@class='shipping-method-value']")
    public WebElement ESTIMATED_DATE_OF_DELIVERY;
    @FindBy(how = How.XPATH, using = "(//*[text()='Shipping'])[2]")
    public WebElement VERIFY_SHIPPING;
    @FindBy(how = How.XPATH, using = "//*[text()='Billing']")
    public WebElement VERIFY_BILLING;
    @FindBy(how = How.XPATH, using = "(//*[text()='Need Help?'])[1]")
    public WebElement VERIFY_NEED_HELP;
    
    @FindBy(how = How.XPATH, using = "//*[@id='firstname']")
    public WebElement FIRST_NAME;
    @FindBy(how = How.XPATH, using = "//*[@id='lastname']")
    public WebElement LAST_NAME;
    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    public WebElement PASSWORD_BOX;
    @FindBy(how = How.XPATH, using = "//*[@id='password-confirmation']")
    public WebElement CONFIRM_PASSWORD_BOX;
    @FindBy(how = How.XPATH, using = "//*[@id='requestDate']")
    public WebElement CALENDAR;
    @FindBy(how = How.XPATH, using = "//*[@class='ui-datepicker-year']/*[text()='1991']")
    public WebElement YEAR;
    @FindBy(how = How.XPATH, using = "(//*[@class='ui-state-default'])[4]")
    public WebElement DATE;
    @FindBy(how = How.XPATH, using = "(//*[@class='field choice signuppolicy']/*)[2]")
    public WebElement T_AND_C_CHECK_BOX;
    @FindBy(how = How.XPATH, using = "//*[text()='Create Account']")
    public WebElement CREATE_ACCOUNT_BUTTON;
    @FindBy(how = How.XPATH, using = " //*[text()='Your account has been created!']")
    public WebElement VERIFY_MESSAGE;
 
    
  
    
    public void verifyThanksYouIsDisplay()  {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_THANKS_YOU_PAGE));
        boolean isDisplayed = VERIFY_THANKS_YOU_PAGE.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_THANKS_YOU_PAGE.getText().trim();
            String expectedTitle = "Thank You!";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
        
    }
    
    public void verifyOrderNumberIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_ORDER_NUMBER));
        boolean isDisplayed = VERIFY_ORDER_NUMBER.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_ORDER_NUMBER.getText().trim();
            String expectedTitle = "";
            Assert.assertNotEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    

    public void verifyOrderSummaryIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_ORDER_SUMMARY));
        boolean isDisplayed = VERIFY_ORDER_SUMMARY.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_ORDER_SUMMARY.getText().trim();
            String expectedTitle = "";
            Assert.assertNotEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    

    public void verifyYourOrderSectionIsDisplay() {
// 	   driver.switchTo().frame("klarna-pay-over-time-fullscreen");
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_YOUR_ORDER));
        boolean isDisplayed = VERIFY_YOUR_ORDER.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_YOUR_ORDER.getText().trim();
            String expectedTitle = "Your Order";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    
 // ==================dateofdelivery======================
    public void verifyEstimatedDateOfDeliveryIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(ESTIMATED_DATE_OF_DELIVERY));
        boolean isDisplayed = ESTIMATED_DATE_OF_DELIVERY.isDisplayed();
        if (isDisplayed) {
            String actualTitle =ESTIMATED_DATE_OF_DELIVERY.getText().trim();
            String expectedTitle = "";
            Assert.assertNotEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    

    public void verifyShippingIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_SHIPPING));
        boolean isDisplayed = VERIFY_SHIPPING.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_SHIPPING.getText().trim();
            String expectedTitle = "Shipping";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    
    public void verifyBillingIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_BILLING));
        boolean isDisplayed = VERIFY_BILLING.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_BILLING.getText().trim();
            String expectedTitle = "Billing";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    
    public void verifyNeedHelpIsDisplay() {
        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_NEED_HELP));
        boolean isDisplayed = VERIFY_NEED_HELP.isDisplayed();
        if (isDisplayed) {
            String actualTitle =VERIFY_NEED_HELP.getText().trim();
            String expectedTitle = "Need Help?";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Page Title is not displayed");
        }
    }
    
    public void enterConsumerDetail(String name, String lastname, String password, String confirmPassword) {
    	wait.until(ExpectedConditions.elementToBeClickable(FIRST_NAME));
    	FIRST_NAME.clear();
    	FIRST_NAME.sendKeys(name);
    	LAST_NAME.clear();
    	LAST_NAME.sendKeys(lastname);
    	PASSWORD_BOX.clear();
        PASSWORD_BOX.sendKeys(password);
        CONFIRM_PASSWORD_BOX.clear();
        CONFIRM_PASSWORD_BOX.sendKeys(confirmPassword);
    }
    
    
   public void createAnAccount() {
	   
	   GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME = faker.name().firstName();
       GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME = faker.name().lastName();
       
       enterConsumerDetail(
               GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME,
               GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME, 
               GlobalTestData.GLOBAL_PASSWORD, 
               GlobalTestData.GLOBAL_CONFIRM_PASSWORD
              );
      
	      }
   
   public void enterDateOfBirth() {
	   CALENDAR.click();
	   YEAR.click();
       DATE.click();
   }
   
   public void clickOnTermsAndConditionsCheckBoxAndandCreateAccountBtn() {
	   T_AND_C_CHECK_BOX.click();
	   CREATE_ACCOUNT_BUTTON.click();
   }
   
   public void createAnAccountMessageIsDisplay() {
	        wait.until(ExpectedConditions.elementToBeClickable(VERIFY_MESSAGE));
	        boolean isDisplayed = VERIFY_MESSAGE.isDisplayed();
	        if (isDisplayed) {
	            String actualTitle = VERIFY_MESSAGE.getText().trim();
	            String expectedTitle = "Your account has been created!";
	            Assert.assertEquals(actualTitle, expectedTitle);
	        } else {
	            Assert.fail("Account has been created Message not displayed");
	        }
	    
   }
    
   
 


  	
}
