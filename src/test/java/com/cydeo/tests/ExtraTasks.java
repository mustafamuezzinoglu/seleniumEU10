package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExtraTasks {

    //    TC #1: Smartbear software link verification

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void smartbearTest(){

    }

//1. Open browser
//2. Go to website:
//    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//            3. Enter username: “Tester”
//            4. Enter password: “test”
//            5. Click to Login button
//6. Print out count of all the links on landing page
//7. Print out each link text on this page
//
//    Mini-Task: CREATE A CLASS à SmartBearUtils
//• Create a method called loginToSmartBear
//• This method simply logs in to SmartBear when you call it.
//• Accepts WebDriver type as parameter
//
//    TC#2: Smartbear software order placing
//1. Open browser
//2. Go to website:
//    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//            3. Enter username: “Tester”
//            4. Enter password: “test”
//            5. Click on Login button
//6. Click on Order
//7. Select familyAlbum from product, set quantity to 2
//            8. Click to “Calculate” button
//9. Fill address Info with JavaFaker
//• Generate: name, street, city, state, zip code
//10. Click on “visa” radio button
//11. Generate card number using JavaFaker
//12. Click on “Process”
//            13. Verify success message “New order has been successfully added.”
}
