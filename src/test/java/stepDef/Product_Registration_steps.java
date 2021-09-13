package stepDef;

import base.Setup;
import io.cucumber.java.en.When;
import pageObject.Product_Registration_page;


public class Product_Registration_steps extends Setup {
    Product_Registration_page REGISTRATION = new Product_Registration_page(driver);

    @When("I enter product Details on product registration page and click register a product button")
    public void iClickOnSearchIconFromGNB() throws InterruptedException {
        REGISTRATION.enterProductInfo();
    }


}
