package base.oldBaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import util.ScreenshotUtil;

import java.io.IOException;


public class BaseTest_WithScreenshot {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/"); // URL yahan dalna sahi hai

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (driver != null) {

            if (result.getStatus() == ITestResult.FAILURE) {
                ScreenshotUtil.screenshot(driver, result.getName());

            }
            driver.quit();
        }

    }

}
