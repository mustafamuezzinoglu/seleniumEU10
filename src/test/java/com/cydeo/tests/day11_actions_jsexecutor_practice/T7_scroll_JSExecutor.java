package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_scroll_JSExecutor {
//    TC #7: Scroll using JavascriptExecutor
    @Test
    public void scroll_test(){
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
//Down-casting our driver type to JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
//3- Scroll down to “Cydeo” link
        WaitUtility.sleep(3);
        js.executeScript("arguments[0].scrollIntoView(true);", cydeoLink);
        WaitUtility.sleep(3);
//4- Scroll up to “Home” link
//        js.executeScript("arguments[1].scrollIntoView(true);", cydeoLink, homeLink);
        js.executeScript("arguments[0].scrollIntoView(true);", homeLink);
        WaitUtility.sleep(3);
//5- Use below provided JS method only
//JavaScript method to use : arguments[0].scrollIntoView(true)
//Note: You need to locate the links as web elements and pass them as arguments into executeScript() method

        Driver.closeDriver();


    }


}
