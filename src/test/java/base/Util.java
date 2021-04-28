package base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.twocaptcha.TwoCaptcha;
import com.twocaptcha.captcha.Normal;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;


public class Util extends Config{
    // write selenium func that can be re-used


    // ============ drop-down
    public void dropdownByXpathUsingValue(String loc, String value) {
        Select se = new Select(driver.findElement(By.xpath(loc)));
        se.selectByValue(value);
    }
    public void dropdownByValue(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByValue(value);
    }
    public void dropdownByVisibleText(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByVisibleText(value);
    }
    public void dropdownByIndex(WebElement element, int indexNum) {
        Select se = new Select(element);
        se.selectByIndex(indexNum);
    }

    public void mouseHover (String loc){
        WebElement link_Home = driver.findElement(By.xpath(loc));
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
        mouseOverHome.perform();
    }
    public void mouseMoveWithSub (String MainNav, String subNav) throws InterruptedException {
        WebElement Menu=driver.findElement(By.xpath(MainNav));//Menu
        WebElement MenuB=driver.findElement(By.xpath(subNav));//Menu item
        Actions builder = new Actions(driver);
        Actions hoverOverRegistrar = builder.moveToElement(Menu);
        hoverOverRegistrar.perform();
        MenuB.click();//at last Menu Item Click
    }
    public static void screenShot (String screenshotName) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenShots\\" + screenshotName + ".png"));
    }

    public static void screenshotParticularElement (String captchaLoc, String screenshotName) throws IOException {
        WebElement ele = driver.findElement(By.id(captchaLoc));
        // capture screenshot with getScreenshotAs() of the dropdown
        File scrFile = ele.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenShots\\" + screenshotName + ".png"));
    }

}
