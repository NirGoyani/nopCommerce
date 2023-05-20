package com.nopcommerce.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    String url = "https://demo.nopcommerce.com/";
//    String firstName = "payal";
//    String lastName = "patil";
//    double randomNumber = Math.random();
//    String password = "157157";
//    String confirmPassword = password;

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void gotoUrl(){
        driver.get(url);
    }
    public void applyWait(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public int generateRandomNumber(){
        Random random = new Random();
        // Obtain a number between [0 - 100].
        return random.nextInt(100);
    }
//    public void enterEmailAndPassword(){
//        String myEmail = firstName + randomNumber + lastName + "@gmail.com";
//        String myPassword = "abc" + randomNumber;
//    }

    public void maxWindow(){
        driver.manage().window().maximize();
    }
    public void sleepWindow(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public void closeWindow(){
        driver.quit();
    }


}
