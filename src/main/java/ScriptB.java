import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ScriptB {
    public static void CheckTheMenu(WebDriver driver, String email_input, String password_input, String email, String password, String button)
    {
        WebElement inputEmaill = driver.findElement(By.name(email_input));
        inputEmaill.sendKeys(email);

        WebElement inputPassword = driver.findElement(By.name(password_input));
        inputPassword.sendKeys(password);

        WebElement buttn = driver.findElement(By.name(button));
        buttn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        List<WebElement> array;
        array = driver.findElements(By.cssSelector (".maintab,.link-levelone "));

        for (int i=0; i < array.size(); i++)
        {
            try {
                array = driver.findElements(By.cssSelector (".maintab,.link-levelone "));
            }
            catch (org.openqa.selenium.StaleElementReferenceException ex){
                array = driver.findElements(By.cssSelector (".maintab,.link-levelone "));
            }
            array.get(i).click();
            System.out.println("The page's title is: " + driver.getTitle());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }

//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//
//        WebElement title_text_webelement = driver.findElement(By.linkText(title_text));
//        title_text_webelement.click();
//
//        String currentTitle = driver.getTitle();
//        System.out.println("The page's title is - " + currentTitle);
//        driver.navigate().refresh();
//
//        String afterRefreshTitle = driver.getTitle();
//
//        if (currentTitle.equals(afterRefreshTitle)) {
//            System.out.println("The user is still on the same page");
//        }
//        else
//        {
//            System.out.println("The user isn't on the same page");
//        }
    }
}
