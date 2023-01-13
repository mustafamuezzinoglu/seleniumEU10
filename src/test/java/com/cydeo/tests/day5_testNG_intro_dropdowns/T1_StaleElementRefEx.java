package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {

//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: StaleElementReferenceException handling
//        1. Open Chrome browser
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

//        3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        WaitUtility.sleep(2);
        addElementButton.click();
//        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
//        5. Click to “Delete” button.
        WaitUtility.sleep(2);
        deleteButton.click();
//        6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");

        }
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        driver.close();
    }
}
