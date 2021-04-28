package stepDef;

import base.Config;
import base.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.Login_page;

import java.io.IOException;

public class Login_steps extends Config {
    Login_page login = new Login_page(driver);
    @Given("I am at LG Home Page")
    public void iAmAtLGHomePage(){

    }

    @Then("I login as registered user")
    public void iLoginAsRegisteredUser() throws Exception {
        login.clickOnLoginLink();
        login.clickOnSignInSignUpLink();
        Thread.sleep(1000);
        login.captchaVia2captcha();

    }
}
