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
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

public class Search_page extends Setup {

	public Search_page(WebDriver driver) {
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
	@FindBy(how = How.XPATH, using = "//a[text()='Add to Cart'][contains(@class,'active')]")
	public List<WebElement> ATC_ADD_TO_CART_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[@class='ga-model-detail']")
	public List<WebElement> ATC_PRODUCT_NAME;
	@FindBy(how = How.XPATH, using = "//h2/strong")
	public WebElement SEARCH_WE_ARE_SORRY_MSG;
	@FindBy(how = How.ID, using = "search-keyword")
	public WebElement SEARCH_INPUT_FROM_SEARCH_RESULTS_PAGE;
	@FindBy(how = How.XPATH, using = "//*[@id='search_for']/div/input")
	public WebElement SEARCH_ICON_FROM_SEARCH_RESULTS_PAGE;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'VIEW CART')]")
	public WebElement SEARCH_VIEW_CART_FROM_MODAL;


	public void enterAnItemToSearchFromGNB(String searchMe) {
		wait.until(ExpectedConditions.elementToBeClickable(SEARCH_EDIT_BOX));
		SEARCH_EDIT_BOX.clear();
		SEARCH_EDIT_BOX.sendKeys(searchMe);
	}

	public void searchForItemFromSearchResultsPage(String searchMe) {
		SEARCH_INPUT_FROM_SEARCH_RESULTS_PAGE.clear();
		SEARCH_INPUT_FROM_SEARCH_RESULTS_PAGE.sendKeys(searchMe);
	}

	public void clickSearchIconFromSearchResultsPage() throws InterruptedException {
		SEARCH_ICON_FROM_SEARCH_RESULTS_PAGE.click();
		Thread.sleep(500);
	}

	public void clickSearchIconFromGNB() throws InterruptedException {
		Thread.sleep(2000);
		SEARCH_ICON_CLICK.click();
		Thread.sleep(1000);
	}

	public void verifySearchedItemFromSearchResultPage(String modelId) {
		String act = SEARCH_RESULTS_HEADER.getText().replace("\"", "");
		String exp = "Search Results For " + modelId;
		Assert.assertEquals(act, exp);
		String actSku = SEARCH_FIRST_SKU.getText();
		String expSku = modelId;
		Assert.assertEquals(actSku, expSku);
	}
	public void verifyWeAreSorryMessageInSearchResultsPage() {
		String act = SEARCH_WE_ARE_SORRY_MSG.getText();
		String exp = "We are sorry, your search did not return any results on our site.";
		Assert.assertEquals(act, exp);
	}

	// Clicks on Add to Cart Button based on Product Code
	public void addCartProduct(String productCode) throws ParseException, InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ATC_ADD_TO_CART_BUTTON.get(0)));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[text()='" + productCode + "']/following::div/a[text()='Add to Cart']")));
		Cart_page.productCode[1] = driver
				.findElement(By.xpath("//div[text()='" + productCode + "']/following::div[@class='price ga-price']"))
				.getText().trim();
		driver.findElement(By.xpath("//div[text()='" + productCode + "']/following::div/a[text()='Add to Cart']"))
				.click();
	}

	// Verifies the List of Product Name
	public void verifyProductName(String productCode){
		wait.until(ExpectedConditions.elementToBeClickable(ATC_PRODUCT_NAME.get(0)));
		int size = ATC_PRODUCT_NAME.size();
		for (int i = 0; i < size; i++) {
			String productName = ATC_PRODUCT_NAME.get(i).getText();
			if (!productName.contains(productCode)) {
				Assert.fail("Displayed product is not " + productCode + " :" + productName);
			}
		}
	}

	// Click view cart button from pop up modal
	public void clickViewCartButtonFromModal(){
		SEARCH_VIEW_CART_FROM_MODAL.click();
	}
	
	//Click on product link from search results 
	public void navigateToPDP(String item) {
		driver.findElement(By.xpath("(//*[@data-ga-modelname='"+item+"']//a)[1]")).click();	
	}
}
