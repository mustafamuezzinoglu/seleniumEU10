package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {

    public static void main(String[] args) {

//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #2: Radiobutton handling
//        1. Open Chrome browser
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
//        3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        WaitUtility.waitSeconds(2);
        hockeyRadioButton.click();
//        4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyRadioButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else{
            System.err.println("Button is NOT selected. Verification FAILED!");
        }
        System.out.println("hockeyRadioButton.isSelected() = " + hockeyRadioButton.isSelected());
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS



    }
}
