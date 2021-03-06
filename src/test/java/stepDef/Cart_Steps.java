package stepDef;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.PLP_page;
import pageObject.Search_page;

import org.testng.Assert;

public class Cart_Steps extends Setup {
    Cart_page CART = new Cart_page(driver);
    Search_page SEARCH = new Search_page(driver);
    PLP_page PLP = new PLP_page(driver);
    public static String initialPrice = "";
    public String qty = "";
    public String tax1 = "";
    public String tax2 = "";
    public static String[] priceBreakdown;
    public static String firstAccessory = "";

    @SuppressWarnings("static-access")
    @When("I enter ZipCode to check the delivery availability")
    public void iEnterZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
        CART.verifyZipCodePage();
        CART.verifySelectedProduct(CART.productCode[0]);
        CART.productArea = CART.validateEnterZipCode();
        CART.clickProceedButton();
    }

    @SuppressWarnings("static-access")
    @When("I will enter ZipCode to check the delivery availability")
    public void iEnterZipCodeTheDeliveryAvailability() throws InterruptedException {
        CART.verifySelectedProduct(CART.productCode[0]);
        CART.productArea = CART.validateEnterZipCode();
    }

    @When("^I enter ZipCode to check the delivery availability for \"([^\"]*)\"$")
    public void iZipCodeToCheckTheDeliveryAvailability(String stateName) throws InterruptedException {
        Thread.sleep(2000);
        CART.verifySelectedProduct(Cart_page.productCode[0]);
        Thread.sleep(2000);
        Cart_page.productArea = CART.validateEnterZipCode(stateName);
        Thread.sleep(2000);
    }

    @When("I will enter ZipCode for checking the delivery availability for OMD HE Innovel Product")
    public void iZipCodeToCheckTDeliveryAvailability() throws InterruptedException {
        CART.clickAddCartButton();
        CART.verifyZipCodePage();
        CART.verifySelectedProduct(GlobalTestData.OMD_HE_Innovel);
        Cart_page.productArea = CART.validateEnterZipCode();
        Thread.sleep(5000);
        CART.clickProceedButton();
    }

    @When("I will enter ZipCode for checking the delivery availability for OMD HA Innovel Product")
    public void iZipCodeCheckTDeliveryAvailability() throws InterruptedException {
        CART.clickAddCartButton();
        CART.verifyZipCodePage();
        CART.verifySelectedProduct(GlobalTestData.OMD_HA_Innovel);
        Cart_page.productArea = CART.validateEnterZipCode();
        CART.clickProceedButton();
    }

    @When("I will enter ZipCode for checking the delivery availability for OMD Klarna enabled Product")
    public void iZipCodeDeliveryAvailability() throws InterruptedException {
        CART.clickAddCartButton();
        CART.verifyZipCodePage();
        CART.verifySelectedProduct(GlobalTestData.OMD_KLARNA);
        Cart_page.productArea = CART.validateEnterZipCode();
        CART.clickProceedButton();
    }

    @When("I will enter ZipCode for checking the delivery availability for OMD HE Non Innovel Product")
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
    public void iClickOnSecureCheckoutButton() throws InterruptedException {
        CART.clickSecureCheckOut();
    }

    @And("I click on Continue as Guest from Sign in page")
    public void iClickOnContinueAsGuestFromSignInPage() {
        CART.verifySignInPage();
        CART.clickContinueAsGuest();
    }

    @When("I will enter promo code")
    public void I_will_enter_promoCode() throws InterruptedException {
        CART.enterPromoCode();
        CART.clickApplyButton();
    }

    @Then("I should able to use promo code")
    public void I_should_able_to_use_promo_code() {
        CART.verifyPromoCode();
    }

    @When("I will remove promo code")
    public void I_will_remove_promo_code() throws InterruptedException {
        CART.clickRemovePromoCode();
    }

    @Then("I should able to remove promo code")
    public void I_should_able_to_remove_promo_code() {
        CART.verifyRemovePromoCode();
    }

    @When("^I will select the \"([^\"]*)\" as quantity$")
    public void I_will_select_quantity(String quantity) throws InterruptedException {
        CART.selectQuantity(quantity);
        qty = quantity;
    }

    @When("I should able to see the updated price as per quantity")
    public void iVerifyPrice() {
        CART.verifyPrice(initialPrice, qty);
    }

    @And("I should be able to see Estimated Price and Order Total")
    public void VerifyPrice() {
        CART.verifyEstimatedTax();
        CART.verifyTotalTax();
    }

    @And("I should be able to see Estimated Tax Price")
    public void VerifyEstimatedTax() {
        CART.verifyEstimatedTax();
        if (tax1.equalsIgnoreCase("")) {
            tax1 = CART.getEstimatedTax();
        } else {
            tax2 = CART.getEstimatedTax();
        }
    }

    @Then("I should able see Hawaii estimated tax less than New York estimated tax")
    public void CompareEstimatedTax() {
        CART.compareEstimatedTax(tax1, tax2);
    }

    @Then("I click on Add to Cart Button under Recommendations")
    public void clickAddCart() {
        CART.clickAddCartRecommendation();
    }

    @And("I click on Add to Cart Button under Accessories")
    public void clickAddToCart() {
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

    @Given("I enter OMV subscription product Code into search edit box from GNB")
    public void iSearchForOMVSubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Subscription);
    }

    @And("I add OMV Non Subscription Product into cart")
    public void iWillAddOMVNonSubscriptionProductIntoCart() throws InterruptedException {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Non_Subscription);
        SEARCH.clickSearchIconFromGNB();
        SEARCH.addCartProduct(GlobalTestData.OMV_Non_Subscription);
        SEARCH.clickViewCartButtonFromModal();
    }

    @Then("^I add OMV Subscription product into cart with frequency of \"([^\"]*)\"$")
    public void iAddOMVSubscriptionProductIntoCart(String frequency) throws InterruptedException {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Subscription);
        SEARCH.clickSearchIconFromGNB();
        SEARCH.addCartProduct(GlobalTestData.OMV_Subscription);
        Cart_page.productCode[0] = GlobalTestData.OMV_Subscription;
        PLP.selectSubscription(frequency);
        PLP.clickProceedButton();
    }

    @And("^I will have \"([^\"]*)\" items in cart$")
    public void iWillHaveTwoItemsInCart(String itemCounts) throws InterruptedException {
        CART.verifyItemCountsInCartPage(itemCounts);
    }

    @When("I removed first item from the cart list")
    public void iRemovedFirstItemFromTheCartList() throws InterruptedException {
        CART.clickRemoveItemLink();
    }


    @When("I Verify {string} item is added to the cart")
    public void clickAddToCartButton(String noOfItems) throws InterruptedException {
        CART.validateItemAddedToCart(noOfItems);
    }

    @And("I Click on {string} link/button")
    public void clickItem(String linkName) throws InterruptedException {
        CART.click(linkName);
    }

    @And("I Click on {string} link/button from PDP page")
    public void clickItemPDP(String linkName) throws InterruptedException {
        CART.click(linkName);
    }

    @Then("Your cart is Empty message should display along with SEE ALL DEALS button")
    public void yourCartIsEmptyMessageShouldBeDisplayed() {
        CART.verifyEmptyCartMessage();
    }

    @And("I Select Subscription as {string}")
    public void selectSubscriptionType(String subscriptionType) throws InterruptedException {
        CART.click(subscriptionType);
    }

    @And("I Input ZipCode on price breakdown section and verify estimated tax is calculated")
    public void inputZIPCodeInPriceBreakdown() throws InterruptedException {
        priceBreakdown = CART.inputZipcodeVerifyPriceBreakdown(Cart_page.productArea);
    }

    @Then("I verify Order summary section price break down is correct")
    public void verifyPriceBreakdown() {
        Assert.assertEquals(CART.CART_PRODUCTPRICE.getText(), CART.CART_AMOUNTS.get(0).getText());
    }

    @When("I Enter valid PromoCode under Promo Edit box")
    public void enterPromoCode() {
        CART.enterPromoCode();
    }

    @Then("I Should see a validation message saying You used promotion code and Discount and Total price should reflect")
    public void verifyPromoCode() {
        CART.validateApplyPromoCode(GlobalTestData.PROMO_CODE);
        CART.validateDiscountedPrice();
    }

    @Then("I verify {string} is displayed and discount is removed")
    public void verifyPromoCancelled(String message) {
        CART.validateCancelPromoCode(message);
    }

    @Then("I verify {string} is displayed")
    public void verifyElementIsDisplayed(String message) {
        GenericFunctions.verifyElementByText(message);
    }

    @Then("I verify {string} is not displayed")
    public void verifyElementNotDisplayed(String text) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(GenericFunctions.verifyElementIsNotDisplayedByText(text));
    }

    @And("I Enter an invalid zip code {string} under Shipping zip code Field")
    public void enterInvalidShippingZipCode(String zip) {
        CART.enterZipCode(zip);
    }

    @SuppressWarnings("static-access")
    @When("I enter ZipCode to check the delivery availability for {string} product")
    public void iEnterZipCodeToCheckTheDeliveryAvailabilityFor(String product) throws InterruptedException {
        CART.verifyZipCodePage();
        CART.verifySelectedProduct(GenericFunctions.getData(product));
        CART.productArea = CART.validateEnterZipCode();
        CART.clickProceedButton();
    }

    @And("I Click on {string} button for the first Accessory")
    public void recordFirstAccessoryAndAddToCart() throws InterruptedException {
        firstAccessory = CART.readFirstAccessory();
        CART.click("AddAccessoryToCart");
    }

    @And("I verify the Accessory added to cart is still displayed")
    public void verifyAccessoryIsDisplayed() {
        String accessory = CART.readFirstAccessory();
        firstAccessory = CART.readFirstAccessory();
        Assert.assertEquals(accessory, firstAccessory);
    }

    @Then("I verify Price Breakdown Order Summary section on cart page")
    public void verifyOrderSummaryPriceBreakdown() {
        CART.verifyPriceBreakdown();
    }

    @When("I update product quantity to {string}")
    public void updateProductQuantity(String qty) {
        CART.updateProductQuantity(qty);
    }

    @And("I click on close pop up page")
    public void clickOnClosePopUpPage() {
        CART.iClickOnCloseBtn();
    }

    @When("I Enter Invalid PromoCode under Promo Edit box")
    public void iEnterInvalidPromoCode() {
        CART.enterInvalidPromoCode();
    }
    @And("I verify promo price is displayed for the promo product")
	public void verifyPromoPriceIsDisplayed() {
	CART.verifySavePrice();
	}
}
