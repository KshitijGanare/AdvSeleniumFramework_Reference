package base.oldBaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_WithMultiThread {

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver(){
       return dr.get();

    }


    @BeforeMethod
    public void inIt(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        dr.set(new ChromeDriver(options));
        getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }


    @AfterMethod
    public void tearDown(){
        if(getDriver() != null){
            getDriver().quit();
        }
    }


}


/*
ThreadLocal : Creates separate driver for every instance


ThreadLocal Methods
dr.set() -
dr.get() -
dr.remove() -

 */