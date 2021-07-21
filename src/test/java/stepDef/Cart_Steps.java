package stepDef;

import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;

public class Cart_Steps extends Setup {
	Cart_page CART = new Cart_page(driver);
	public static String initialPrice = "";
	public String qty = "";
	public String tax1 = "";
	public String tax2 = "";

	@SuppressWarnings("static-access")
	@When("I enter zipCode to check the delivery availability")
	public void iEnterZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode();
		CART.clickProceedButton();
	}
	
	@SuppressWarnings("static-access")
	@When("I will enter zipCode to check the delivery availability")
	public void iEnterZipCodeTheDeliveryAvailability() throws InterruptedException {
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode();
	}

	@When("^I enter zipCode to check the delivery availability for \"([^\"]*)\"$")
	public void iZipCodeToCheckTheDeliveryAvailability(String stateName) throws InterruptedException {
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode(stateName);
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HE Innovel Product")
	public void iZipCodeToCheckTDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_HE_Innovel);
		CART.productArea = CART.validateEnterZipCode();
		Thread.sleep(500);
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HA Innovel Product")
	public void iZipCodeCheckTDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_HA_Innovel);
		CART.productArea = CART.validateEnterZipCode();
		Thread.sleep(500);
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD Klarna enabled Product")
	public void iZipCodeDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_KLARNA);
		CART.productArea = CART.validateEnterZipCode();
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HE Non Innovel Product")
	public void iZipCodeCheckDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.clickProceedCart();
	}

	@SuppressWarnings("static-access")
	@Then("I will verify product is added into Cart Page")
	public void iWillSeeProductWillBeAddedIntoCartPage() {
		CART.verifyCartPage();
		CART.verifyProductDetails(CART.productCode[0], Cart_Steps.initialPrice);
		CART.verifyHelpSection();
	}

	@When("I click on Secure Checkout button")
	public void iClickOnSecureCheckoutButton() {
		CART.clickSecureCheckOut();
	}

	@And("I click on Continue as Guest from Sign in page")
	public void iClickOnContinueAsGuestFromSignInPage() {
		CART.verifySignInPage();
		CART.clickContinueAsGuest();
	}

	@When("I will enter promo code")
	public void I_will_enter_promocode() throws InterruptedException {
		CART.enterPromoCode(GlobalTestData.PROMO_CODE);
		CART.clickApplyButton();
	}

	@Then("I should able to use promo code")
	public void I_should_able_to_use_promo_code() throws InterruptedException {
		CART.verifyPromoCode();
	}

	@When("I will remove promo code")
	public void I_will_remove_promocode() throws InterruptedException {
		CART.clickRemovePromoCode();
	}

	@Then("I should able to remove promo code")
	public void I_should_able_to_remove_promo_code() throws InterruptedException {
		CART.verifyRemovePromoCode();
	}

	@When("^I will select the \"([^\"]*)\" as quantity$")
	public void I_will_select_quantity(String quantity) throws InterruptedException {
		/*
		 * if (initialPrice.equalsIgnoreCase("")) { initialPrice = CART.getPrice(); }
		 */
		CART.selectQuantity(quantity);
		qty = quantity;
	}

	@When("I should able to see the updated price as per quantity")
	public void iVerifyPrice() throws InterruptedException {
		CART.verifyPrice(initialPrice, qty);
	}

	@And("I should be able to see Estimated Price and Order Total")
	public void VerifyPrice() throws InterruptedException {
		CART.verifyEstimatedTax();
		CART.verifyTotalTax();
	}

	@And("I should be able to see Estimated Tax Price")
	public void VerifyEstimatedTax() throws InterruptedException {
		CART.verifyEstimatedTax();
		if (tax1.equalsIgnoreCase("")) {
			tax1 = CART.getEstimatedTax();
		} else {
			tax2 = CART.getEstimatedTax();
		}

	}
	
	@Then("I should able see Hawaii estimated tax less than New York estimated tax")
	public void CompareEstimatedTax() throws InterruptedException {
	CART.compareEstimatedTax(tax1, tax2);	
	}

	@Then("I click on Add to Cart Button under Recommendations")
	public void clickAddCart() throws InterruptedException {
		CART.clickAddCartRecommendation();
	}

	@And("I click on Add to Cart Button under Accessories")
	public void clickAddToCart() throws InterruptedException {
		CART.clickAddCartAccessories();
	}

	@Then("I click on Remove Item Button")
	public void clickRemoveItem() throws InterruptedException {
		CART.clickRemoveItem();
	}

	@And("I will update the Delivery Frequency date to sixMonths")
	public void iWillUpdateTheDeliveryFrequencyDateToMonths() {
		CART.enterDeliveryFrequency("6 months");
	}

	@When("I will accept the alert")
	public void iWillAcceptTheAlert() throws InterruptedException {
		CART.acceptAlert();

	}

	@Then("I should see the updated Delivery Frequency date is reflected")
	public void iShouldSeeTheUpdatedDeliveryFrequencyDateIsReflected() {
		CART.verifySixMonthsDeliveryFrequencyIsSelected();
	}
}
