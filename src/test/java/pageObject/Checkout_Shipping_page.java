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

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

public class Checkout_Shipping_page extends Setup {

    public Checkout_Shipping_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    Faker faker = new Faker();
    public static String[] productCode = new String[5];
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements
    @FindBy(how = How.XPATH, using = "//h2[text()='Contact Information']")
    public List<WebElement> CHECKOUT_CONTACT_INFO_TITLE;
    @FindBy(how = How.XPATH, using = "//*[text()='Choose Shipping Method']")
    public List<WebElement> CHECKOUT_SHIPPING_METHOD;
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
    @FindBy(how = How.XPATH, using = "//*[text()='Use This Address']")
    public WebElement CHECKOUT_USE_THIS_ADDRESS_BUTTON;
    @FindBy(how = How.XPATH, using = "//input[@value='entered-address']")
    public WebElement CHECKOUT_ENTERED_ADDRESS_SECTION;
    @FindBy(how = How.XPATH, using = "//input[@value='suggested-address']")
    public WebElement CHECKOUT_SUGGESTED_ADDRESS_SECTION;
    @FindBy(how = How.XPATH, using = "//span[text()='Continue to payment']")
    public WebElement CHECKOUT_CONTINUE_PAYMENT_BUTTON;
    @FindBy(how = How.XPATH, using = "(//*[text()='Use a different billing address'])[3]")
    public WebElement USE_DIFFERENT_BILLING_ADDRESS;
    @FindBy(how = How.XPATH, using = "(//input[@name='firstname'])[4]")
    public WebElement USE_DIFFERENT_FIRST_NAME_INPUT;
    @FindBy(how = How.XPATH, using = "(//input[@name='lastname'])[4]")
    public WebElement USE_DIFFERENT_LAST_NAME_INPUT;
    @FindBy(how = How.XPATH, using = "(//span[text()='Address']/following::input[1])[4]")
    public WebElement USE_DIFFERENT_ADDRESS_INPUT;
    @FindBy(how = How.XPATH, using = "(//input[@name='city'])[4]")
    public WebElement USE_DIFFERENT_CITY_INPUT;
    @FindBy(how = How.XPATH, using = "(//select[@name='region_id'])[4]")
    public WebElement USE_DIFFERENT_REGION_DROPDOWN;
    @FindBy(how = How.XPATH, using = "(//input[@name='postcode'])[4]")
    public WebElement USE_DIFFERENT_POSTCODE_INPUT;
    @FindBy(how = How.XPATH, using = "(//input[@name='firstname'])[3]")
    public WebElement USE_DIFFERENT_FIRST_NAME;
    @FindBy(how = How.XPATH, using = "(//input[@name='lastname'])[3]")
    public WebElement USE_DIFFERENT_LAST_NAME;
    @FindBy(how = How.XPATH, using = "(//span[text()='Address']/following::input[1])[3]")
    public WebElement USE_DIFFERENT_ADDRESS;
    @FindBy(how = How.XPATH, using = "(//input[@name='city'])[3]")
    public WebElement USE_DIFFERENT_CITY;
    @FindBy(how = How.XPATH, using = "(//select[@name='region_id'])[3]")
    public WebElement USE_DIFFERENT_REGION;
    @FindBy(how = How.XPATH, using = "(//input[@name='postcode'])[3]")
    public WebElement USE_DIFFERENT_POSTCODE;
    @FindBy(how = How.XPATH, using = "(//*[text()='Review and Place Order'])[3]")
    public WebElement REVIEW_AND_PLACE_ORDER;
    @FindBy(how = How.XPATH, using = "//a[.='Return to Shipping']")
    public WebElement RETURN_TO_SHIPPING;
    @FindBy(how = How.XPATH, using = "//span[.='Hours of operation: M-F 8:00 AM - 5:00 PM CST (except national holidays)']")
    public WebElement HOURS_OF_OPERATION;
    @FindBy(how = How.XPATH, using = "(//a[.='800 243-0000'])[1]")
    public WebElement HELPLINE_NO;
    @FindBy(how = How.XPATH, using = "//a[@class=\"action showcart\"]")
    public WebElement CART_ICON;
    @FindBy(how = How.XPATH, using = "(//*[@class='need-help-support']/p/a)[1]")  
    public WebElement FOOTER_FAQ;
    @FindBy(how = How.XPATH, using = "(//*[@class='need-help-support']/p/a)[2]")  
    public WebElement FOOTER_CALLUS;
    @FindBy(how = How.XPATH, using = "(//*[@class='need-help-support']/p/a)[3]")  
    public WebElement FOOTER_EMAILUS;
    @FindBy(how = How.XPATH, using = "//*[@class='need-help-support']//span")  
    public WebElement FOOTER_HOURS_OF_OPERATION;
    
   
    
    
    

