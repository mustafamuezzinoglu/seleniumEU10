package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities_day7_task4 {
    /*
       This method will log in with helpdesk1@cybertekschool.com
        user when it is called
        */
    public static void crm_login(WebDriver driver){

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        helpdesk1@cybertekschool.com UserUser
//        Helpdesk2@cybertekschool.com UserUser
        inputUserName.sendKeys("helpdesk2@cybertekschool.com");

//        4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

//        5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

    public static void crm_login(WebDriver driver, String userName, String password){

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        helpdesk1@cybertekschool.com UserUser
//        Helpdesk2@cybertekschool.com UserUser
        inputUserName.sendKeys(userName);

//        4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

//        5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
}
