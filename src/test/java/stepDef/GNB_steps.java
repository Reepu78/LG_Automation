package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.GNB_page;


public class GNB_steps extends Setup {
    GNB_page GNB = new GNB_page(driver);

    @Given("I am at LG Home Page")
    public void homePage() throws Exception {
        // assert page title? - TODO
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


}
