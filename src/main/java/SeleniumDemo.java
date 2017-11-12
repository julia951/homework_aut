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

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub1 = driver.findElement(By.id("subtab-AdminParentOrders"));
//        sub1.click();
//
//        String title = driver.getTitle();
//
//        System.out.println("" + driver.getTitle());
//        driver.navigate().refresh();
//
//        String title2 = driver.getTitle();
//        if (title == title) {
//            System.out.println("ok!");
//        }
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

//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub6 = driver.findElement(By.linkText("Modules"));
//        sub6.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub7 = driver.findElement(By.linkText("Design"));
//        sub7.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(400);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub8 = driver.findElement(By.linkText("Доставка"));
//        sub8.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub9 = driver.findElement(By.linkText("Способ оплаты"));
//        sub9.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub10 = driver.findElement(By.linkText("International"));
//        sub10.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub11 = driver.findElement(By.linkText("Shop Parameters"));
//        sub11.click();
//        System.out.println(""+driver.getTitle());
//
//        try {
//            Thread.sleep(500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//        WebElement sub12 = driver.findElement(By.linkText("Конфигурация"));
//        sub12.click();
//        System.out.println(""+driver.getTitle());
//
}