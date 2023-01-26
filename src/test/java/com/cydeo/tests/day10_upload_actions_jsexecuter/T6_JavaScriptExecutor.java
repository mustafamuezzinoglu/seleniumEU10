package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WaitUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavaScriptExecutor {
//    TC #6: Scroll using JavascriptExecutor
    @Test
    public void javascript_executor_test1(){
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
//        ((JavascriptExecutor) Driver.getDriver())/executeScript(""); // typing different way
//3- Use below JavaScript method and scroll
//javaScript method to use : window.scrollBy(0,0)
        JavascriptExecutor js = (JavascriptExecutor)  Driver.getDriver();
        WaitUtility.sleep(1);
        js.executeScript("window.scrollBy(0,7500)");

//a.  750 pixels down 10 times.
        for (int i = 0; i <10 ; i++) {
            WaitUtility.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

//b.  750 pixels up 10 times
        for (int i = 0; i <10 ; i++) {
            WaitUtility.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }


    }

}
