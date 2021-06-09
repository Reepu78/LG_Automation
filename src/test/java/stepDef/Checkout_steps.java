package stepDef;


import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_page;

import java.text.ParseException;

public class Checkout_steps extends Setup {
	Checkout_page CheckOut = new Checkout_page(driver);

	@Given("I am able to add an HE OMD Innoval product from PLP")
	public void iAmAbleToClickATCButtonForHEOMDInnovalProduct() throws ParseException, InterruptedException {
		CheckOut.mouseOverTVLink();
		CheckOut.clickOLEDSection();
		CheckOut.verifyOLEDPage();
		CheckOut.verifyOLEDTV();
		CheckOut.productCode = CheckOut.addCartHighPrice().split("#");
	}

	@When("I enter zipCode to check the delivery availability")
	public void iEnterZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
		CheckOut.verifyZipCodePage();
		CheckOut.verifySelectedProduct(CheckOut.productCode[0]);
		CheckOut.productArea = CheckOut.validateEnterZipCode();
		CheckOut.clickProceedButton();
	}

	@Then("I will verify product is added into Cart Page")
	public void iWillSeeProductWillBeAddedIntoCartPage() {
		CheckOut.verifyCartPage();
		CheckOut.verifyProducDetails(CheckOut.productCode[0], CheckOut.productCode[1]);
		CheckOut.verifyHelpSection();

	}

	@When("I click on Secure Checkout button")
	public void iClickOnSecureCheckoutButton() {
		CheckOut.clickSecureCheckOut();
	}

	@And("I click on Continue as Guest from Sign in page")
	public void iClickOnContinueAsGuestFromSignInPage() {
		CheckOut.verifySignInPage();
		CheckOut.clickContinueAsGuest();
	}

	@And("I click on Save and Continue button after fill out Shipping Info")
	public void iClickOnSaveAndContinueButtonAfterFillOutShippingInfo() throws InterruptedException {
		CheckOut.verifyContactInfoPage();
		CheckOut.enter_contact_shipping_info();
		CheckOut.clickSaveAndContinueButtonFromShippingPage();
	}

	@And("I verify the suggested address")
	public void iVerifyTheSuggestedAddress() throws InterruptedException {
		CheckOut.clickUseThisAddressButton();
	}

	@When("I click on Continue to Payment button")
	public void iClickOnContinueToPaymentButton() throws InterruptedException {
		CheckOut.verifyShippingInfoPage();
		CheckOut.clickContinuePaymentButtonFromShippingPage();
	}

	@Then("I will see Payment method option list in Billing Page")
	public void iWillSeePaymentMethodOptionListInBillingPage() {
		CheckOut.verifyPaymentInfoPage();
	}

	@When("I choose the Klarna radio button from Billing Page")
	public void iChooseTheKlarnaRadioButton() throws InterruptedException {
		CheckOut.selectPaymentMethodFromBillingPage("Buy Now. Pay Later");
	}

	@And("I click on Review and Place order button from Billing Page")
	public void iClickOnReviewAndPlaceOrderButton() {
		CheckOut.clickReviewPlaceOrderButtonFromBillingPage();
	}

	@And("I click on Place Order button after agreeing Terms and Conditions from Review Page")
	public void iClickOnTermsAndConditionsCheckbox() throws InterruptedException {
		CheckOut.clickTermsConditionsFromReviewPage();
		CheckOut.clickPlaceOrderButtonFromReviewPage();
	}
}
