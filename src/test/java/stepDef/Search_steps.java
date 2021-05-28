package stepDef;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Search_page;


public class Search_steps extends Setup {
    Search_page SEARCH = new Search_page(driver);

    @When("I click on search icon from GNB")
    public void iClickOnSearchIconFromGNB() throws InterruptedException {
        SEARCH.clickSearchIconFromGNB();
    }

    @Given("I enter for OMV subscription product Code into search edit box from GNB")
    public void iSearchForOMVSubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(Hook.OMV_Subscription);
    }
    @Given("I enter for OMV Non subscription product Code into search edit box from GNB")
    public void iEnterForOMVNonSubscriptionProductCodeIntoSearchEditBoxFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(Hook.OMV_Non_Subscription);
    }

    @Then("I will verify OMV Subscription product displays in search results page")
    public void iWillVerifyOMVSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(Hook.OMV_Subscription);
    }

    @Then("I will verify OMV Non Subscription product displays in search results page")
    public void iWillVerifyOMVNonSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(Hook.OMV_Non_Subscription);
    }
}
