package base;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        dr.set(driver);
    }


    public static WebDriver getDriver(){
         return dr.get();
    }


     public static void unload(){
         dr.remove();
     }

}
