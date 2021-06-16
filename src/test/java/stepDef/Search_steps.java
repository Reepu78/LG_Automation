package stepDef;

import base.GlobalTestData;
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
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Subscription);
    }
    @Given("I enter for OMV Non subscription product Code into search edit box from GNB")
    public void iEnterForOMVNonSubscriptionProductCodeIntoSearchEditBoxFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Non_Subscription);
    }
    @Given("I enter for OMD HE Innovel subscription product Code into search edit box from GNB")
    public void iSearchForOMDHESubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_HE_Innovel);
    }

    @Then("I will verify OMV Subscription product displays in search results page")
    public void iWillVerifyOMVSubscriptionProductDisplaysInSearchResultsPage() {
        // logic here
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMV_Subscription);
    }

    @Then("I will verify OMV Non Subscription product displays in search results page")
    public void iWillVerifyOMVNonSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMV_Non_Subscription);
    }
    
    @Then("I will verify OMD HE Innovel Subscription product displays in search results page")
    public void iWillVerifyOMDHESubscriptionProductDisplaysInSearchResultsPage() {
        // logic here
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_HE_Innovel);
    }
    
    
}