    public void verifyContactInfoPage() {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTACT_INFO_TITLE.get(0)));
        boolean isDisplayed = CHECKOUT_CONTACT_INFO_TITLE.get(0).isDisplayed();
        if (isDisplayed) {
            String actualTitle = CHECKOUT_CONTACT_INFO_TITLE.get(0).getText().trim();
            String expectedTitle = "Contact Information";
            Assert.assertEquals(actualTitle, expectedTitle);
//            actualTitle = CHECKOUT_CONTACT_INFO_TITLE.get(0).getText().trim();
//            expectedTitle = "Shipping Address";
//            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Contact Info Page is not displayed");
        }
    }
    

    public void enter_contact_shipping_info() {
        GlobalTestData.GLOBAL_CUSTOMER_EMAIL = faker.internet().safeEmailAddress();
        GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME = faker.name().firstName();
        GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME = faker.name().lastName();
        if (Cart_page.productArea == null) {
            Cart_page.productArea = "CA";
        }
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
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
        CHECKOUT_EMAIL_INPUT.clear();
        CHECKOUT_EMAIL_INPUT.sendKeys(email);
        CHECKOUT_PHONE_INPUT.clear();
        CHECKOUT_PHONE_INPUT.sendKeys(phoneNumber);
        CHECKOUT_FIRST_NAME_INPUT.clear();
        CHECKOUT_LAST_NAME_INPUT.clear();
        CHECKOUT_ADDRESS_INPUT.clear();
        CHECKOUT_CITY_INPUT.clear();
        CHECKOUT_FIRST_NAME_INPUT.sendKeys(firstName);
        CHECKOUT_LAST_NAME_INPUT.sendKeys(lastName);
        CHECKOUT_ADDRESS_INPUT.sendKeys(address);
        CHECKOUT_CITY_INPUT.sendKeys(city);
        CHECKOUT_REGION_DROPDOWN.click();
        CHECKOUT_REGION_DROPDOWN.sendKeys(state);
        CHECKOUT_POSTCODE_INPUT.clear();
        CHECKOUT_POSTCODE_INPUT.sendKeys(ZipCode);
    }
    
    public void enterContactInformation(String address) {
    	wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
    	CHECKOUT_ADDRESS_INPUT.clear();
    	CHECKOUT_ADDRESS_INPUT.sendKeys(address);
    }
    
    public void enterAddressInformation(String address, String city) {
    	wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
    	CHECKOUT_ADDRESS_INPUT.clear();
    	CHECKOUT_ADDRESS_INPUT.sendKeys(address);
    	CHECKOUT_CITY_INPUT.clear();
    	CHECKOUT_CITY_INPUT.sendKeys(city);
    }
    
    public void enterContactInformation(String email, String phoneNumber) {
    	wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
    	CHECKOUT_EMAIL_INPUT.clear();
    	CHECKOUT_EMAIL_INPUT.sendKeys(email);
    	CHECKOUT_PHONE_INPUT.clear();
    	CHECKOUT_PHONE_INPUT.sendKeys(phoneNumber);
    }
    
    
    public void enterContactInformation( String firstName, String lastName, String address, String city, String state, String ZipCode) {
    	wait.until(ExpectedConditions.elementToBeClickable(USE_DIFFERENT_FIRST_NAME_INPUT));
    	USE_DIFFERENT_FIRST_NAME_INPUT.sendKeys(firstName);
    	USE_DIFFERENT_LAST_NAME_INPUT.sendKeys(lastName);
    	USE_DIFFERENT_ADDRESS_INPUT.sendKeys(address);
    	USE_DIFFERENT_CITY_INPUT.sendKeys(city);
    	USE_DIFFERENT_REGION_DROPDOWN.click();
    	USE_DIFFERENT_REGION_DROPDOWN.sendKeys(state);
    	USE_DIFFERENT_POSTCODE_INPUT.clear();
    	USE_DIFFERENT_POSTCODE_INPUT.sendKeys(ZipCode);
}
    // For klarna
    public void enterContactInfo( String firstName, String lastName, String address, String city, String state, String ZipCode) {
    	wait.until(ExpectedConditions.elementToBeClickable(USE_DIFFERENT_FIRST_NAME));
    	USE_DIFFERENT_FIRST_NAME.sendKeys(firstName);
    	USE_DIFFERENT_LAST_NAME.sendKeys(lastName);
    	USE_DIFFERENT_ADDRESS.sendKeys(address);
    	USE_DIFFERENT_CITY.sendKeys(city);
    	USE_DIFFERENT_REGION.click();
    	USE_DIFFERENT_REGION.sendKeys(state);
    	USE_DIFFERENT_POSTCODE.clear();
    	USE_DIFFERENT_POSTCODE.sendKeys(ZipCode);
}

    public void clickSaveAndContinueButtonFromShippingPage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SAVE_BUTTON));
        Thread.sleep(3000);
        CHECKOUT_SAVE_BUTTON.click();
    }

    public void selectAddress() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_USE_THIS_ADDRESS_BUTTON));
        if (CHECKOUT_ENTERED_ADDRESS_SECTION.isDisplayed()) {
            CHECKOUT_ENTERED_ADDRESS_SECTION.click();
        }
        CHECKOUT_SUGGESTED_ADDRESS_SECTION.click();
        Thread.sleep(1000);
    }

    public void clickUseThisAddressButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_USE_THIS_ADDRESS_BUTTON));
        Thread.sleep(5000);
        CHECKOUT_USE_THIS_ADDRESS_BUTTON.click();
    }

    public void verifyShippingInfoPage() {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_SHIPPING_METHOD.get(0)));
        boolean isDisplayed = CHECKOUT_SHIPPING_METHOD.get(0).isDisplayed();
        if (isDisplayed) {
            String actualTitle = CHECKOUT_SHIPPING_METHOD.get(0).getText().trim();
            String expectedTitle = "Choose Shipping Method";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else {
            Assert.fail("Shipping Info Page is not displayed");
        }
    }

    public void clickContinuePaymentButtonFromShippingPage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_CONTINUE_PAYMENT_BUTTON));
        Thread.sleep(4000);
        CHECKOUT_CONTINUE_PAYMENT_BUTTON.click();
        Thread.sleep(1000);
    }

    public void selectShippingMethod(String shippingMethod) throws InterruptedException {
    	Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'" + shippingMethod + "')]/parent::label)[1]"))));
        driver.findElement(By.xpath("(//div[contains(text(),'" + shippingMethod + "')]/parent::label)[1]")).click();
        Thread.sleep(2000);
    }
    
    public void click(String linkName) throws InterruptedException {
    	Thread.sleep(3000);
		switch (linkName) {
		case "Use a different billing address":
			GenericFunctions.jsClick(USE_DIFFERENT_BILLING_ADDRESS);
			break;
		case "Review and Place Order":
			GenericFunctions.jsClick(REVIEW_AND_PLACE_ORDER);
			break;
		case "Return to Shipping":
			GenericFunctions.jsClick(RETURN_TO_SHIPPING);
			break;
    	default:
    		GenericFunctions.jsClick(driver.findElement(By.xpath("(//*[text()= '"+linkName+"'])[1]")));
			break;
		}

	}
    
    
    public void enterNewAddressOnPaymentPage() throws InterruptedException {
    	Thread.sleep(1000);
        GlobalTestData.GLOBAL_ALT_CUSTOMER_FIRST_NAME = faker.name().firstName();
        GlobalTestData.GLOBAL_ALT_CUSTOMER_LAST_NAME = faker.name().lastName();
        if (Cart_page.productArea == null) {
            Cart_page.productArea = "CA";
        }

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
        String address1 = GlobalTestData.ALTERNATE_ADDRESS(key);
        String city = GlobalTestData.CITY(key);
        String state = GlobalTestData.STATE(key);
        String ZipCode = GlobalTestData.ZIPCODES(key);
        
        
        enterContactInformation( GlobalTestData.GLOBAL_ALT_CUSTOMER_FIRST_NAME,
                GlobalTestData.GLOBAL_ALT_CUSTOMER_LAST_NAME, address1, city, state, ZipCode);
   
  	}
    public void enterNewAddressOnPayment() throws InterruptedException {
    	Thread.sleep(1000);
        GlobalTestData.GLOBAL_ALT_CUSTOMER_FIRST_NAME = faker.name().firstName();
        GlobalTestData.GLOBAL_ALT_CUSTOMER_LAST_NAME = faker.name().lastName();
        if (Cart_page.productArea == null) {
            Cart_page.productArea = "CA";
        }

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
        String address1 = GlobalTestData.ALTERNATE_ADDRESS(key);
        String city = GlobalTestData.CITY(key);
        String state = GlobalTestData.STATE(key);
        String ZipCode = GlobalTestData.ZIPCODES(key);
        
        
        enterContactInfo( GlobalTestData.GLOBAL_ALT_CUSTOMER_FIRST_NAME,
                GlobalTestData.GLOBAL_ALT_CUSTOMER_LAST_NAME, address1, city, state, ZipCode);
   
  	}
    
    
    
    public void update_Shipping_Info() {
        if (Cart_page.productArea == null) {
            Cart_page.productArea = "CA";
        }
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
        String address1 = GlobalTestData.ALTERNATE_ADDRESS(key);
        String city = GlobalTestData.CITY(key);
        enterAddressInformation(address1, city);
    }
    
    
    public void update_Contact_Info() throws InterruptedException {

        GlobalTestData.GLOBAL_CUSTOMER_EMAIL = faker.internet().safeEmailAddress();
        
        enterContactInformation(GlobalTestData.GLOBAL_CUSTOMER_EMAIL, GlobalTestData.GLOBAL_CUSTOMER_ALT_PHONE_NUMBER);
    }
    
    

    public void verifyHeader() {
		GenericFunctions.verifyElementByText("Need Help? Call: ");
		Assert.assertTrue(HOURS_OF_OPERATION.isDisplayed());
		Assert.assertTrue(HELPLINE_NO.isDisplayed());
		
    }
    
    public void verifyFooter() {
		GenericFunctions.verifyElementByText("Need Help?");
		Assert.assertTrue(FOOTER_FAQ.isDisplayed());
		Assert.assertTrue(FOOTER_CALLUS.isDisplayed());
		Assert.assertTrue(FOOTER_EMAILUS.isDisplayed());
		Assert.assertTrue(FOOTER_HOURS_OF_OPERATION.isDisplayed());
    }
    
    public void verifyFAQTab() {
    	String expFaqTitle = "Checkout LG Electronics";
    	String actFaqTitle = driver.getTitle();
    	System.out.println("actFaqTitle" + actFaqTitle);
    	assertEquals(actFaqTitle, expFaqTitle);
    }
    
    public void iClickOnCallUs() throws InterruptedException {
    	Thread.sleep(3000);
		FOOTER_CALLUS.click();
    }
    
    public void iClickOnEmailId() {
    	FOOTER_EMAILUS.click();
    }
    public void iVerifyFooterSection() {
    	Assert.assertTrue(FOOTER_HOURS_OF_OPERATION.isDisplayed());
    	
    }
   
}
