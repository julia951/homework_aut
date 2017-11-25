import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumDemo {
    public static void main(String... args) {

        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = initWebDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        ScriptA.LogInLogOut(driver,"email","passwd" ,"webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw","submitLogin" );

        ScriptB.CheckTheMenu(driver,"email","passwd" ,"webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw","submitLogin" );

        driver.quit();
    }
    public static WebDriver initWebDriver(){
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        return new ChromeDriver();
    }
}
