package com.cydeo.tests.day2_homeworks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Facebook_Task1 {
    public static void main(String[] args) {

//        TC #1: Facebook title verification
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//        3. Verify title:
//        Expected: “Facebook - Log In or Sign Up”
        String expectedTitle =  "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println(" Title verification is PASSED!");
        }else{
            System.out.println(" Title verification is FAILED!");
        }


    }
}
