import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScriptB {
    public static void Test(WebDriver driver, String title_text)
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
        else
        {
            System.out.println("The user isn't on the same page");
        }
    }
}
