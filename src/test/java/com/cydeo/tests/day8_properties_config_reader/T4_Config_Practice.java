package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

//    public WebDriver driver;
//1- Open a chrome browser
//2- Go to: https://google.com

//    @BeforeMethod
//    public void setUpMethod() {
//        //We are getting the browserType dynamically from our configuration.properties file
//        String browserType = ConfigurationReader.getProperty("browser");

//        driver = WebDriverFactory.getDriver(browserType);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @Test
    public void google_search_test() {
//        Driver.getrDriver() --> driver
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
//3 - Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

//4- Verify title:
//Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue") +" - Google'da Ara";
        WaitUtility.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
//        Use `configuration.properties` for the following:
//        1. The browser type
//        2. The URL
//        3. The search keyword
//        4. Make title verification dynamic. If search value changes, title assertion should not fail.

    }

}
