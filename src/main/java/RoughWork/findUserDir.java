package RoughWork;
import com.twocaptcha.TwoCaptcha;
import com.twocaptcha.captcha.Normal;
import java.io.File;

public class findUserDir {

    public static void main(String[] args) {
        System.out.println (System.getProperty("user.dir"));
        TwoCaptcha solver = new TwoCaptcha("3940daf4eab14ff372ce54691f3de0ac");
        Normal captcha = new Normal();
        captcha.setFile(System.getProperty("user.dir") + "/screenShots/captcha.jpg");
        captcha.setNumeric(4);
        captcha.setMinLen(4);
        captcha.setMaxLen(20);
        captcha.setPhrase(true);
        captcha.setCaseSensitive(true);
        captcha.setCalc(false);
        captcha.setLang("en");
        captcha.setHintImg(new File(System.getProperty("user.dir") + "/screenShots/captcha.jpg"));
        captcha.setHintText("Type red symbols only");
        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
