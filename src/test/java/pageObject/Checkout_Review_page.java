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
import static org.testng.Assert.assertTrue;

import java.time.Duration;

public class Checkout_Review_page extends Setup {

    public Checkout_Review_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Faker faker = new Faker();
    public static String productArea;
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements
    @FindBy(how = How.XPATH, using = "(//div[@class='checkbox-text']//parent::label)[3]")
    public WebElement CHECKOUT_TERMS_CONDITIONS_CHECKBOX;
    @FindBy(how = How.XPATH, using = "//span[text()='Change Shipping Method']//following::button[1]")
    public WebElement CHECKOUT_PLACE_ORDER_BUTTON;
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
    @FindBy(how = How.XPATH, using = "//h4[text()='Shipping Address']")
    public WebElement SHIPPING_ADDRESS;
    @FindBy(how = How.XPATH, using = "//h4[text()='Contact Information']")
    public WebElement CONTACT_INFORMATION;
    @FindBy(how = How.XPATH, using = "//h4[text()='Payment Method']")
    public WebElement PAYMENT_METHOD;
    @FindBy(how = How.XPATH, using = "//h4[text()='Billing Address']")
    public WebElement BILLING_ADDRESS;
    @FindBy(how = How.XPATH, using = "//h2[text()='Order Summary']")
    public WebElement ORDER_SUMMARY;
    @FindBy(how = How.ID, using = "shipping-address")
    public WebElement SHIPPING_ADDRESS_VALUE;
    @FindBy(how = How.CSS, using = "div.shipping-information-content")
    public WebElement SHIPPING_INFORMATION_VALUE;
    @FindBy(how = How.ID, using = "contact-information")
    public WebElement CONTACT_INFORMATION_VALUE;
    @FindBy(how = How.ID, using = "billing-information")
    public WebElement PAYMENT_METHOD_VALUE;
    @FindBy(how = How.ID, using = "billing-address")
    public WebElement BILLING_ADDRESS_VALUE;
    @FindBy(how = How.ID, using = "agreement_steps_19")
    public WebElement SIGN_UP_OFFERS_CHECKBOX;
    @FindBy(how = How.XPATH, using = "(//*[.='Place Order'])[2]")
    public WebElement PLACE_ORDER;
    @FindBy(how = How.XPATH, using = "//*[@id='contact-information']//*[text()='Edit']")
    public WebElement EDIT_CONTACT_INFO;
    @FindBy(how = How.XPATH, using = "//*[@id='shipping-address']//*[text()='Edit']")
    public WebElement EDIT_SHIPPING_ADDRESS;
    @FindBy(how = How.XPATH, using = "//*[@id='billing-address']//*[text()='Edit']")
    public WebElement EDIT_BILLING_ADDRESS;
    @FindBy(how = How.XPATH, using = "//*[@id='billing-information']//*[text()='Edit']")	
    public WebElement EDIT_PAYMENT_METHOD;
    @FindBy(how = How.XPATH, using = "//*[@data-bind='text: getItemsQty()']")	
    public WebElement QUANTITY;
    

