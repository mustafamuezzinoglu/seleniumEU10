package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

//        TC #6: StaleElementReferenceException Task
//        1- Open a chrome browser
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//        3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

//        4- Refresh the page.
        WaitUtility.sleep(3);
        driver.navigate().refresh();
//        5- Verify it is displayed, again.
      //  WebElement cydeoLink1 = driver.findElement(By.xpath("//a[.='CYDEO']"));
      cydeoLink= driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

//  This is a simple StaleElementReferenceException to understand what is
//        this exception and how to handle it.
    }
}
