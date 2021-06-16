package stepDef;

import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.Checkout_page;

public class Cart_Steps extends Setup {
	Checkout_page CheckOut = new Checkout_page(driver);
	Cart_page Cart = new Cart_page(driver);

	@SuppressWarnings("static-access")
	@When("I enter zipCode to check the delivery availability")
	public void iEnterZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
		Cart.verifyZipCodePage();
		Cart.verifySelectedProduct(Cart.productCode[0]);
		Cart.productArea = Cart.validateEnterZipCode();
		Cart.clickProceedButton();
	}
	
	@When("I will enter zipCode to check the delivery availability")
	public void iZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
		Cart.verifySelectedProduct(Cart.productCode[0]);
		Cart.productArea = Cart.validateEnterZipCode();
	}

	@SuppressWarnings("static-access")
	@Then("I will verify product is added into Cart Page")
	public void iWillSeeProductWillBeAddedIntoCartPage() {
		Cart.verifyCartPage();
		Cart.verifyProducDetails(Cart.productCode[0], Cart.productCode[1]);
		Cart.verifyHelpSection();
	}

	@When("I click on Secure Checkout button")
	public void iClickOnSecureCheckoutButton() {
		Cart.clickSecureCheckOut();
	}

	@And("I click on Continue as Guest from Sign in page")
	public void iClickOnContinueAsGuestFromSignInPage() {
		Cart.verifySignInPage();
		Cart.clickContinueAsGuest();
	}
	
	@When("I will enter promocode")
	public void I_will_enter_promocode() throws InterruptedException {
		Cart.enterPromoCode(GlobalTestData.PROMO_CODE);
		Cart.clickApplyButton();
	}

	@Then("I should able to use promo code")
	public void I_should_able_to_use_promo_code() throws InterruptedException {
		Cart.verifyPromoCode();
	}
	
	@When("I will remove promocode")
	public void I_will_remove_promocode() throws InterruptedException {
		Cart.clickRemovePromoCode();
	}

	@Then("I should able to remove promo code")
	public void I_should_able_to_remove_promo_code() throws InterruptedException {
		Cart.verifyRemovePromoCode();
	}


}
