package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils_withDay8Task5 {

    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedTitle) {

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
           WaitUtility.sleep(2);
//5. Assert: Title contains “Etsy”
//    Lines to be pasted:
            if (driver.getCurrentUrl().contains(expectedUrl)) {
                break;
            }
        }
    }
    /*
     This method accepts a String "expectedTitle" and Asserts if it is true
      */
    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
}
