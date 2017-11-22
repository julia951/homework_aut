import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumDemo {
    public static void main(String... args) {

        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = initWebDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        ScriptA.Login(driver,"email","passwd" ,"webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw","submitLogin" );

        ScriptB.Test(driver,"Заказы");
        ScriptB.Test(driver,"Каталог");
        ScriptB.Test(driver,"Клиенты");
        ScriptB.Test(driver,"Служба поддержки");
        ScriptB.Test(driver,"Статистика");
        ScriptB.Test(driver,"Modules");
        ScriptB.Test(driver,"Design");
        ScriptB.Test(driver,"Доставка");
        ScriptB.Test(driver,"Способ оплаты");
        ScriptB.Test(driver,"International");
        ScriptB.Test(driver,"Shop Parameters");
        ScriptB.Test(driver,"Конфигурация");

        driver.quit();
    }
    public static WebDriver initWebDriver(){
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        return new ChromeDriver();
    }

}
