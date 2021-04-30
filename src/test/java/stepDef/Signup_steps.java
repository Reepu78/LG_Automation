package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import pageObject.Login_page;
import pageObject.Signup_page;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Signup_steps extends Config {
    Signup_page signup = new Signup_page(driver);

    @Given("User navigates to Email Site and generates random mail")
    public void shouldCreateRandomEmail() throws Exception {
      signup.generateRandomMail();
     }

    @Then("User navigates to LG Registration SignUp Page and enters all of required details")
    public void iLoginAsRegisteredUser() throws Exception {
        signup.iLoginAsRegisteredUser();
     }

    @And("Selects the Terms and conditions for Account Creation")
    public void selectsCondition() throws InterruptedException {
        signup.selectsCondition();

    }
    @When("Clicks on Signup Button")
    public void clickSignup() throws InterruptedException {
         signup.clickSignup();
    }

    @Then("LG Account should be created with provided email ID")
    public void checkEmailCreate() throws InterruptedException {
        signup.checkEmailCreate();
    }

    @And("I should be able to activate the account from Mailbox")
    public void activateAccount() throws InterruptedException {
        signup.activateAccount();
    }
}
