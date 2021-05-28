package pageObject;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GNB_page extends Setup {

    public GNB_page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    // Elements
    @FindBy(how = How.LINK_TEXT, using = "My LG")
    public WebElement GNB_MY_ACCOUNT_ICON_LINK;
    @FindBy(how = How.LINK_TEXT, using = "Sign In / Sign Up")
    public WebElement GNB_SIGN_IN_SIGN_UP_LINK;


    public void clickOnMyAccountIconFromGNB(){
        GNB_MY_ACCOUNT_ICON_LINK.click();
    }
    public void clickSignInSignUpLinkFromGNB(){
        GNB_SIGN_IN_SIGN_UP_LINK.click();
    }

}
