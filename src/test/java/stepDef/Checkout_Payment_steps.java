package stepDef;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_Payment_page;

public class Checkout_Payment_steps extends Setup {
    Checkout_Payment_page Payment = new Checkout_Payment_page(driver);
    String PaymentMethod;

    @Then("I will see Payment method option list in Billing Page")
    public void iWillSeePaymentMethodOptionListInBillingPage() {
        Payment.verifyPaymentInfoPage();
    }

    @When("^I choose the \"([^\"]*)\" radio button from Billing Page$")
    public void iChoosePaymentRadioButton(String paymentMethod) throws InterruptedException {
        Thread.sleep(5000);
        if (paymentMethod.equalsIgnoreCase("Klarna")) {
            Payment.selectPaymentMethodFromBillingPage("Buy Now. Pay Never in STG.");
            PaymentMethod = "Buy Now. Pay Never in STG.";
        } else if (paymentMethod.equalsIgnoreCase("Credit Card")) {
            Payment.selectPaymentMethodFromBillingPage("Credit or Debit Card");
            PaymentMethod = "Credit or Debit Card";
        } else if (paymentMethod.equalsIgnoreCase("Paypal")) {
            Payment.selectPaymentMethodFromBillingPage("Paypal");
            PaymentMethod = "Paypal";
        }
    }

    @Then("I will enter Card Details")
    public void iWillEnterCreditCardDetails() {
        Payment.enterCardDetails(GlobalTestData.VISA_CARD_NO, GlobalTestData.VISA_EXP_NO, GlobalTestData.VISA_CVV);
    }

    @Then("I will enter Card Details with Invalid Visa Expiration date")
    public void i_will_enter_card_details_with_invalid_visa_expiration_date() {
        Payment.enterCardDetails(GlobalTestData.VISA_CARD_NO, GlobalTestData.VISA_EXP_INVALIDDATE, GlobalTestData.VISA_CVV);
    }

    @Then("I will enter Master Credit Card Details")
    public void iWillEnterMasterCreditCardDetails() {
        Payment.enterCardDetails(GlobalTestData.MASTER_CARD_NO, GlobalTestData.MASTER_EXP_NO, GlobalTestData.MASTER_CVV);
    }

    @Then("I will enter JCB Card Details with valid Details")
    public void iWillEnterJCBCreditCardDetails() {
        Payment.enterCardDetails(GlobalTestData.JCB_CARD_NO, GlobalTestData.MASTER_EXP_NO, GlobalTestData.MASTER_CVV);
    }

    @Then("I will enter Amex Credit Card Details")
    public void iWillEnterAmexCreditCardDetails() {
        Payment.enterCardDetails(GlobalTestData.AMEX_CARD_NO, GlobalTestData.AMEX_EXP_NO, GlobalTestData.AMEX_CVV);
    }

    @And("I click on Review and Place order button from Billing Page")
    public void iClickOnReviewAndPlaceOrderButton() {
        Payment.clickReviewPlaceOrderButtonFromBillingPage(PaymentMethod);
    }

    @Then("I Enter Klarna SSN Details")
    public void iEnterKlarnaDetails() throws InterruptedException {
        Payment.enterKlarnaDetails();
    }

    @Then("I click on {string} link on checkout page")
    public void clickLinkOnCheckoutPage(String linkText) {
        GenericFunctions.click(linkText);
    }

    @Then("I verify the error message for Visa Expiration date")
    public void i_verify_the_error_message_for_visa_expiration_date() {
        Payment.verifyErrorMessageForVisaExpirationDate();
    }

    @Then("I verify the error message for Credit Card Type")
    public void i_verify_the_error_message_for_Credit_Card_Type() {
        Payment.verifyErrorMessageForCreditCardType();
    }

    @Then("I verify System should display CVV UI demo with VISA, MC, DISCOVER and AMEX card")
    public void i_verify_CVV_Demo() {
        Payment.verifyCVVDemo();
    }

    @Then("I click on continue button on checkout page")
    public void iClickOnContinue() {
        Payment.clickContinueButton();
    }

    @Then("I verify credit or debit card radio button selected")
    public void verifyCreditDebitCardIsSelected() {
        Payment.verifyDebitCardSelected();
    }

    @And("I click on confirm button")
    public void clickOnConfirmBtn() {
        Payment.clickOnConfirmButton();
    }

    @And("I click on checkBox in review terms and apply page")
    public void clickOnCheckBox() {
        Payment.clickOnReviewTeamAgreeCheckBox();
    }

    @And("I click on agree and Submit button in review terms and apply page")
    public void clickOnAgreeAndSubmitBtn() throws InterruptedException {
        Payment.clickOnAgreeAndSubmit();

    }

    @Then("I verify Your tailored plan is displayed")
    public void iVerifyTailoredPlanPage() {
        Payment.verifyTailoredPlanIsDisplay();
    }

    @Then("I verify Review terms and apply is displayed")
    public void iVerifyReviewTermsPage() {
        Payment.verifyReviewTermsIsDisplay();
    }

    @And("I verify your Detail page and Input phone  number")
    public void inputPhoneNumber() throws InterruptedException {
        Payment.verifyYourDetailAndEnterPhoneNumberDisplay();
        Payment.clickCheckBox();
        Payment.clickOnContinueBtn();
    }

    @Then("I enter the code")
    public void enterTheCode() {
        Payment.enterCode();
    }

    @And("I click on confirm and continue button")
    public void clickOnConfirmAndContinueButton() throws InterruptedException {
        Payment.clickOnConfirmAndContinueBtn();

    }

    @And("I verify Estimated Tax in Order Summary on checkout page")
    public void iVerifyEstimatedTax() {
        Payment.iVerifyEstimatedTax();
    }

    @Then("I verify {string} Pop up page is displayed")
    public void verifyPopUpPageIsDisplayed(String message) {
        GenericFunctions.verifyElementByText(message);
    }

    @And("I click Where is my Security Code? link from Billing Page")
    public void iClickWhereIsMySecurityCodeLink() {
        GenericFunctions.click("Where is my Security Code?");
    }
}
