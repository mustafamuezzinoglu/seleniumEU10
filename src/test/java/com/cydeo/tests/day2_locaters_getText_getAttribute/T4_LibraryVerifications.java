package com.cydeo.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerifications {
    public static void main(String[] args) {

//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");
//        3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");
//        4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");
//        5. Click the sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

//        6. Verify: visually “Sorry, Wrong Email or Password”
//        displayed
        WebElement displayedWarning = driver.findElement(By.className("alert-danger"));
        String expectedWarning = "Sorry, Wrong Email or Password";
        String actualWarning = displayedWarning.getText();
        if(actualWarning.equalsIgnoreCase(expectedWarning)){
            System.out.println("Displayed warning PASSED!");
        }else{
            System.out.println("actualWarning = " + actualWarning);
            System.out.println("expectedWarning = " + expectedWarning);
            System.out.println("Displayed warning FAILED!");
        }

//        PS: Locate username input box using “className” locator
//        Locate password input box using “id” locator
//        Locate Sign in button using “tagName” locator




    }
}
