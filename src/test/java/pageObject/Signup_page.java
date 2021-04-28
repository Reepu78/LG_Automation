package pageObject;

import base.Config;
import base.Util;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Signup_page extends Config {
    Faker faker = new Faker();
    Util util = new Util();

    public Signup_page (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // ======================== Signup page WebElements ====================

    // firstName edit box
    @FindBy(how = How.NAME, using ="firstName")
    public WebElement firstName;

// ======================== Signup page functions ====================

    public void enterFirstNamefromTable(String fName){
        firstName.sendKeys(fName);
        System.out.println("firstName is ==>" + fName);
    }

}
