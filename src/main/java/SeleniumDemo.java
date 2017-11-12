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

        WebDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement inputEmaill = driver.findElement(By.name("email"));
        inputEmaill.sendKeys("webinar.test@gmail.com");

        WebElement inputPassword = driver.findElement(By.name("passwd"));
        inputPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement buttn = driver.findElement(By.name("submitLogin"));
        buttn.click();

        Test(driver,"Заказы");
        Test(driver,"Каталог");
        Test(driver,"Клиенты");
        Test(driver,"Служба поддержки");
        Test(driver,"Статистика");
        Test(driver,"Modules");
        Test(driver,"Design");
        Test(driver,"Доставка");
        Test(driver,"Способ оплаты");
        Test(driver,"International");
        Test(driver,"Shop Parameters");
        Test(driver,"Конфигурация");

        driver.quit();
    }
public static void Test(WebDriver driver,String title_text)
{
    try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        System.out.println("got interrupted!");
    }

    WebElement title_text_webelement = driver.findElement(By.linkText(title_text));
    title_text_webelement.click();

    String currentTitle = driver.getTitle();
    System.out.println("The page's title is - " + currentTitle);
    driver.navigate().refresh();

    String afterRefreshTitle = driver.getTitle();
    if (currentTitle.equals(afterRefreshTitle)) {
        System.out.println("The user is still on the same page");
    }
}
}