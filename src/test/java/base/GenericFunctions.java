package base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class GenericFunctions extends Setup{
	
	public static Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

	
	public static void jsClick(WebElement ele) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	public static void verifyElementByText(String text) {
		WebElement ele = driver.findElement(By.xpath("//*[text()='"+text+"']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Assert.assertTrue(ele.isDisplayed());
	}
	
	public static boolean verifyElementNotDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed()) {
				return false;
			}else {
				return true;
			}
		}catch(Exception e) {
			return true;
		}
	}
	
	public static boolean verifyElementIsNotDisplayedByText(String text) {
		try {
			WebElement ele = driver.findElement(By.xpath("//*[text()='"+text+"']"));
			if(ele.isDisplayed()) {
				return false;
			}else {
				return true;
			}
		}catch(Exception e) {
			return true;
		}
	}
	
	
	public static boolean isChecked(String text) {
		try {
			WebElement ele = driver.findElement(By.xpath("//*[text()='"+text+"']"));
			if(ele.isDisplayed()) {
				return false;
			}else {
				return true;
			}
		}catch(Exception e) {
			return true;
		}
	}
	
	
	public static String getData(String item) {
		switch(item) {
    	case "OMV Non Subscription":
    		return GlobalTestData.OMV_Non_Subscription;
    	case "OMD HE Non Innovel":
    		return GlobalTestData.OMD_HE_Non_Innovel;
    	case "OMD HA Non Innovel":
    		return GlobalTestData.OMD_HA_Non_Innovel;
    	case "OMV Subscription":
    		return GlobalTestData.OMV_Subscription;
    	case "OMD HA Innovel":
    		return GlobalTestData.OMD_HA_Innovel;
    	case "OMD HE Innovel":
    		return GlobalTestData.OMD_HE_Innovel;
    	case "OMV Non Subscription With Accessories":
    		return GlobalTestData.OMV_Non_Subscription_With_Accessories;
    	case "HA OMD Klarna":
    		return GlobalTestData.HA_OMD_KLARNA;
    	case "HE OMD Klarna":
    		return GlobalTestData.HE_OMD_KLARNA;
    	case "OMD KLARNA":
    		return GlobalTestData.OMD_KLARNA;
    	case "HE OMD KLARNA PROMO":
    		return GlobalTestData.HE_OMD_KLARNA_PROMO;
    	case "Test Data":
    		return "EAD65185302";
		default:
    		return "";
    	}
	}
	
	public static void switchToNewTab() {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
	}
	
	public static void switchToTab(int tabNum) {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(tabNum));
	}
	
	
	  public static void click(String elementText) {
	    	WebElement element  = driver.findElement(By.xpath("(//*[text()= '"+elementText+"'])[1]")); 
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	    }
	  
	  public static void click(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	    }
}
