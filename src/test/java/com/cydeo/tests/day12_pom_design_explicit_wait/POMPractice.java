package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class POMPractice {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        libraryLoginPage = new LibraryLoginPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
    //    TC #1: Required field error message test


    @Test
    public void Required_field_error_message_test() {

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
//        3- Do not enter any information
//        4- Click to “Sign in” button

        libraryLoginPage.signInButton.click();

//        5- Verify expected error is displayed:
//        Expected: This field is required.

        assertTrue(libraryLoginPage.requiredField.isDisplayed());

    }

    //    TC #2: Invalid email format error message test
    @Test
    public void invalid_email_format_error_message_test() {

//            1- Open a chrome browser
//            2- Go to: https://library1.cydeo.com
//            3- Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("sd@@asd.com");
        libraryLoginPage.signInButton.click();
//            4- Verify expected error is displayed:
//            Expected: Please enter a valid email address.
        assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

    }

    //    TC #3: Library negative login
    @Test
    public void library_negative_login() {

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
//        3- Enter incorrect username or incorrect password
//        libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.signInButton.click();

//        4- Verify title expected error is displayed:
//        Expected: Sorry, Wrong Email or Password

        assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

    }

}
