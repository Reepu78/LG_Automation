package pageObject;

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
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]//parent::label"))));
	    Thread.sleep(6000);         
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]//parent::label"));
		element.click();
		Thread.sleep(1000);
	}
		
	//Clicks on Review Place Order Button Based on Payment Method
	public void clickReviewPlaceOrderButtonFromBillingPage(String paymentMethod) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]/following::span[text()='Review and Place Order']"))));
		//CHECKOUT_REVIEW_PLACE_ORDER_BUTTON.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]/following::span[text()='Review and Place Order']")));
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
	
	
	
}
