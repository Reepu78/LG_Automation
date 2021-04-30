package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Signup_page extends Config{

    public Signup_page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public static String email;
    public static String userID;
    public static String domain;
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    public void generateRandomMail() throws Exception {
        driver.get("https://emailfake.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // waiting for the element and fetches the email ID from WebSite
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text'][@id='userName']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@id='userName']")));
        Thread.sleep(5000);
        userID = driver.findElement(By.xpath("//input[@type='text'][@id='userName']")).getAttribute("value");
        System.out.println(userID);
        domain = driver.findElement(By.xpath("//input[@type='text'][@id='domainName2']")).getAttribute("value");
        System.out.println(userID);
        email = userID + "@" + domain;
        System.out.println(email);
    }

    public void iLoginAsRegisteredUser() throws Exception {
        driver.get("https://sso.us.lg.com/oauth/page/signup?authorizeKey=68a10091-1149-4f7c-893c-a7160755a974");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
        System.out.println(email);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtBoxPassword']")));
        driver.findElement(By.xpath("//input[@id='txtBoxPassword']")).sendKeys("Admin@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtBoxPasswordConfirm']")));
        driver.findElement(By.xpath("//input[@id='txtBoxPasswordConfirm']")).sendKeys("Admin@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtBoxFName']")));
        driver.findElement(By.xpath("//input[@id='txtBoxFName']")).sendKeys("Mike");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtBoxLName']")));
        driver.findElement(By.xpath("//input[@id='txtBoxLName']")).sendKeys("Nelson");
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='calendar view']")));
        driver.findElement(By.xpath(" //button[text()='calendar view']")).click();
        Thread.sleep(1000);
        Select year = new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
        year.selectByValue("1976");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='1']")));
        driver.findElement(By.xpath("//a[text()='1']")).click();
        Thread.sleep(1000);
    }

    public void selectsCondition() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='checkbox-btn'])[2]")));
        driver.findElement(By.xpath("(//span[@class='checkbox-btn'])[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='checkbox-btn'])[3]")));
        driver.findElement(By.xpath("(//span[@class='checkbox-btn'])[3]")).click();
    }

    public void clickSignup() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='SIGN UP']")));
        driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
    }

    public void checkEmailCreate() {
        String actualEmail = driver.findElement(By.xpath("//p[@class='text em']/strong")).getText().trim();
        Assert.assertEquals(email, actualEmail, "LG Account creation success Message not displayed");
    }

    public void activateAccount() throws InterruptedException {
        driver.get("https://emailfake.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text'][@id='userName']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@id='userName']")));
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='VERIFY ACCOUNT']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='VERIFY ACCOUNT']")));
        driver.findElement(By.xpath("//a[text()='VERIFY ACCOUNT']")).click();
        Thread.sleep(3000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        if (tabs2.size() > 1) {
            driver.switchTo().window(tabs2.get(1));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='txt-wrap']/h1")));
            String actualMsg = driver.findElement(By.xpath("//div[@class='txt-wrap']/h1")).getText().trim();
            Assert.assertEquals("Verification Complete", actualMsg, "Account verification Message not Displayed");
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='txt-wrap']/h1")));
            String actualMsg = driver.findElement(By.xpath("//div[@class='txt-wrap']/h1")).getText().trim();
            Assert.assertEquals("Verification Complete", actualMsg, "Account verification Message not Displayed");
        }
    }
}

