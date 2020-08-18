package main.java;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        // write your code here
        System.setProperty( "webdriver.chrome.driver", "/Users/aylademiray/Desktop/TechnoStudy/selenium/chromedriver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
    }


    }

