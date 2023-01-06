package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification is PASSED!");
        }else{
            System.out.println("Label verification is FAILED!");
        }
//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();
        if(actualForgotPasswordLinkText.equalsIgnoreCase(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification is PASSED!");
        }else{
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);

            System.out.println("Forgot password link verification is FAILED!");
        }
//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String expectedForgotPasswordHref= "https://login1.nextbasecrm.com/?forgot_password=yes";
        String actualForgotPasswordHref = forgotPasswordLink .getAttribute("href");
        System.out.println("actualForgotPasswordHref = " + actualForgotPasswordHref);
        if(actualForgotPasswordHref.contains(expectedForgotPasswordHref)){
            System.out.println("HREF attribute value verification is PASSED!");
        }else{
            System.out.println("HREF attribute value verification is FAILED!");
        }
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.


    }
}
