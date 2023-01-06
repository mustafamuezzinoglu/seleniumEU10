package com.cydeo.tests.day2_homeworks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework3_Gmail {
    public static void main(String[] args) throws InterruptedException {
//        TC #3: Back and forth navigation
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://google.com
        driver.get("https://google.com");
//        3- Click to Gmail from top right
        WebElement gmailButton = driver.findElement(By.cssSelector("a[data-pid='23']"));
        gmailButton.click();
//        4- Verify title contains:
//        Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
//        5- Go back to Google by using the .back();
        driver.navigate().back();
//        6- Verify title equals:
//        Expected: Google
        String expectedTitleBack = "Google";
        String actualTitleBack = driver.getTitle();
        System.out.println("expectedTitleBack = " + expectedTitleBack);
        System.out.println("actualTitleBack = " + actualTitleBack);
        if(actualTitleBack.equals(expectedTitleBack)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
