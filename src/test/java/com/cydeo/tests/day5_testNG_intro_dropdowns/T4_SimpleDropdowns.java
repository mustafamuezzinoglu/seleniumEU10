package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.utility.ChromeStartUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    //        TC#4: Verifying “Simple dropdown” and “State selection” dropdown
//        default values
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest() {

//        3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOption.getText();

        String expectedSimpleDropdownText = "Please select an option";

//        Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

//        4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//        Expected: “Select a State”
        String expectedStateDropdownText = "Select a State";

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);
    }
}
