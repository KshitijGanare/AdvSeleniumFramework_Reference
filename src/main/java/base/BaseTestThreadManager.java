package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.Property;
import util.ScreenshotUtil;

import java.io.IOException;

import static base.WebDriverManager.*;

public class BaseTestThreadManager {

    @BeforeMethod
    public void inIt() throws IOException {

        String browser = Property.getProperty("browser");

        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                setDriver(new ChromeDriver(chromeOptions));
                break;


            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--incognito");
                firefoxOptions.addArguments("--start-maximized");
                setDriver(new FirefoxDriver(firefoxOptions));
                break;


            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--incognito");
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                setDriver(new EdgeDriver(edgeOptions));
                break;


            default:
                System.out.println("Driver not recieved so switching to default browser:");
                setDriver(new ChromeDriver());
                break;

        }

        getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }


    @AfterMethod
    public void tearDown(ITestResult itr) {

        if (getDriver() != null) {

            try {
                if (itr.getStatus() == ITestResult.FAILURE) {
                    ScreenshotUtil.screenshot(getDriver(), itr.getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            getDriver().quit();
            unload();

        }


    }

}


/*
ThreadLocal : Creates separate driver for every instance


ThreadLocal Methods
dr.set() -
dr.get() -


 */