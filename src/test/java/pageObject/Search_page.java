package pageObject;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class Search_page extends Setup {

    public Search_page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.ID, using = "gnb_search_tit")
    public WebElement SEARCH_EDIT_BOX;
    @FindBy(how = How.CSS, using = "input.submit")
    public WebElement SEARCH_ICON_CLICK;
    @FindBy(how = How.CSS, using = "div.sku")
    public WebElement SEARCH_FIRST_SKU;
    @FindBy(how = How.CSS, using = "h1.search-result-for")
    public WebElement SEARCH_RESULTS_HEADER;

    public void enterAnItemToSearchFromGNB(String searchMe){
        SEARCH_EDIT_BOX.clear();
        SEARCH_EDIT_BOX.sendKeys(searchMe);
      }
    public void clickSearchIconFromGNB() throws InterruptedException {
        SEARCH_ICON_CLICK.click();
        Thread.sleep(1500);
    }

    public void verifySearchedItemFromSearchResultPage(String modelId){
        String act = SEARCH_RESULTS_HEADER.getText().replace("\"", "");
        String exp = "Search Results For "+modelId;
        Assert.assertEquals(act, exp);
        String actSku = SEARCH_FIRST_SKU.getText();
        String expSku = modelId;
        Assert.assertEquals(actSku, expSku);
    }


}
