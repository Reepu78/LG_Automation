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

import base.Setup;

public class Confirmation_page extends Setup {

    public Confirmation_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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
    
 


  	
}
