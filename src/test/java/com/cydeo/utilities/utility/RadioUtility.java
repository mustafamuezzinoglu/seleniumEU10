package com.cydeo.utilities.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioUtility {

    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String ID){
        for (WebElement each : driver.findElements(By.name(name))) {
            System.out.println(each.getAttribute("id"));
            driver.findElement(By.id(ID)).click();

        }


    }


}
