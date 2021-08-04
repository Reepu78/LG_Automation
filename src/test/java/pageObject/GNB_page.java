package pageObject;

import base.GenericFunctions;
import base.Setup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class GNB_page extends Setup {

    public GNB_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    // Elements
    @FindBy(how = How.LINK_TEXT, using = "My LG")
    public WebElement GNB_MY_ACCOUNT_ICON_LINK;
    @FindBy(how = How.LINK_TEXT, using = "Sign In / Sign Up")
    public WebElement GNB_SIGN_IN_SIGN_UP_LINK;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'TV')]")
    public WebElement GNB_TV_SECTION;
    @FindBy(how = How.LINK_TEXT, using = "OLED TVs")
    public WebElement GNB_OLED;
    @FindBy(how = How.XPATH, using = "//div[@class='cart']/a[@data-link-name='cart']")
    public WebElement GNB_CART_ICON;
    @FindBy(how = How.XPATH, using = "//*[@id='lgContents']/section/div/div/div/h1")
    public WebElement GNB_LANDING_PAGE_TITLE;
    @FindBy(how = How.XPATH, using = "//*[@id='lgContents']/section[1]/div[2]/div/h1")
    public WebElement GNB_SUPPORT_LANDING_PAGE_TITLE;
    @FindBy(how = How.LINK_TEXT, using = "MOBILE")
    public WebElement GNB_MOBILE_LINK;
    @FindBy(how = How.LINK_TEXT, using = "TV / AUDIO / VIDEO")
    public WebElement GNB_TV_AUDIO_VIDEO_LINK;
    @FindBy(how = How.LINK_TEXT, using = "KITCHEN")
    public WebElement GNB_KITCHEN_LINK;
    @FindBy(how = How.LINK_TEXT, using = "LAUNDRY")
    public WebElement GNB_LAUNDRY_LINK;
    @FindBy(how = How.LINK_TEXT, using = "OTHER APPLIANCES")
    public WebElement GNB_OTHER_APPLIANCES_LINK;
    @FindBy(how = How.LINK_TEXT, using = "COMPUTERS")
    public WebElement GNB_COMPUTERS_LINK;
    @FindBy(how = How.LINK_TEXT, using = "SOLAR")
    public WebElement GNB_SOLAR_LINK;
    @FindBy(how = How.LINK_TEXT, using = "SMALL BUSINESS")
    public WebElement GNB_SMALL_BUSINESS_LINK;
    @FindBy(how = How.LINK_TEXT, using = "SUPPORT")
    public WebElement GNB_SUPPORT_LINK;


    // NEW
    public void clickMobileLinkFromGNB(){
        GNB_MOBILE_LINK.click();
    }
    public void clickTV_AUDIO_VideoLinkFromGNB(){
        GNB_TV_AUDIO_VIDEO_LINK.click();
    }
    public void clickKitchenLinkFromGNB(){
        GNB_KITCHEN_LINK.click();
    }
    public void clickLaundryLinkFromGNB(){
        GNB_LAUNDRY_LINK.click();
    }
    public void clickOtherAppliancesLinkFromGNB(){
        GNB_OTHER_APPLIANCES_LINK.click();
    }
    public void clickComputersLinkFromGNB(){
        GNB_COMPUTERS_LINK.click();
    }
    public void clickSolarLinkFromGNB(){
        GNB_SOLAR_LINK.click();
    }
    public void clickSmallBusinessLinkFromGNB(){
        GNB_SMALL_BUSINESS_LINK.click();
    }
    public void clickSupportLinkFromGNB(){
        GNB_SUPPORT_LINK.click();
    }

    public void verifyMobileLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Mobile";
        Assert.assertEquals(actual, expected);
    }
    public void verifyTV_AUDIO_VIDEOLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "TV / AUDIO / VIDEO";
        Assert.assertEquals(actual, expected);
    }
    public void verifyKitchenLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Kitchen Appliances";
        Assert.assertEquals(actual, expected);
    }
    public void verifyLaundryLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Laundry";
        Assert.assertEquals(actual, expected);
    }
    public void verifyOtherAppliancesLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Other Appliances";
        Assert.assertEquals(actual, expected);
    }
    public void verifyComputersLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Computers";
        Assert.assertEquals(actual, expected);
    }
    public void verifySolarLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Solar Panels and Installation";
        Assert.assertEquals(actual, expected);
    }
    public void verifySmallBusinessLandingPage(){
        String actual = GNB_LANDING_PAGE_TITLE.getText();
        String expected = "Small Business Solutions";
        Assert.assertEquals(actual, expected);
    }
    public void verifySupportLandingPage(){
        String actual = GNB_SUPPORT_LANDING_PAGE_TITLE.getText();
        String expected = "Support";
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMyAccountIconFromGNB() {
        GNB_MY_ACCOUNT_ICON_LINK.click();
    }

    public void clickSignInSignUpLinkFromGNB() {
        GNB_SIGN_IN_SIGN_UP_LINK.click();
    }

    public void mouseOverTVLink() {
        wait.until(ExpectedConditions.elementToBeClickable(GNB_TV_SECTION));
        Actions actions = new Actions(driver);
        actions.moveToElement(GNB_TV_SECTION).perform();
    }

    public void clickOLEDSection() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(GNB_OLED));
        GNB_OLED.click();
        Thread.sleep(1000);
    }

    public void clickOnCartIcon() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(GNB_CART_ICON));
        GNB_CART_ICON.click();
        Thread.sleep(500);
    }
    
//    public void click(String linkName) throws InterruptedException {
//    	switch(linkName) {
//    	case "":
//    		break;
//    	default :
//    		GenericFunctions.jsClick(driver.findElement(By.xpath("(//*[text()= '"+linkName+"'])[1]")));
//			break;
//    	}
//    }

}
