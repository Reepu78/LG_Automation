package stepDef;

import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_Paypal_page;

public class Checkout_Paypal_steps extends Setup {
    Checkout_Paypal_page Paypal = new Checkout_Paypal_page(driver);

    @When("I will click on Paypal Pay with Debit or Credit Card Button")
    public void iClickPaypalPayWithDebitCreditCard() throws InterruptedException {
        Paypal.clickPayButton();
    }

    @Then("I will enter card Details on Paypal Page")
    public void iEnterCardDetails() {
        Paypal.enterCardDetails(GlobalTestData.VISA_CARD_NO, GlobalTestData.VISA_EXP_NO, GlobalTestData.VISA_CVV);
    }

    @Then("I will enter contact Details on Paypal Page")
    public void iEnterContactDetails() {
        Paypal.enter_contact_shipping_info();
    }

    @And("I will click on Continue button")
    public void iClickContinueButton() throws InterruptedException {
        Paypal.clickContinueButton();
    }


}
