package stepDef;

import base.GlobalTestData;
import base.Setup;
import java.text.ParseException;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;

public class Checkout_steps extends Setup {
	Faker faker = new Faker();
	CheckoutPage CheckOut = new CheckoutPage(driver);
	String[] productCode = new String[5];
	String productArea = "";

	@Given("I am at LG TV,Audio,Video Page")
	public void mouseOverTVSection() {
		CheckOut.mouseOverTVLink();
	}

	@When("I click on TV Section Link")
	public void clickOLEDTV() {
		CheckOut.clickOLEDSection();
	}

	@Then("I should navigate to OLED TV Page")
	public void verifyOLEDPage() {
		CheckOut.verifyOLEDPage();
	}

	@And("I should see only OLED TVs in current page")
	public void verifyOLEDTV() {
		CheckOut.verifyOLEDTV();
	}

	@Then("I will click on Add to Cart Button for Available OLED in Highest Price range")
	public void addCartHighPrice() throws ParseException {
		productCode = CheckOut.addCartHighPrice().split("#");
	}

	@And("I should navigate to Zip Code Entry Page")
	public void verifyZipCode() {
		CheckOut.verifyZipCodePage();
	}

	@And("I should see only OLED which is selected in zip Code Entry Page")
	public void verifySelectedProduct() {
		CheckOut.verifySelectedProduct(productCode[0]);
	}

	@Then("I will check for availibility in area using zipcode")
	public void checkAvailiability() throws ParseException {
		productArea = CheckOut.validateEnterZipCode();
	}

	@And("I will click on proceed Button")
	public void clickProceedButton() {
		CheckOut.clickProceedButton();
	}

	@Then("I will navigate to Cart Page")
	public void verifyCartPage() {
		CheckOut.verifyCartPage();
	}

	@And("I should able to see the price, product code which is selected")
	public void verifyProduct() {
		CheckOut.verifyProducDetails(productCode[0], productCode[1]);
	}

	@And("I should able to see the Need help section at the bottom")
	public void verifyHelpSection() {
		CheckOut.verifyHelpSection();
	}

	@When("I click on secure checkout Button")
	public void clickCheckoutButton() {
		CheckOut.clickCheckOut();
	}

	@Then("I should navigate to Sign In Page")
	public void verifySignInPage() {
		CheckOut.verifySignInPage();
	}

	@When("I click on continue as guest")
	public void clickContinueButton() {
		CheckOut.clickContinue();
	}

	@Then("I should navigate to Contact Information Page")
	public void verifyContactInfoPage() {
		CheckOut.verifyContactInfoPage();
	}

	@And("I will enter contact Information details")
	public void enterContactInfo() {
		// Enter fake email address
		GlobalTestData.GLOBAL_CUSTOMER_EMAIL = faker.internet().safeEmailAddress();
		GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME = CheckOut.getAlphaNumericString(4);
		GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME = CheckOut.getAlphaNumericString(4);
		String address = "";
		String city = "";
		String state = "";
		String zipcode = "";
		if (productArea.contains("CA")) {
			address = GlobalTestData.GLOBAL_CA_ADDRESS1;
			city = GlobalTestData.GLOBAL_CA_CITY;
			state = GlobalTestData.GLOBAL_CA_STATE;
			zipcode = GlobalTestData.GLOBAL_CA_ZIPCODE;
		} else if (productArea.contains("NY")) {
			address = GlobalTestData.GLOBAL_NY_ADDRESS1;
			city = GlobalTestData.GLOBAL_NY_CITY;
			state = GlobalTestData.GLOBAL_NY_STATE;
			zipcode = GlobalTestData.GLOBAL_NY_ZIPCODE;
		} else if (productArea.contains("TX")) {
			address = GlobalTestData.GLOBAL_TX_ADDRESS1;
			city = GlobalTestData.GLOBAL_TX_CITY;
			state = GlobalTestData.GLOBAL_TX_STATE;
			zipcode = GlobalTestData.GLOBAL_TX_ZIPCODE;
		}
		CheckOut.enterContactInformation(GlobalTestData.GLOBAL_CUSTOMER_EMAIL,
				GlobalTestData.GLOBAL_CUSTOMER_PHONE_NUMBER, GlobalTestData.GLOBAL_CUSTOMER_FIRST_NAME,
				GlobalTestData.GLOBAL_CUSTOMER_LAST_NAME, address, city, state, zipcode);
	}

	@When("I click on Save and Continue Button")
	public void clickSave() {
		CheckOut.clickSave();
	}

	@And("I click on Use This Address Button")
	public void clickUseAddress() {
		CheckOut.clickUseAddress();
	}
	
	@Then("I should navigate to shipping page")
	public void verifyShippingInfoPage() {
		CheckOut.verifyShippingInfoPage();
	}
	
	@And("I click on continue payment Button")
	public void clickContinuePayment() throws InterruptedException {
		CheckOut.clickContinuePayment();
	}
	
	@Then("I should navigate to payment page")
	public void verifyPaymentInfoPage() {
		CheckOut.verifyPaymentInfoPage();
	}
	
	@And("I click on Klarna as payment method")
	public void selectPaymentMethod() throws InterruptedException {
		CheckOut.selectPaymentMethod("Buy Now. Pay Later");
	}
	
	@When("I click on Review and Place Order")
	public void clickReviewPlaceOrder() {
		CheckOut.clickReviewPlaceOrder();
	}
	
	@And("I click on Terms and conditions checkBox")
	public void clickTermsConditions() throws InterruptedException {
		CheckOut.clickTermsConditions();
	}
	
	@Then("I click on Place Order Button")
	public void clickPlaceOrder() {
		CheckOut.clickPlaceOrder();
	}
	
}
