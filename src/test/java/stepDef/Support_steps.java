package stepDef;

import base.GenericFunctions;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.Support_page;


public class Support_steps extends Setup {
    Support_page SUPPORT = new Support_page(driver);

    @And("I search {string} using the search textBox")
    public void iClickOnSearchIconFromGNB(String product) throws InterruptedException {
    	SUPPORT.searchProduct(product);
    	SUPPORT.clickSearch();
    }
    
    @And("I select Product Category as {string} and {string} and click Submit")
    public void iSubmitProductCategory(String Category, String SubCategory) throws InterruptedException {
    	SUPPORT.selectCategories(Category, SubCategory);
    	SUPPORT.click("submit");
    }
    
    @And("I click on Register a product for first Result product")
    public void iClickFirstProduct() throws InterruptedException {
	   GenericFunctions.jsClick(SUPPORT.FIRST_RESULT);
	   GenericFunctions.jsClick(SUPPORT.REGISTER_A_PRODUCT);
    }
    
    
    @Then("I verify new tab is opened to register the product")
    public void iVerifyNewTabIsOpenedToRegisterProduct(){
	   GenericFunctions.switchToNewTab();
	   GenericFunctions.verifyElementByText("Register your LG product today");
    }
    
    

  
   
}
