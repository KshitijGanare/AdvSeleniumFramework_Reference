package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static base.WebDriverManager.*;

import java.time.Duration;

public class LoginPage{

    public String verifyLoginWithInvalidDetails(){

        WebDriverWait waits = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
        getDriver().findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        getDriver().findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("password");
        getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();

        return getDriver().getCurrentUrl();
    }


    public String verifyLoginWithValidDetails(){

        WebDriverWait waits = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
        getDriver().findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        getDriver().findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();

        waits.until(ExpectedConditions.urlContains("dashboard"));

        return getDriver().getCurrentUrl();
    }

}
