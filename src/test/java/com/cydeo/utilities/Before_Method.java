package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Before_Method {


    /**
     * it provides us to open a chrome page and to maximize it easily every before test method
     *
     * @param
     * @return
     */
    @BeforeMethod
    public static void setUpMethod(   WebDriver driver, String page) {

        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(page);

    }
}
