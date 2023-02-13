package com.cydeo.utilities.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeStartUtility {

        public static WebDriver chromeStart(){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    }
