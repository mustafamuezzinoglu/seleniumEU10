package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
      WebElement loginButton = driver.findElement(By.className("login-btn"));
//      LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
//      WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));
//                                                         tagName[attribute='value']
//                                                         input[class='login-btn']
//        LOCATED USING CLASS ATTRIBUTE
//      WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
//        LOCATED USING TYPE ATTRIBUTE
//      WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
//        LOCATED USING VALUE ATTRIBUTE
//        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expextedLogInButton = "Log In";
        String actualLogInButton = loginButton.getAttribute("value");
        if (actualLogInButton.equals(expextedLogInButton)) {
            System.out.println("Log In button verification is PASSED!");
        } else {
            System.out.println("Log In button verification is FAILED!");
        }


//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//        PS2: Pay attention to where to get the text of this button from


    }
}
