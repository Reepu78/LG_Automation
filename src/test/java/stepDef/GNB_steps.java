package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GNB_page;

import java.util.Iterator;
import java.util.Set;

public class GNB_steps extends Setup {
    GNB_page GNB = new GNB_page(driver);

    @Given("I am at LG Home Page")
    public void homePage() {
        if (Hook.baseURL.equals("stg")) {
            GNB.stagingHome();
            GNB.authenticationCode();
        } else {
            Set<String> winIds = driver.getWindowHandles();
            System.out.println("Total windows -> " + winIds.size());
            if (winIds.size() == 2) {
                Iterator<String> iter = winIds.iterator();
                String mainWinID = iter.next();
                String popupWindID = iter.next();
                driver.switchTo().window(popupWindID);
                driver.close();
                driver.switchTo().window(mainWinID);
            }
        }

    }

    @Given("I came to Signup page from GNB")
    public void imInSignUpPage() {
        GNB.clickOnMyAccountIconFromGNB();
        GNB.clickSignInSignUpLinkFromGNB();
    }

    @And("I navigates to LG Sign Up page")
    public void iNavigatesToLGSignUpPage() {
        driver.navigate().to(Hook.url);
        GNB.clickOnMyAccountIconFromGNB();
        GNB.clickSignInSignUpLinkFromGNB();
    }

    @Given("I am at shop page")
    public void iAmAtShopPage() throws InterruptedException {
        GNB.clickOnCartIcon();
    }

    @When("I click on AUDIO link from GNB")
    public void iClickOnAudioLinkFromGNB() {
        GNB.clickAudioLinkFromGNB();
    }

    @Then("I should navigate to AUDIO landing page")
    public void iShouldNavigateToMobileLandingPage() throws InterruptedException {
         GNB.verifyAudioLandingPage();
    }

    @When("^I click on TV\\/VIDEO link from GNB")
    public void iClickOnTVVIDEOLinkFromGNB() {
        GNB.clickTV_VideoLinkFromGNB();
    }

    @Then("^I should navigate to TV\\/VIDEO landing page")
    public void iShouldNavigateToTVVIDEOLandingPage() throws InterruptedException {
        GNB.verifyTV_VIDEOLandingPage();
    }

    @When("I click on KITCHEN link from GNB")
    public void iClickOnKITCHENLinkFromGNB() {
        GNB.clickKitchenLinkFromGNB();
    }

    @Then("I should navigate to KITCHEN landing page")
    public void iShouldNavigateToKITCHENLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifyKitchenLandingPage();
    }

    @When("I click on LAUNDRY link from GNB")
    public void iClickOnLAUNDRYLinkFromGNB() {
        GNB.clickLaundryLinkFromGNB();
    }

    @Then("I should navigate to LAUNDRY landing page")
    public void iShouldNavigateToLAUNDRYLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifyLaundryLandingPage();
    }

    @When("I click on OTHER APPLIANCES link from GNB")
    public void iClickOnOTHERAPPLIANCESLinkFromGNB() {
        GNB.clickOtherAppliancesLinkFromGNB();
    }

    @Then("I should navigate to OTHER APPLIANCES landing page")
    public void iShouldNavigateToOTHERAPPLIANCESLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifyOtherAppliancesLandingPage();
    }

    @When("I click on COMPUTERS link from GNB")
    public void iClickOnCOMPUTERSLinkFromGNB() {
        GNB.clickComputersLinkFromGNB();
    }

    @Then("I should navigate to COMPUTERS landing page")
    public void iShouldNavigateToCOMPUTERSLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifyComputersLandingPage();
    }

    @When("I click on SOLAR link from GNB")
    public void iClickOnSOLARLinkFromGNB() {
        GNB.clickSolarLinkFromGNB();
    }

    @Then("I should navigate to SOLAR landing page")
    public void iShouldNavigateToSOLARLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifySolarLandingPage();
    }

    @When("I click on SMALL BUSINESS link from GNB")
    public void iClickOnSMALLBUSINESSLinkFromGNB() {
        GNB.clickSmallBusinessLinkFromGNB();
    }

    @Then("I should navigate to SMALL BUSINESS landing page")
    public void iShouldNavigateToSMALLBUSINESSLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifySmallBusinessLandingPage();
    }

    @When("I click on SUPPORT link from GNB")
    public void iClickOnSUPPORTLinkFromGNB() {
        GNB.clickSupportLinkFromGNB();
    }

    @Then("I should navigate to SUPPORT landing page")
    public void iShouldNavigateToSUPPORTLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        GNB.verifySupportLandingPage();
    }


}
