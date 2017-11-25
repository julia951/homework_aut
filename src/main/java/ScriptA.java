import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptA {
    public static void LogInLogOut(WebDriver driver, String email_input, String password_input, String email, String password, String button)
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

        WebElement buttnExit = driver.findElement(By.className("employee_avatar_small"));
        buttnExit.click();

        WebElement buttnExitAvatar = driver.findElement(By.id("header_logout"));
        buttnExitAvatar.click();
    }
}
