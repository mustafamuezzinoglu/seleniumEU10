package com.cydeo.tests.day4_findElements_checkboxes_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
//        locate homelink using cssSelector class Value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
//        locate homelink using cssSelector .class Value
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
//        locate homelink using cssSelector href Value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));
//        locate homelink using xpath
        WebElement homeLink_ex4 = driver.findElement(By.xpath("//a[@href='/']"));
//        locate homelink using xpath
        WebElement homeLink_ex5 = driver.findElement(By.xpath("//a[@class='nav-link']"));
//        b. “Forgot password” header
        //        locate Forgot password using cssSelector parent class Value element and move down to child h2
        WebElement forgotPassword_ex1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        //        locate Forgot password using cssSelector parent .class element and move down to child h2
        WebElement forgotPassword_ex2 = driver.findElement(By.cssSelector("div.example>h2"));
        //        locate Forgot password using xpath using web element text "forgot Password"
        WebElement forgotPassword_ex3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //        locate Forgot password using xpath using parent // element and move down to child with / h2
        WebElement forgotPassword_ex4 = driver.findElement(By.xpath("//div/h2"));

//        c. “E-mail” text
        //        locate email label using xpath using label for
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        //        locate email label using cssSelector using label for
        WebElement emailLabel_ex2 = driver.findElement(By.cssSelector("label[for='email']"));
//        d. E-mail input box
        //        locate input box using xpath //tagname[@attribute='value']
        WebElement inputbox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
      //  inputbox_ex1.sendKeys("mustafamuezzinoglu@gmail.com");

//        locate input box using xpath //tagname[contains(@attribute,'value')]
        WebElement inputbox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

//        e. “Retrieve password” button
        //        locate Retrieve password button using xpath
        WebElement retrievePassword1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
 //       retrievePassword1.click();
//        locate Retrieve password button using cssSelector class value tagname.value
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("i.icon-2x.icon-signin"));

//        f. “Powered by Cydeo text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

//        4. Verify all web elements are displayed.
        System.out.println("homeLink_ex4.isDisplayed() = " + homeLink_ex4.isDisplayed());
        System.out.println("forgotPassword_ex2.isDisplayed() = " + forgotPassword_ex2.isDisplayed());
        System.out.println("emailLabel_ex2.isDisplayed() = " + emailLabel_ex2.isDisplayed());
        System.out.println("inputbox_ex2.isDisplayed() = " + inputbox_ex2.isDisplayed());
        System.out.println("retrievePassword2.isDisplayed() = " + retrievePassword2.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


//        First solve the task with using cssSelector only. Try to create 2 different
//        cssSelector if possible
//
//        Then solve the task using XPATH only. Try to create 2 different
//        XPATH locator if possible
    }
}
