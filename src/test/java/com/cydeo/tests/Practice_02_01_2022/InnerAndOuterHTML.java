package com.cydeo.tests.Practice_02_01_2022;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InnerAndOuterHTML {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://etsy.com");
String getText = driver.findElement(By.xpath("//p[contains(.,'Home Decor')][1]")).getText();
        System.out.println(getText);





    }
}
