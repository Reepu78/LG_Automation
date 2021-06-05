package pageObject;

import base.GlobalTestData;
import base.Setup;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class CheckoutPage extends Setup {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
	// Elements
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'TV')]")
	public WebElement CHECKOUT_TV_SECTION;
	@FindBy(how = How.LINK_TEXT, using = "OLED TVs")
	public WebElement CHECKOUT_OLED;
	@FindBy(how = How.XPATH, using = "//p[text()='LG’s Best TVs']")
	public WebElement CHECKOUT_TV_LINK;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'sku')]")
	public WebElement CHECKOUT_PRODUCTCODE;
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'cart-price')]/span")
	public WebElement CHECKOUT_PRODUCTPRICE;
	@FindBy(how = How.XPATH, using = "//img[@alt='LG OLED TV']")
	public WebElement CHECKOUT_LG_OLED_TV;
	@FindBy(how = How.XPATH, using = "//img[@alt='LG OLED TV']")
	public WebElement CHECKOUT_OLED_TV_CHECKBOX;
	@FindBy(how = How.XPATH, using = "//div[@class='title']/h1")
	public WebElement CHECKOUT_OLED_PAGE_TITLE;
	@FindBy(how = How.XPATH, using = "//a[text()='Add to Cart'][contains(@class,'active')]")
	public List<WebElement> CHECKOUT_ADD_TO_CART_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[@class='price ga-price']")
	public List<WebElement> CHECKOUT_PRICE;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter ZIP Code']")
	public WebElement CHECKOUT_ZIPCODE;
	@FindBy(how = How.XPATH, using = "//h1[@class='page-title']/span")
	public WebElement CHECKOUT_ZIPCODE_PAGE;
	@FindBy(how = How.XPATH, using = "//a[contains(@data-bind,'model_name')]")
	public WebElement CHECKOUT_PRODUCT_CODE;
	@FindBy(how = How.XPATH, using = "//span[text()='Check']")
	public WebElement CHECKOUT_CHECK_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'postalcode-validation-message')]/div")
	public WebElement CHECKOUT_POSTALCODE_MESSAGE;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement CHECKOUT_PROCEED_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[contains(@id,'products-info')]")
	public List<WebElement> CHECKOUT_PRODUCT_NAME;
	@FindBy(how = How.XPATH, using = "//span[text()='Quantity']/following::span[@class='price']")
	public WebElement CHECKOUT_CART_PRICE;
	@FindBy(how = How.XPATH, using = "//button[@title='Secure Checkout']")
	public WebElement CHECKOUT_SECURE_BUTTON;
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Need Help')]")
	public WebElement CHECKOUT_NEED_HELP_SECTION;
	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	public WebElement CHECKOUT_SIGNIN_TITLE;
	@FindBy(how = How.XPATH, using = "//a[text()='Continue as guest']")
	public WebElement CHECKOUT_CONTINUE_AS_GUEST;
	@FindBy(how = How.XPATH, using = "//h2[@class='step-title']")
	public List<WebElement> CHECKOUT_CONTACT_INFO_TITLE;
	@FindBy(how = How.XPATH, using = "//div[@class='step-title']")
	public List<WebElement> CHECKOUT_PAYMENT_INFO_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@id='customer-email']")
	public WebElement CHECKOUT_EMAIL_INPUT;
	@FindBy(how = How.XPATH, using = "//input[@name='telephone']")
	public WebElement CHECKOUT_PHONE_INPUT;
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	public WebElement CHECKOUT_FIRST_NAME_INPUT;
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	public WebElement CHECKOUT_LAST_NAME_INPUT;
	@FindBy(how = How.XPATH, using = "//span[text()='Address']/following::input[1]")
	public WebElement CHECKOUT_ADDRESS_INPUT;
	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	public WebElement CHECKOUT_CITY_INPUT;
	@FindBy(how = How.XPATH, using = "//select[@name='region_id']")
	public WebElement CHECKOUT_REGION_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//input[@name='postcode']")
	public WebElement CHECKOUT_POSTCODE_INPUT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	public WebElement CHECKOUT_SAVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@value='entered-address']")
	public WebElement CHECKOUT_ENTERED_ADDRESS_SECTION;
	@FindBy(how = How.XPATH, using = "//input[@value='suggested-address']")
	public WebElement CHECKOUT_SUGGESTED_ADDRESS_SECTION;
	@FindBy(how = How.XPATH, using = "//span[text()='Use This Address']")
	public WebElement CHECKOUT_USE_THIS_ADDRESS_BUTTON;
	@FindBy(how = How.XPATH, using = "//h1[@class='modal-title']")
	public WebElement CHECKOUT_ADDRESS_POPUP;
	@FindBy(how = How.XPATH, using = "//span[text()='Continue to payment']")
	public WebElement CHECKOUT_CONTINUE_PAYMENT_BUTTON;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Buy Now')]/ancestor::label")
	public WebElement CHECKOUT_KLARNA_PAYMENT_RADIO_BUTTON;
	@FindBy(how = How.XPATH, using = "(//span[text()='Review and Place Order'])[3]")
	public WebElement CHECKOUT_REVIEW_PLACE_ORDER_BUTTON;
	@FindBy(how = How.XPATH, using = "(//div[@class='checkbox-text']//parent::label)[1]")
	public WebElement CHECKOUT_TERMS_CONDITIONS_CHECKBOX;
	@FindBy(how = How.XPATH, using = "//span[text()='Change Shipping Method']//following::button[1]")
	public WebElement CHECKOUT_PLACE_ORDER_BUTTON;
	
	
	public void mouseOverTVLink() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_TV_SECTION));
		Actions actions = new Actions(driver);
		actions.moveToElement(CHECKOUT_TV_SECTION).perform();
	}

	public void clickOLEDSection() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_OLED));
		CHECKOUT_OLED.click();
	}

	public void verifyOLEDPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_OLED_PAGE_TITLE));
		Boolean isDisplayed = CHECKOUT_OLED_PAGE_TITLE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_OLED_PAGE_TITLE.getText().trim();
			String expectedTitle = "OLED TVs";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void verifyOLEDTV() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PRODUCT_NAME.get(0)));
		int size = CHECKOUT_PRODUCT_NAME.size();
		for (int i = 0; i < size; i++) {
			String productName = CHECKOUT_PRODUCT_NAME.get(i).getText().trim();
			if (!productName.contains("OLED")) {
				Assert.fail("Displayed product :" + productName + " is not OLED TV");
			}
		}
	}

	public String addCartHighPrice() throws ParseException {
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_ADD_TO_CART_BUTTON.get(0)));
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PRICE.get(0)));
		int size1 = CHECKOUT_PRICE.size();
		double hightestPrice = 0;

		// Code Block for finding the Highest Price
		for (int i = 0; i < size1; i++) {
			String price1 = CHECKOUT_PRICE.get(i).getText();
			Number prc1 = format.parse(price1);
			Number prc2 = 0;
			if (i != size1 - 1) {
				String price2 = CHECKOUT_PRICE.get(i + 1).getText();
				prc2 = format.parse(price2);
			}
			double price = Math.max(Double.parseDouble(prc1.toString()), Double.parseDouble(prc2.toString()));
			hightestPrice = Math.max(price, hightestPrice);
		}
		String highPrice = format.format(hightestPrice);

		// Clicking on Add to Cart Button for Product with Highest Price
		WebElement addCart = driver.findElement(By.xpath("//div[text()='" + highPrice + "']/following::a[1]"));
		WebElement product = driver
				.findElement(By.xpath("//div[text()='"+highPrice+"']/parent::div/parent::div/preceding-sibling::div[@class='sku']"));
		String productCode = product.getText().trim();
		addCart.click();

		// returns the selected Product Code and Price
		return productCode + "#" + highPrice;
	}

	public void verifyZipCodePage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_ZIPCODE_PAGE));
		Boolean isDisplayed = CHECKOUT_ZIPCODE_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_ZIPCODE_PAGE.getText().trim();
			String expectedTitle = "ZIP Code Entry";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void verifySelectedProduct(String expectedCode) {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PRODUCT_CODE));
		Boolean isDisplayed = CHECKOUT_PRODUCT_CODE.isDisplayed();
		if (isDisplayed) {
			String actualCode = CHECKOUT_PRODUCT_CODE.getText().trim();
			Assert.assertEquals(actualCode, expectedCode);
		} else {
			Assert.fail("Selected Product Code is not displayed");
		}
	}

	public String validateEnterZipCode() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_ZIPCODE));
		enterZipCode(GlobalTestData.GLOBAL_CA_ZIPCODE);
		String productArea = "";
		CHECKOUT_CHECK_BUTTON.click();
		Boolean isAvailable = checkProductAvailable();
		if (!isAvailable) {
			enterZipCode(GlobalTestData.GLOBAL_NY_ZIPCODE);
			CHECKOUT_CHECK_BUTTON.click();
			isAvailable = checkProductAvailable();
			if (!isAvailable) {
				enterZipCode(GlobalTestData.GLOBAL_TX_ZIPCODE);
				CHECKOUT_CHECK_BUTTON.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_ZIPCODE));
		CHECKOUT_ZIPCODE.clear();
		CHECKOUT_ZIPCODE.sendKeys(zipCode);
	}

	public Boolean checkProductAvailable() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_POSTALCODE_MESSAGE));
		String postalCheck = CHECKOUT_POSTALCODE_MESSAGE.getText().trim();
		Boolean value = true;
		if (postalCheck.contains("This product is not available to ship to your ZIP code")) {
			value = false;
		}
		return value;
	}

	public void clickProceedButton() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PROCEED_BUTTON));
		CHECKOUT_PROCEED_BUTTON.click();
	}

	public void verifyCartPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_ZIPCODE_PAGE));
		Boolean isDisplayed = CHECKOUT_ZIPCODE_PAGE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_ZIPCODE_PAGE.getText().trim();
			String expectedTitle = "Your Cart";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void verifyProducDetails(String productCode, String productPrice) {
		String actualProductCode = CHECKOUT_PRODUCTCODE.getText().trim();
		String actualProductPrice = CHECKOUT_PRODUCTPRICE.getText().trim();
		Assert.assertEquals(actualProductCode, productCode);
		Assert.assertEquals(actualProductPrice, productPrice);
	}

	public void verifyHelpSection() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_NEED_HELP_SECTION));
		Boolean isDisplayed = CHECKOUT_NEED_HELP_SECTION.isDisplayed();
		if (isDisplayed) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("Help Section is not Available");
		}
	}

	public void clickCheckOut() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SECURE_BUTTON));
		CHECKOUT_SECURE_BUTTON.click();
	}

	public void verifySignInPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SIGNIN_TITLE));
		Boolean isDisplayed = CHECKOUT_SIGNIN_TITLE.isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_SIGNIN_TITLE.getText().trim();
			String expectedTitle = "Sign in";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Page Title is not displayed");
		}
	}

	public void clickContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_AS_GUEST));
		CHECKOUT_CONTINUE_AS_GUEST.click();
	}

	public void verifyContactInfoPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTACT_INFO_TITLE.get(0)));
		Boolean isDisplayed = CHECKOUT_CONTACT_INFO_TITLE.get(0).isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_CONTACT_INFO_TITLE.get(0).getText().trim();
			String expectedTitle = "Contact Information";
			Assert.assertEquals(actualTitle, expectedTitle);
			actualTitle = CHECKOUT_CONTACT_INFO_TITLE.get(1).getText().trim();
			expectedTitle = "Shipping Address";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Contact Info Page is not displayed");
		}
	}

	public void enterContactInformation(String email, String phoneNumber, String firstName, String lastName,
			String address, String city, String state, String zipcode) {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
		CHECKOUT_EMAIL_INPUT.sendKeys(email);
		CHECKOUT_PHONE_INPUT.sendKeys(phoneNumber);
		CHECKOUT_FIRST_NAME_INPUT.sendKeys(firstName);
		CHECKOUT_LAST_NAME_INPUT.sendKeys(lastName);
		CHECKOUT_ADDRESS_INPUT.sendKeys(address);
		CHECKOUT_CITY_INPUT.sendKeys(city);
		CHECKOUT_REGION_DROPDOWN.click();
		CHECKOUT_REGION_DROPDOWN.sendKeys(state);
		CHECKOUT_POSTCODE_INPUT.sendKeys(zipcode);
	}

	public void clickSave() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SAVE_BUTTON));
		CHECKOUT_SAVE_BUTTON.click();
	}

	public void selectAddress() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_USE_THIS_ADDRESS_BUTTON));
		if (CHECKOUT_ENTERED_ADDRESS_SECTION.isDisplayed()) {
			CHECKOUT_ENTERED_ADDRESS_SECTION.click();
		} else {
			CHECKOUT_SUGGESTED_ADDRESS_SECTION.click();
		}
	}

	public void clickUseAddress() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_USE_THIS_ADDRESS_BUTTON));
		CHECKOUT_USE_THIS_ADDRESS_BUTTON.click();
	}
	
	public void verifyShippingInfoPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTACT_INFO_TITLE.get(0)));
		Boolean isDisplayed = CHECKOUT_CONTACT_INFO_TITLE.get(0).isDisplayed();
		if (isDisplayed) {
			String actualTitle = CHECKOUT_CONTACT_INFO_TITLE.get(0).getText().trim();
			String expectedTitle = "Choose Shipping Method";
			Assert.assertEquals(actualTitle, expectedTitle);
		} else {
			Assert.fail("Shipping Info Page is not displayed");
		}
	}

	public void clickContinuePayment() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_PAYMENT_BUTTON));
		Thread.sleep(4000);
		CHECKOUT_CONTINUE_PAYMENT_BUTTON.click();
	}
	
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
	
	public void selectPaymentMethod(String paymentMethod) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PAYMENT_INFO_TITLE.get(0)));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]//parent::label"))));
	    Thread.sleep(6000);         
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+paymentMethod+"')]//parent::label"));
		element.click();		
	}
	
	public void clickReviewPlaceOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_REVIEW_PLACE_ORDER_BUTTON));
		//CHECKOUT_REVIEW_PLACE_ORDER_BUTTON.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", CHECKOUT_REVIEW_PLACE_ORDER_BUTTON);
	}
	
	public void clickTermsConditions() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_TERMS_CONDITIONS_CHECKBOX));
		Thread.sleep(2000);
		CHECKOUT_TERMS_CONDITIONS_CHECKBOX.click();
	}
	
	public void clickPlaceOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PLACE_ORDER_BUTTON));
		CHECKOUT_PLACE_ORDER_BUTTON.click();
	}
	
	public String getAlphaNumericString(int n) {
		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}
}
