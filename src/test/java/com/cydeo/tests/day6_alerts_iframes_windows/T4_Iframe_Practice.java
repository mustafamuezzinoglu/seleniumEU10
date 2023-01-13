package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.ChromeStartUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    //    TC #4: Iframe practice

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
//1. Open Chrome browser
        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      2.  Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/iframe");
    }

//    @Ignore if we want to pass the test not running the test  we should to do @ignore
    @Test
    public void iframe_test() {

//        We need to switch driver's focus to iframe

//        option#1 - switching to iframe using id attribute value
//        driver.switchTo().frame("mce_0_ifr");

//        option#2 - passing index number of iframe
//        driver.switchTo().frame(0);

//        option#3 - passing index number of iframe
   //     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

//        option#4 - passing index number of iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));

//        to locate the p tag
        WebElement yourContentGoesThere = driver.findElement(By.xpath("//p"));

//  4. Assert: “Your content goes here.” Text is displayed.

        Assert.assertTrue(yourContentGoesThere.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

//  5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement headerText = driver.findElement(By.xpath("//h3"));

//      assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());


    }


}
