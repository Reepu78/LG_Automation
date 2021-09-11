package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.Confirmation_page;
import pageObject.PLP_page;
import pageObject.Search_page;

public class Confirmation_Steps extends Setup {
	Cart_page CART = new Cart_page(driver);
	Search_page SEARCH = new Search_page(driver);
	Confirmation_page Confirmation = new Confirmation_page(driver);

	
    //Steps
	@Then("I verify confirmation page is displayed")
	public void iVerifyThankyouPage() throws InterruptedException {
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
