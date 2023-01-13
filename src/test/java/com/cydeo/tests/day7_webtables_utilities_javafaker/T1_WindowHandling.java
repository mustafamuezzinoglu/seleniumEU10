package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.Before_Method;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_WindowHandling {

    //    TC #1: Window Handle practice

    public WebDriver driver;

    //1. Create new test and make set up

    @BeforeMethod
    public void setUpMethod() {
        //1. Open Chrome browser
        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();

    }

    @Test
    public void window_handling_test() {

//    2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
        WebElement dontChangeButton= driver.findElement(By.cssSelector("span.a-button-inner"));
        dontChangeButton.click();
//    3. Copy and paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://msn.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");


//4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtils.switchWindowAndVerify (driver,"etsy", "Etsy");

//5. Assert: Title contains “Etsy”
//  Lines to be pasted

        BrowserUtils.verifyTitle(driver, "Etsy");
//    These lines will simply open new tabs using something called JavascriptExecutor
//    and get those pages. We will learn JavascriptExecutor later as well.


    }

    }

