package pageObject;

import base.Config;
import com.twocaptcha.TwoCaptcha;
import com.twocaptcha.captcha.Normal;
import com.twocaptcha.exceptions.ApiException;
import com.twocaptcha.exceptions.NetworkException;
import com.twocaptcha.exceptions.TimeoutException;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import javax.xml.bind.ValidationException;


public class Login_page extends Config{

    public Login_page (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.NAME, using ="loginUserId")
    public WebElement adminLoginUserId;
    @FindBy(how = How.NAME, using ="password")
    public WebElement adminLoginPassword;
    @FindBy(how = How.NAME, using ="doLogin")
    public WebElement adminLoginButton;
    // Register users
    @FindBy(how = How.LINK_TEXT, using ="My LG")
    public WebElement LoginLink;
    @FindBy(how = How.LINK_TEXT, using ="Sign In / Sign Up")
    public WebElement signInSignUpLink;
    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    public WebElement enterRegisterUsersEmail;
    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    public WebElement enterRegisterUsersPassword;
    @FindBy(how = How.NAME, using ="signinFormTrigger")
    public WebElement clickRegisterUserSignInButton;
    @FindBy(how = How.ID, using ="customizedCaptcha_CaptchaImage")
    public String captcha_registerUser;
    @FindBy(how = How.ID, using ="captchaCode")
    public WebElement captcha_code;

    public void enterAdminLoginUserId(String adminUserId){
        adminLoginUserId.sendKeys(adminUserId);
    }
    public void enterAdminLoginPassword(String adminPassword){
        adminLoginPassword.sendKeys(adminPassword);
    }
    public void clickAdminLoginButton(){
        adminLoginButton.click();
    }
    public void clickOnLoginLink(){
        LoginLink.click();
    }
    public void clickOnSignInSignUpLink(){
        signInSignUpLink.click();
    }
    public void enterRegisterUserEmail (String registerUserEmail){
        enterRegisterUsersEmail.sendKeys(registerUserEmail);
    }
    public void enterRegisterUsersPassword (String registerUserPass){
        enterRegisterUsersPassword.sendKeys(registerUserPass);
    }
    public void clickRegisterUserSignInButton (){
        clickRegisterUserSignInButton.click();
    }
    public void enterRegisterUsersCaptchaCode (String captchaCode){
        captcha_code.sendKeys(captchaCode);
    }

    public void captchaVia2captcha() throws Exception {
        // captcha
        WebElement ele = driver.findElement(By.id("customizedCaptcha_CaptchaImage"));
        File scrFile = ele.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/screenShots/captcha.png"));
        System.out.println ("...................Going to start the Captcha2 thing................");

        TwoCaptcha solver = new TwoCaptcha("3940daf4eab14ff372ce54691f3de0ac");
        Normal captcha = new Normal();
        captcha.setFile(System.getProperty("user.dir") + "/screenShots/captcha.png");
        captcha.setNumeric(4);
        captcha.setMinLen(4);
        captcha.setMaxLen(20);
        captcha.setPhrase(true);
        captcha.setCaseSensitive(true);
        captcha.setCalc(false);
        captcha.setLang("en");
        captcha.setHintImg(new File(System.getProperty("user.dir") + "/screenShots/captcha.png"));
        captcha.setHintText("Type red symbols only");
        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    public void handleCaptcha() throws IOException, InterruptedException {
        File scrFile = driver.findElement(By.id("customizedCaptcha_CaptchaImage")).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/screenShots/captcha.png";
        FileHandler.copy(scrFile, new File(path));
        Thread.sleep(5000);
        System.out.println ("going to start the OCR THING");
        ITesseract image = new Tesseract();
        image.setDatapath(System.getProperty("user.dir")+"/tessdata/");
        image.setLanguage("eng");
        try {
            String imageText = image.doOCR(new File(path));
            System.out.println ("CAPTCHA IMAGE TEXT IS : =====>" + imageText);

        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }





}
