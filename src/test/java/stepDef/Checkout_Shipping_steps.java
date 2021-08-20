package stepDef;


import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import base.GenericFunctions;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_Shipping_page;


public class Checkout_Shipping_steps extends Setup {
	Checkout_Shipping_page Shipping = new Checkout_Shipping_page(driver);
	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

	@And("I click on Save and Continue button after fill out Shipping Info")
	public void iClickOnSaveAndContinueButtonAfterFillOutShippingInfo() throws InterruptedException {
		Shipping.verifyContactInfoPage();
		Shipping.enter_contact_shipping_info();
		Shipping.clickSaveAndContinueButtonFromShippingPage();
	}

	@And("I verify the suggested address")
	public void iVerifyTheSuggestedAddress() throws InterruptedException {
		Shipping.clickUseThisAddressButton();
	}
	
	@Then("^I will select the \"([^\"]*)\" shipment Method$")
	public void iwillselectshipmentMethod(String shippingMethod) throws InterruptedException {
		Shipping.selectShippingMethod(shippingMethod);
	}
	
	@When("I click on Continue to Payment button")
	public void iClickOnContinueToPaymentButton() throws InterruptedException {
		Shipping.verifyShippingInfoPage();
		Shipping.clickContinuePaymentButtonFromShippingPage();
	}

	
	@And("I click {string} button on checkout page")
	public void useADifferentBillingAddress(String linkName) throws InterruptedException {
		Thread.sleep(2000);
		Shipping.click(linkName);
	}
	
	@And("I enter different Address in Use a different billing address section")
	public void enterDifferentAddress() throws InterruptedException {
		Shipping.enterNewAddressOnPaymentPage();
	}
	
	@And("I edit the address and click on Save and Continue")
	public void updateAddress() throws InterruptedException {
		Shipping.verifyContactInfoPage();
		Shipping.update_Shipping_Info();
		Shipping.clickSaveAndContinueButtonFromShippingPage();
	}
	
	@And("I verify System should navigate the Shipping page")
	public void verifyShippingPage() throws InterruptedException {
		Shipping.verifyContactInfoPage();
	}

	@When("I click Save and Continue after updating email and phone number on shipping page")
	public void updateContactInfo() throws InterruptedException {
		Shipping.verifyContactInfoPage();
		Shipping.update_Contact_Info();
		Shipping.clickSaveAndContinueButtonFromShippingPage();
	}
	
	@And("I verify header section is displayed on shipping page")
	public void verifyHeaderSection() throws InterruptedException {
		Shipping.verifyHeader();
	}
	
	@When("I click on Call Number")
	public void clickCallNumber() throws InterruptedException {
		Shipping.HELPLINE_NO.click();
	}
	
	@When("I click on Cart icon")
	public void clickCartIcon() throws InterruptedException {
		Shipping.CART_ICON.click();
	}
	
	@Then("I verify System is showing Make a call from popup")
	public void verifyMakeACallPopUp() throws InterruptedException {
		//wait.until(ExpectedConditions.alertIsPresent());
		String expectedMessage = "https://www.lg.com wants to open this application.";
		assertEquals(driver.switchTo().alert().getText(), expectedMessage);
	}
	
	@And("I verify footer section is displayed on shipping page")
	public void verifyfooterSection() throws InterruptedException {
		Shipping.verifyFooter();
	}
	
	@Then("I verify the FAQ tab")
	public void verifyFAQTab() {
		Shipping.verifyFAQTab();
	}
	
	@When("I click on footer Call Number")
	public void clickFooterCallNumber() throws InterruptedException {
		Shipping.FOOTER_CALLUS.click();
	}

}
