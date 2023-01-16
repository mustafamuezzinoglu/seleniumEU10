package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3 {

    //    TC #3: Create a custom method
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/tables
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    //            3- Write custom method:
    //            • Method name: getTableGetEmail()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String tableNum
    //• Arg3: String firstName

    @Test
    public void getTableGetEmail(WebDriver driver, String tableNum, String firstName){


    }

}

