package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3 {

    public static void main(String[] args) {

//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #3: Utility method task for (continuation of Task2)
//            1. Open Chrome browser
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        utility.clickAndVerifyRadioButton(driver, "color", "blue");

        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");


    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String IDValue) {
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");
            if (eachId.equals(IDValue)) {
                each.click();
                System.out.println(eachId + " is Selected = " + each.isSelected());
            }
        }
    }
}

//        //Locate name='sports' radio buttons and store them in a List of Web Element
//        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));
//
//        for (WebElement each : sportRadioButtons) {
//            String eachId = each.getAttribute("id");
//            System.out.println("eachId = " + eachId);
//
//            if(eachId.equals("hockey")){
//                each.click();
//                System.out.println("hockey is Selected = " + each.isSelected());
//                break;
//            }
//        }

////        3. Click to “Hockey” radio button
//        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
//        WaitUtility.waitSeconds(2);
//        hockeyRadioButton.click();
////        4. Verify “Hockey” radio button is selected after clicking.

//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//        Create a utility method to handle above logic.
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver
//        2. Name attribute as String (for providing which group of radio buttons)
//        3. Id attribute as String (for providing which radio button to be clicked)
//        Method should loop through the given group of radio buttons. When it finds the
//        matching option, it should click and verify option is Selected.
//                Print out verification: true