    public void clickTermsConditionsFromReviewPage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_TERMS_CONDITIONS_CHECKBOX));
        Thread.sleep(2000);
        CHECKOUT_TERMS_CONDITIONS_CHECKBOX.click();
        Thread.sleep(1000);
    }

    public void clickPlaceOrderButtonFromReviewPage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_PLACE_ORDER_BUTTON));
        CHECKOUT_PLACE_ORDER_BUTTON.click();
        Thread.sleep(1000);
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
        wait.until(ExpectedConditions.elementToBeClickable(CHECKOUT_EMAIL_INPUT));
        CHECKOUT_EMAIL_INPUT.sendKeys(email);
        CHECKOUT_PHONE_INPUT.sendKeys(phoneNumber);
        CHECKOUT_FIRST_NAME_INPUT.sendKeys(firstName);
        CHECKOUT_LAST_NAME_INPUT.sendKeys(lastName);
        CHECKOUT_ADDRESS_INPUT.sendKeys(address);
        CHECKOUT_CITY_INPUT.sendKeys(city);
        CHECKOUT_REGION_DROPDOWN.click();
        CHECKOUT_REGION_DROPDOWN.sendKeys(state);
        CHECKOUT_POSTCODE_INPUT.sendKeys(ZipCode);
    }
    
    

    public void verifyShippingAddress() {
    	Assert.assertNotNull(SHIPPING_ADDRESS);
    	String shippingAddress = SHIPPING_ADDRESS_VALUE.getText();
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME.toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME.toUpperCase()));
    	
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
        
        assertTrue(shippingAddress.contains(GlobalTestData.ADDRESS(key).toUpperCase().replaceAll("-", "").replace("STREET", "ST")));
    	//assertTrue(shippingAddress.contains(GlobalTestData.CITY(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.STATE(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.ZIPCODES(key).toUpperCase()));
    }
    
    
    public void verifyShippingInfo() throws InterruptedException {
    	Thread.sleep(2000);
    	Assert.assertNotNull(SHIPPING_ADDRESS);
    	String shippingAddress = SHIPPING_INFORMATION_VALUE.getText();
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME.toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME.toUpperCase()));
    	
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
        
        assertTrue(shippingAddress.contains(GlobalTestData.ADDRESS(key).toUpperCase().replaceAll("-", "").replace("STREET", "ST")));
    	//assertTrue(shippingAddress.contains(GlobalTestData.CITY(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.STATE(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.ZIPCODES(key).toUpperCase()));
    }
    
	public void verifyContactInformation() {
		Assert.assertNotNull(CONTACT_INFORMATION);
		String contactInfo = CONTACT_INFORMATION_VALUE.getText();
		assertTrue(contactInfo.contains(GlobalTestData.GLOBAL_CUSTOMER_EMAIL));
		String[] phone = GlobalTestData.GLOBAL_CUSTOMER_PHONE_NUMBER.split(" ");
		String phno = phone[0]+" "+phone[1]+"-"+phone[2];
		assertTrue(contactInfo.contains(phno));
	}
	
	public void verifyProductQty(String qty) throws InterruptedException {
		Thread.sleep(1000);
		String quantity = QUANTITY.getText();
		assertEquals(quantity.trim(), qty);
	}
	
	public void verifyNewBillingAddress() {
		Assert.assertNotNull(BILLING_ADDRESS);

    	String shippingAddress = BILLING_ADDRESS_VALUE.getText();
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_ALT_CUSTOMER_FIRST_NAME.toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_ALT_CUSTOMER_LAST_NAME.toUpperCase()));
    	
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
        
        assertTrue(shippingAddress.contains(GlobalTestData.ALTERNATE_ADDRESS(key).toUpperCase().replace("STREET", "ST")));
    	//assertTrue(shippingAddress.contains(GlobalTestData.CITY(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.STATE(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.ZIPCODES(key).toUpperCase()));
    
	}
	
	
	public void verifyUpdatedBillingAddress() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertNotNull(BILLING_ADDRESS);

    	String shippingAddress = driver.findElement(By.cssSelector("div.shipping-information-content")).getText();
    	
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
        
        assertTrue(shippingAddress.contains(GlobalTestData.ALTERNATE_ADDRESS(key).toUpperCase().replaceAll("-", "").replace("STREET", "ST")));
    	//assertTrue(shippingAddress.contains(GlobalTestData.CITY(key).toUpperCase()));
    	assertTrue(shippingAddress.contains(GlobalTestData.STATE(key).toUpperCase()));
    
	}
	
	public void verifyUpdatedContactInformation() throws InterruptedException {
		Assert.assertNotNull(BILLING_ADDRESS);
        Thread.sleep(3000);
    	String shippingAddress = driver.findElement(By.cssSelector("div.shipping-information-content")).getText();
        assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_EMAIL));
    	assertTrue(shippingAddress.contains(GlobalTestData.GLOBAL_CUSTOMER_ALT_PHONE_NUMBER));
    
	}
	
	public void verifyPaymentMethod() {
		Assert.assertNotNull(PAYMENT_METHOD_VALUE);
    	String Check = PAYMENT_METHOD_VALUE.getText();
    	assertTrue(Check.contains("Buy Now. Pay Later."));
	}
	public void verifyOrderSummarySection() {
		Assert.assertNotNull(ORDER_SUMMARY);
	}
	
	public void verifyCheckboxes() {
		Assert.assertFalse(CHECKOUT_TERMS_CONDITIONS_CHECKBOX.isSelected());
		Assert.assertTrue(SIGN_UP_OFFERS_CHECKBOX.isSelected());
	}
	
	public void click(String linkName) throws InterruptedException {
	Thread.sleep(1000);
	switch (linkName) {
	case "I Agree":
		GenericFunctions.jsClick(CHECKOUT_TERMS_CONDITIONS_CHECKBOX);
		break;
	case "Sign Me Up":
		GenericFunctions.jsClick(SIGN_UP_OFFERS_CHECKBOX);
		break;
	case "Place Order":
		GenericFunctions.jsClick(PLACE_ORDER);
		break;
	case "Edit Contact Information":
		GenericFunctions.click(EDIT_CONTACT_INFO);
		break;
	case "Edit Payment Method":
		GenericFunctions.click(EDIT_PAYMENT_METHOD);
		break;
	case "Edit Shipping Address":
		GenericFunctions.click(EDIT_SHIPPING_ADDRESS);
		break;
	case "Edit Billing Address":
		GenericFunctions.click(EDIT_BILLING_ADDRESS);
		break;
	default:
		GenericFunctions.jsClick(driver.findElement(By.xpath("(//*[text()= '"+linkName+"'])[1]")));
		break;
	}}
	

}
