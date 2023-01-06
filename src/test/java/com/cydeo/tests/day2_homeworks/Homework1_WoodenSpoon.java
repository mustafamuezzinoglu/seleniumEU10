package com.cydeo.tests.day2_homeworks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1_WoodenSpoon {
    public static void main(String[] args) {
//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
//        3. Search for “wooden spoon”
        WebElement inputSearchBox = driver.findElement(By.cssSelector("input#global-enhancements-search-query"));
        inputSearchBox.sendKeys("wooden spoon" + Keys.ENTER);
//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }
}
