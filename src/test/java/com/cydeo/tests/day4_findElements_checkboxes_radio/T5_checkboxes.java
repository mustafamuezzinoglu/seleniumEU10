package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {

//        Practice: Checkboxes
        WebDriver driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1Selected = driver.findElement(By.cssSelector("input#box1"));
        System.out.println("checkbox1Selected.isSelected() = " + !checkbox1Selected.isSelected());

//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2Selected = driver.findElement(By.cssSelector("input#box2"));
        System.out.println("checkbox2Selected.isSelected() = " + checkbox2Selected.isSelected());

//        4. Click checkbox #1 to select it.
        WaitUtility.sleep(1.25);
        checkbox1Selected.click();

//        5. Click checkbox #2 to deselect it.
        WaitUtility.sleep(1);
        checkbox2Selected.click();

//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1Selected.isSelected() = " + checkbox1Selected.isSelected());

//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2Selected.isSelected() = " + !checkbox2Selected.isSelected());



    }
}
