package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
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
        Confirmation.verifyEstimatedDateOfDeliveryIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyShippingIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyBillingIsDisplay();
        Thread.sleep(1000);
        Confirmation.verifyNeedHelpIsDisplay();
        Thread.sleep(1000);
    }
    
    @And("I Create an account and click On Terms and Conditions Check Box On Confirmation Page")
    public void iClickOnTermsAndConditionsCheckBoxAfterCreateAndAccount() {
    	Confirmation.createAnAccount();
    	Confirmation.enterDateOfBirth();
    	Confirmation.clickOnTermsAndConditionsCheckBoxAndandCreateAccountBtn();
    	
    }
    
    @And("I verify your account has been created massage is display")
    public void verifyYourCreatedAnAccountMessage(){
    	Confirmation.createAnAccountMessageIsDisplay();
    }
    
}
