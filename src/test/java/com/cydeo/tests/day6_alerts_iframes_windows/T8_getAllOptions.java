package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_getAllOptions {

        //    TC #8: Selecting value from multiple select dropdown

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            //  1. Open Chrome browser
            driver = ChromeStartUtility.chromeStart();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //  2. Go to http://practice.cybertekschool.com/dropdown
            driver.get("http://practice.cybertekschool.com/dropdown");
        }

        @Test
        public void allTheOptions() {

            //     3. Select all the options from multiple select dropdown.
            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
            //Select stateDropdown = new Select(driver.findElement(By.name("Languages")));

            List<WebElement> allTheOptions = stateDropdown.getOptions();
            int value = 0;
            for (WebElement each : allTheOptions) {

                //      stateDropdown.selectByIndex((value++));
                //      stateDropdown.selectByVisibleText((each.getText()));
                stateDropdown.selectByValue((each.getAttribute("value")));
                //     4. Print out all selected values.
                System.out.println(each.getText());
                WaitUtility.sleep(1);
            }
            //      5. Deselect all values.
            stateDropdown.deselectAll();

        }

    }

