package com.cydeo.utilities.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons ");
        RadioUtility.clickAndVerifyRadioButton(driver, "color", "black" );
        WaitUtility.sleep(2);
        RadioUtility.clickAndVerifyRadioButton(driver, "sport", "hockey" );



    }
}
