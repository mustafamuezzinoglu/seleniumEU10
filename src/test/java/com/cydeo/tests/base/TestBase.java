package com.cydeo.tests.base;

import com.cydeo.utilities.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
