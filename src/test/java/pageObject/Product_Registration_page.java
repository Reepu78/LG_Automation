package pageObject;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

public class Product_Registration_page extends Setup {

	public Product_Registration_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

	@FindBy(how = How.XPATH, using = "(//a[@class='chosen-single chosen-default'])[1]")
	public WebElement CATEGORY;
	@FindBy(how = How.XPATH, using = "(//a[@class='chosen-single chosen-default'])[2]")
	public WebElement PRODUCT;
	@FindBy(how = How.XPATH, using = "(//a[@class='chosen-single chosen-default'])[3]")
	public WebElement PRODUCT_TYPE;
	@FindBy(how = How.XPATH, using = "(//li[contains(text(), 'TV/Audio/Video')])[1]")
	public WebElement CATEGORY_VALUE;
	@FindBy(how = How.XPATH, using = "(//li[contains(text(), '15LC1RB.AUS')])[1]")
	public WebElement MODAL_NUMBER_VALUE;
	@FindBy(how = How.XPATH, using = "(//li[contains(text(), 'TVs')])[1]")
	public WebElement PRODUCT_VALUE;
	@FindBy(how = How.XPATH, using = "(//li[contains(text(), '39 Inch screen size and below')])[1]")
	public WebElement PRODUCT_TYPE_VALUE;
	@FindBy(how = How.XPATH, using = "(//a[@class='chosen-single'])[1]")
	public WebElement MODEL_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@id='serialNumber_1']")
	public WebElement SERIAL_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@id='placePurchase_1']")
	public WebElement PLACE_OF_PURCHASE;
	@FindBy(how = How.XPATH, using = "//input[@id='purchasedDate_1']")
	public WebElement PURCHASED_DATE;
	@FindBy(how = How.XPATH, using = "//input[@id='file_1_txt']")
	public WebElement SELECT_TO_FILE_UPLOAD;
	@FindBy(how = How.XPATH, using = "//input[@id='pricePurchase_1']")
	public WebElement PURCHASE_PRICE;
	@FindBy(how = How.XPATH, using = "//input[@id='FirstName']")
	public WebElement FIRST_NAME;
	@FindBy(how = How.XPATH, using = "//input[@id='LastName']")
	public WebElement LAST_NAME;
	@FindBy(how = How.XPATH, using = "//input[@id='EmailAddress']")
	public WebElement EMAIL_ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@id='PhoneNumber']")
	public WebElement PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@id='MobilePhoneNumber']")
	public WebElement MOBILE_PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@id='Address']")
	public WebElement ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@id='City']")
	public WebElement CITY;
	@FindBy(how = How.XPATH, using = "(//*[@title='Select the State Category'])[2]")
	public WebElement STATE;
	@FindBy(how = How.XPATH, using = "//input[@id='ZIPCode']")
	public WebElement ZIP_CODE;
	@FindBy(how = How.XPATH, using = "(//span[@class='checkbox-btn'])[1]")
	public WebElement CHECK_BOX_1;
	@FindBy(how = How.XPATH, using = "(//span[@class='checkbox-btn'])[2]")
	public WebElement CHECK_BOX_2;
	@FindBy(how = How.XPATH, using = "(//span[@class='checkbox-btn'])[3]")
	public WebElement CHECK_BOX_POLICY;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-lg']")
	public WebElement REGISTER_A_PRODUCT;


	public void enterProductInfo() throws InterruptedException {
		GenericFunctions.jsClick(CATEGORY);
		CATEGORY.click();
		CATEGORY.click();
		CATEGORY_VALUE.click();
		CATEGORY.click();
		PRODUCT_VALUE.click();
		CATEGORY.click();
		PRODUCT_TYPE_VALUE.click();
		CATEGORY.click();
		MODAL_NUMBER_VALUE.click();
		SERIAL_NUMBER.sendKeys("ABC1233");
		PLACE_OF_PURCHASE.sendKeys("NEW YORK");
		PURCHASED_DATE.sendKeys("08/08/2019");
		PURCHASE_PRICE.sendKeys("8856");
		FIRST_NAME.sendKeys("BRIAN");
		LAST_NAME.sendKeys("AFTER");
		EMAIL_ADDRESS.sendKeys("brianaftertest@mailinator.com");
		PHONE_NUMBER.sendKeys("2548564521");
		MOBILE_PHONE_NUMBER.sendKeys("2145745236");
		ADDRESS.sendKeys(GlobalTestData.ADDRESS("NY"));
		CITY.sendKeys(GlobalTestData.CITY("NY"));
		STATE.click();
		driver.findElement(By.xpath("//li[contains(text(), 'ALASKA')]")).click();
		ZIP_CODE.sendKeys(GlobalTestData.ZIPCODES("NY").toUpperCase());
		CHECK_BOX_POLICY.click();
		REGISTER_A_PRODUCT.click();
	}

	
}
