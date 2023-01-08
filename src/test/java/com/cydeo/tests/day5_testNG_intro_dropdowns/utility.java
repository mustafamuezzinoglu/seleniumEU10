package com.cydeo.tests.day5_testNG_intro_dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class utility {
    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String IDValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");
            if(eachId.equals(IDValue)){
                each.click();
                System.out.println(eachId + " is Selected = " + each.isSelected());
            }
        }



    }
}
