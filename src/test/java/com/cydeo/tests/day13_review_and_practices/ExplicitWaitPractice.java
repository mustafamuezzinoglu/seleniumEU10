package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractice {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    //    TC #2: Explicit wait practice
    @Test
    public void remove_button_test() {

//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
//   we are using before method

//3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

//4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

// 5- Verify:
//    a. Checkbox is not displayed
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }
//    b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));

        Driver.closeDriver();
    }


    //    TC #3: Explicit wait practice
    @Test
    public void enable_button_test() {

//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
        //we are using before method

//3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

//4- Wait until “loading bar disappears”
BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

//5- Verify:
//    a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());
//    b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
//      c.Check the String value is matching as expected: “It’s enabled!”
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));


Driver.closeDriver();
    }

}