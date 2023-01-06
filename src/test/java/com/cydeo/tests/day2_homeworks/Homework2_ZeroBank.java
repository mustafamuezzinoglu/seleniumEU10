package com.cydeo.tests.day2_homeworks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework2_ZeroBank {
    public static void main(String[] args) {
//        TC #2: Zero Bank header verification
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//        3. Verify header text
//        Expected: “Log in to ZeroBank”
        WebElement headerText = driver.findElement(By.tagName("h3"));
        headerText.getText();
        String expectedHeadaerText = "Log in to ZeroBank";
        String actualHeadaerText = headerText.getText();
        System.out.println("actualHeadaerText = " + actualHeadaerText);

        if (actualHeadaerText.equals(expectedHeadaerText)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
        }


    }
}
