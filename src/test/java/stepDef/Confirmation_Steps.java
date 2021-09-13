package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import pageObject.Confirmation_page;

public class Confirmation_Steps extends Setup {
    Confirmation_page Confirmation = new Confirmation_page(driver);

    @Then("I verify confirmation page is displayed")
    public void iVerifyThankYouPage() throws InterruptedException {
        Thread.sleep(5000);
        Confirmation.verifyThanksYouIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyOrderNumberIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyOrderSummaryIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyYourOrderSectionIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyEsitateddateofdeliveryIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyShippingIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyBillingIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyNeedHelpIsDisplay();
        Thread.sleep(1000);
    }
}
