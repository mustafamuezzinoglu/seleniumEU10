package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.ChromeStartUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // Create browser driver setup
        //Open browser
        driver = ChromeStartUtility.chromeStart();
    }

@AfterMethod
public void tearDownMethod() {
driver.close();
}

    @Test
    public void selenium_test(){

        //Maximize the page
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Get "https://google.com"
        driver.get("https://google.com");
        //Assert: title is  "Google"
        String actualTitle = driver.getTitle() ;
        String expectedTitle = "Google" ;

        Assert.assertEquals(actualTitle,expectedTitle,"Your message will go here ");



    }

}
