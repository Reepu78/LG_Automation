package pageObject;

import base.GlobalTestData;
import base.Setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class Cart_page extends Setup {

	public Cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	Faker faker = new Faker();
	public static String productArea;
	public static String[] productCode = new String[5];

	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
	// Elements
	@FindBy(how = How.XPATH, using = "//h1[@class='page-title']/span")
	public WebElement CART_ZIPCODE_PAGE;
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'sku')]")
	public WebElement CART_PRODUCT_CODE;
	@FindBy(how = How.XPATH, using = "//span[text()='Check']//preceding::input[1]")
	public WebElement CART_ZIPCODE;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Promotion Code']")
	public WebElement CART_PROMOCODE;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'You used promotion code')]")
	public WebElement CART_PROMOCODE_MSG;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'You canceled the promotion code')]")
	public WebElement CART_REMOVE_PROMOCODE_MSG;
	@FindBy(how = How.XPATH, using = "//span[text()='Apply']")
	public WebElement APPLY_BUTTON;
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'cancel')]")
	public WebElement CANCEL_BUTTON;
	@FindBy(how = How.XPATH, using = "//span[text()='Check']")
	public WebElement CART_CHECK_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[contains(@data-bind,'message')]/div")
	public WebElement CART_POSTALCODE_MESSAGE;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement CART_PROCEED_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'sku')]")
	public WebElement CART_PRODUCTCODE;
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'cart-price')]/span")
	public WebElement CART_PRODUCTPRICE;
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Need Help')]")
	public WebElement CART_NEED_HELP_SECTION;
	@FindBy(how = How.XPATH, using = "//button[@title='Secure Checkout']")
	public WebElement CART_SECURE_BUTTON;
	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	public WebElement CART_SIGNIN_TITLE;
	@FindBy(how = How.XPATH, using = "//a[text()='Continue as guest']")
	public WebElement CART_CONTINUE_AS_GUEST;
	
	
	public void verifyZipCodePage() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_ZIPCODE_PAGE));
		Boolean isDisplayed = CART_ZIPCODE_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CART_ZIPCODE_PAGE.getText().trim();
			String expectedTitle = "ZIP Code Entry";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void verifySelectedProduct(String expectedCode) {
		wait.until(ExpectedConditions.elementToBeClickable(CART_PRODUCT_CODE));
		Boolean isDisplayed = CART_PRODUCT_CODE.isDisplayed();
		if (isDisplayed) {
			String actualCode = CART_PRODUCT_CODE.getText().trim();
			Assert.assertEquals(actualCode, expectedCode);
		} else {
			Assert.fail("Selected Product Code is not displayed");
		}
	}

	public String validateEnterZipCode() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CART_ZIPCODE));
		enterZipCode(GlobalTestData.GLOBAL_CA_ZIPCODE);
		String productArea = "";
		CART_CHECK_BUTTON.click();
		Boolean isAvailable = checkProductAvailable();
		if (!isAvailable) {
			enterZipCode(GlobalTestData.GLOBAL_NY_ZIPCODE);
			CART_CHECK_BUTTON.click();
			isAvailable = checkProductAvailable();
			if (!isAvailable) {
				enterZipCode(GlobalTestData.GLOBAL_TX_ZIPCODE);
				CART_CHECK_BUTTON.click();
				productArea = "GLOBAL_TX";
			} else {
				productArea = "GLOBAL_NY";
			}
		} else {
			productArea = "GLOBAL_CA";
		}
		return productArea;
	}

	public void enterZipCode(String zipCode) {
		wait.until(ExpectedConditions.elementToBeClickable(CART_ZIPCODE));
		CART_ZIPCODE.clear();
		CART_ZIPCODE.sendKeys(zipCode);
	}
	
	public void enterPromoCode(String promoCode) {
		wait.until(ExpectedConditions.elementToBeClickable(CART_PROMOCODE));
		CART_PROMOCODE.clear();
		CART_PROMOCODE.sendKeys(promoCode);
	}
	
	public void clickApplyButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(APPLY_BUTTON));
		APPLY_BUTTON.click();
		Thread.sleep(1000);
	}
	
	public void clickRemovePromoCode() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CANCEL_BUTTON));
		Thread.sleep(1000);
		//CANCEL_BUTTON.click();
		jsClick(CANCEL_BUTTON);
		Thread.sleep(1000);
	}
	
	public void verifyPromoCode() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_PROMOCODE_MSG));
		Boolean isDisplayed = CART_PROMOCODE_MSG.isDisplayed();
		if (!isDisplayed) {
			Assert.fail("Promocode is not Applied");
		} 
	}
	
	public void verifyRemovePromoCode() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_REMOVE_PROMOCODE_MSG));
		Boolean isDisplayed = CART_REMOVE_PROMOCODE_MSG.isDisplayed();
		if (!isDisplayed) {
			Assert.fail("Promocode is not removed");
		} 
	}
	
	public Boolean checkProductAvailable() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOf(CART_POSTALCODE_MESSAGE));
		Thread.sleep(2000);
		String postalCheck = CART_POSTALCODE_MESSAGE.getText().trim();
		Boolean value = true;
		if (postalCheck.contains("This product is not available to ship to your ZIP code")) {
			value = false;
		}
		return value;
	}

	public void clickProceedButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CART_PROCEED_BUTTON));
		CART_PROCEED_BUTTON.click();
		Thread.sleep(1000);
	}

	public void verifyCartPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_ZIPCODE_PAGE));
		Boolean isDisplayed = CART_ZIPCODE_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CART_ZIPCODE_PAGE.getText().trim();
			String expectedTitle = "Your Cart";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void verifyProducDetails(String productCode, String productPrice) {
		String actualProductCode = CART_PRODUCTCODE.getText().trim();
		String actualProductPrice = CART_PRODUCTPRICE.getText().trim();
		Assert.assertEquals(actualProductCode, productCode);
		Assert.assertEquals(actualProductPrice, productPrice);
	}

	public void verifyHelpSection() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_NEED_HELP_SECTION));
		Boolean isDisplayed = CART_NEED_HELP_SECTION.isDisplayed();
		if (isDisplayed) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("Help Section is not Available");
		}
	}

	public void clickSecureCheckOut() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_SECURE_BUTTON));
		CART_SECURE_BUTTON.click();
	}

	public void verifySignInPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_SIGNIN_TITLE));
		Boolean isDisplayed = CART_SIGNIN_TITLE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CART_SIGNIN_TITLE.getText().trim();
			String expectedTitle = "Sign in";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void clickContinueAsGuest() {
		wait.until(ExpectedConditions.elementToBeClickable(CART_CONTINUE_AS_GUEST));
		CART_CONTINUE_AS_GUEST.click();
	}
	
	public void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
