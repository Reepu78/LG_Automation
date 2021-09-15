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
	@FindBy(how = How.XPATH, using = "//span[@id='fixedamount_kp-purchase-review-continue-button__text']")
	public WebElement CHECKOUT_CONFIRM_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id='fixedamount_kp-account-credit-agreement-agree-checkbox__box']")
	public WebElement CHECKOUT_CHECK_BOX;
	@FindBy(how = How.XPATH, using = "//span[@id='fixedamount_kp-account-credit-agreement-sign-button__text']")
	public WebElement CHECKOUT_AGREE_SUBMIT_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[text()='Your tailored plan']")
	public WebElement VERIFY_TAILORED_PAGE;
	@FindBy(how = How.XPATH, using = "//*[text()='Review terms and apply']")
	public WebElement VERIFY_REVIEW_TERMS_PAGE;
	@FindBy(how = How.XPATH, using = "//*[text()='Verify your details']")
	public WebElement VERIFY_YOUR_DETAIL;
	@FindBy(how = How.XPATH, using = "//*[@id='email_or_phone']")
	public WebElement ENTER_PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//*[@id='remember_me_checkbox__box']")
	public WebElement CHECKBOX;
	@FindBy(how = How.XPATH, using = "//*[@id='btn-continue']/div")
	public WebElement ON_CONTINUE_BTN;
	@FindBy(how = How.XPATH, using = "//*[@id='otp_field']")
	public WebElement ENTER_CODE;
	@FindBy(how = How.XPATH, using = "//*[text()='Confirm and continue']")
	public WebElement CONFIRM_AND_CONTINUE_BTN;
	
	@FindBy(how = How.XPATH, using = "//*[@class='totals-tax']/*/span")
	public WebElement VERIFY_ESTIMATED_TAX;

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
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]//parent::label"))));
//		Thread.sleep(6000);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'" + paymentMethod + "')]//parent::label"))));
		element.click();
		Thread.sleep(1000);
	}

	// Clicks on Review Place Order Button Based on Payment Method
	public void clickReviewPlaceOrderButtonFromBillingPage(String paymentMethod) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(
				"//span[contains(text(),'" + paymentMethod + "')]/following::span[text()='Review and Place Order']"))));
		// CHECKOUT_REVIEW_PLACE_ORDER_BUTTON.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(
				"//span[contains(text(),'" + paymentMethod + "')]/following::span[text()='Review and Place Order']")));
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

	// Clicks on Review Place Order Button Based on Payment Method
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
			// String expectedTitle = "Please enter a valid credit card type number.";
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
		WebElement element = driver.findElement(By.xpath("(//*[text(), '" + elementText + "'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void verifyCVVDemo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		Assert.assertTrue(CVV_DEMO.isDisplayed());
	}

	public void clickoncontinuebutton() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_BUTTON));
		jsClick(CHECKOUT_CONTINUE_BUTTON);
		wait.until(ExpectedConditions.visibilityOf(CHECKOUT_CONTINUE_BUTTON));
//		Thread.sleep(10000);
		driver.switchTo().defaultContent();

	}

//	public void verifyTextElement(String text) {
//		 driver.switchTo().frame("klarna-pay-over-time-fullscreen");
//			WebElement ele = driver.findElement(By.xpath("//*[text()='"+text+"']"));
//			wait.until(ExpectedConditions.elementToBeClickable(ele));
//			Assert.assertTrue(ele.isDisplayed());
//			 driver.switchTo().defaultContent();
//		}
//	
	public void clickOnConfirmButton() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONFIRM_BUTTON));
		jsClick(CHECKOUT_CONFIRM_BUTTON);
		driver.switchTo().defaultContent();
	}

	public void clickOnReviewTeamAgreeCheckBox() {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CHECK_BOX));
		jsClick(CHECKOUT_CHECK_BOX);
		driver.switchTo().defaultContent();
	}

	public void clickOnAgreeandSubmit() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_AGREE_SUBMIT_BUTTON));
		Thread.sleep(3000);
		jsClick(CHECKOUT_AGREE_SUBMIT_BUTTON);
		driver.switchTo().defaultContent();

	}

	public void verifyTailoredPlanIsDisplay() {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
//	   GenericFunctions.isDisplayed(VERIFY_REVIEW_TERMS_PAGE, "Review terms and apply");
		wait.until(ExpectedConditions.elementToBeClickable(VERIFY_TAILORED_PAGE));
		boolean isDisplayed = VERIFY_TAILORED_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = VERIFY_TAILORED_PAGE.getText().trim();
			String expectedTitle = "Your tailored plan";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
		driver.switchTo().defaultContent();
	}

	public void verifyReviewTermsIsDisplay() {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
//	   GenericFunctions.isDisplayed(VERIFY_REVIEW_TERMS_PAGE, "Review terms and apply");
		wait.until(ExpectedConditions.elementToBeClickable(VERIFY_REVIEW_TERMS_PAGE));
		boolean isDisplayed = VERIFY_REVIEW_TERMS_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = VERIFY_REVIEW_TERMS_PAGE.getText().trim();
			String expectedTitle = "Review terms and apply";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
		driver.switchTo().defaultContent();
	}

	public void clickonCheckBox() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX));
		jsClick(CHECKBOX);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

	}

	public void clickoncontinuebtn() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(ON_CONTINUE_BTN));
		jsClick(ON_CONTINUE_BTN);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
	}

	public void enterCode() {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(ENTER_CODE));
		ENTER_CODE.sendKeys("123456");
		driver.switchTo().defaultContent();
	}
	
	public void clickOnConfirmAndContinueBtn() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_AND_CONTINUE_BTN));
		jsClick(CONFIRM_AND_CONTINUE_BTN);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
	}

	public void verifyYourDetailAndEnterPhoneNumberDisplay() throws InterruptedException {
		driver.switchTo().frame("klarna-pay-over-time-fullscreen");
		wait.until(ExpectedConditions.elementToBeClickable(VERIFY_YOUR_DETAIL));
		boolean isDisplayed = VERIFY_YOUR_DETAIL.isDisplayed();
		if (isDisplayed) {
			String actualTitle = VERIFY_YOUR_DETAIL.getText().trim();
			String expectedTitle = "Verify your details";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
//       Thread.sleep(3000);
		ENTER_PHONE_NUMBER.sendKeys("+12163547758");
		driver.switchTo().defaultContent();
	}

	public void iVerifyEstimatedTax() {
		wait.until(ExpectedConditions.elementToBeClickable(VERIFY_ESTIMATED_TAX));
		Boolean isDisplayed = VERIFY_ESTIMATED_TAX.isDisplayed();
		if (isDisplayed) {
			String actualString = VERIFY_ESTIMATED_TAX.getText().trim();
			float tax = GenericFunctions.getPrice(actualString);
			Assert.assertTrue(tax>0);
		} else {
			Assert.fail("Extimated Tax is not displayed");
		}
	}
}
