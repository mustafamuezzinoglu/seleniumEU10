package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import com.google.common.base.Verify;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day6_Tasks {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open Chrome browser
        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      2.  Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

//    TC #1: Information alert practice

    @Test
    public void Task1_JsAlert(){

//    3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();

//    To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

//4. Click to OK button from the alert
        WaitUtility.sleep(1);
        alert.accept();

//5. Verify “You successfully clicked an alert” text is displayed.
        WebElement afterAlertText = driver.findElement(By.cssSelector("p#result"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(afterAlertText.isDisplayed(), "result text is Not displayed");

        System.out.println("You successfully clicked an alert is Displayed = " + afterAlertText.isDisplayed());

        String expectedText = "You successfully clicked an alert";
        String actualText = afterAlertText.getText();

        Assert.assertEquals(actualText,expectedText, "Actual result text is not as expected!!!");

    }

    @Test
    public void Task2_JsConfirm(){
//        TC #2: Confirmation alert practice
//        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
//        3. Click to “Click for JS Confirm” button
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();

//    To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

//4. Click to OK button from the alert
        WaitUtility.sleep(1);
        alert.accept();

//        5. Verify “You clicked: Ok” text is displayed.
        WebElement afterAlertText = driver.findElement(By.cssSelector("p#result"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(afterAlertText.isDisplayed(), "result text is Not displayed");

        System.out.println("You clicked: Ok is Displayed = " + afterAlertText.isDisplayed());

        String expectedText = "You clicked: Ok";
        String actualText = afterAlertText.getText();

        Assert.assertEquals(actualText,expectedText, "Actual result text is not as expected!!!");

    }

    @Test
    public void Task3_JsPrompt(){
//    TC #3: Information alert practice
//        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
//        3. Click to “Click for JS Prompt” button
        WebElement jsPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptButton.click();

//    To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

//4. Click to OK button from the alert
        WaitUtility.sleep(2);
        alert.sendKeys("hello");

        WaitUtility.sleep(3);
        alert.accept();

//        5. Verify “You clicked: Ok” text is displayed.
        WebElement afterAlertText = driver.findElement(By.cssSelector("p#result"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(afterAlertText.isDisplayed(), "result text is Not displayed");

        System.out.println("You entered: hello is Displayed = " + afterAlertText.isDisplayed());

        String expectedText = "You entered: hello";
        String actualText = afterAlertText.getText();

        Assert.assertEquals(actualText,expectedText, "Actual result text is not as expected!!!");

    }


//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Prompt” button
//4. Send “hello” text to alert
//5. Click to OK button from the alert
//6. Verify “You entered: hello” text is displayed.
}
