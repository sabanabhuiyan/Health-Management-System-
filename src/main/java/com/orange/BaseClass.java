package com.Orange.BasesClass;

import com.Orange.Utilities.WebEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

@SuppressWarnings("deprecation")
public class BaseClass {
   public static WebDriver driver;
   public static Properties prop;
   @SuppressWarnings("deprecation")
   public static EventFiringWebDriver e_driver;
   public static WebEventListener eventListener;

   public BaseClass(){

       try {
           prop = new Properties ();
           FileInputStream file = new FileInputStream ("C:\\Users\\Lenovogs\\Desktop" +
                   "\\HRMOrange\\com.OrangeHRM\\" +
                   "src\\main\\java\\com\\Orange\\config\\config.properties");
           prop.load (file);
       } catch (IOException e){
           e.printStackTrace ();
       }

   }

   @SuppressWarnings("deprecation")
   public static void initialization(){
       String browserName = prop.getProperty ("browser");
       if (browserName.equals ("chrome")){
           WebDriverManager.chromedriver ().setup ();
           driver = new ChromeDriver ();
           e_driver = new EventFiringWebDriver (driver);
       } else {
           if (browserName.equals ("FF")){
               WebDriverManager.firefoxdriver ().setup ();
               driver = new FirefoxDriver ();
           }
           e_driver = new EventFiringWebDriver (driver);
       }

       eventListener = new WebEventListener ();
       e_driver.register ( eventListener);
       driver = e_driver;


       driver.manage ().deleteAllCookies ();
       driver.manage ().window ().maximize ();
       driver.manage ().timeouts ().pageLoadTimeout(Duration.ofSeconds (20));
       driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (20));
       driver.get (prop.getProperty ("url"));
   }
}
//    WebDriver original = new FirefoxDriver();
//    WebDriverListener listener = new MyListener();
//    WebDriver decorated = new EventFiringDecorator(listener).decorate(original);
