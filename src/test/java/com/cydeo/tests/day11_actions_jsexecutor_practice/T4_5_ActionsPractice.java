package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_5_ActionsPractice {
    //    TC #4: Scroll practice
    @Test
    public void scrollPractice1() {
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
//  Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());

//Continue from where the Task 4 is left in the same test.
        actions.pause(2000).moveToElement(cydeoLink).perform();
        actions.pause(2000);
        WebElement home = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        for (int i = 0; i < 5; i++) {

//Scroll back up to “Home” link using PageUP button
            actions.sendKeys(Keys.PAGE_UP).perform();
        }
//to quit driver
        Driver.closeDriver();
    }


    //    TC #5: Scroll practice 2
    @Test
    public void scrollPractice2() {
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement poweredByCydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
//3- Scroll down to “Powered by CYDEO”
        js.executeScript("arguments[0].scrollIntoView();", poweredByCydeo);
    }


}
