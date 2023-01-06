package com.cydeo.tests.day2_homeworks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook_Task2 {

    public static void main(String[] args) throws InterruptedException {

//        TC #2: Facebook incorrect login title verification
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//        3. Enter incorrect username
        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='email']"));
        inputUsername.sendKeys("incorrect username");
//        4. Enter incorrect password
        WebElement inputPassword = driver.findElement(By.cssSelector("input[id='pass']"));
        inputPassword.sendKeys("incorrect password");
//        5. click the Log in button:
        WebElement logInButton = driver.findElement(By.cssSelector("button[name='login']"));
        logInButton.click();
//        6. Verify title changed to:
//        Expected: “Log into Facebook”
       Thread.sleep(1000);
        String expectedTitle2 = "Log in to Facebook";
        String actualTitle2 = driver.getTitle();
        System.out.println("expectedTitle2 = " + expectedTitle2);
        System.out.println("actualTitle2 = " + actualTitle2);
        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println(" Title verification is PASSED!");
        } else {

            System.out.println(" Title verification is FAILED!");
        }
    }
}
//• There are some tips in the 2nd page for whoever needs it.
//• Please try to solve yourself first before moving to the tips.
