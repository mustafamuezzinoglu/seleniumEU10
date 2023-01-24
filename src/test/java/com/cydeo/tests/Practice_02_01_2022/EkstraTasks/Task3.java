package com.cydeo.tests.Practice_02_01_2022.EkstraTasks;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void smartbearSoftwareOrderVerification(){

//        2. Click on View all orders
        WebElement viewAllOrders = driver.findElement(By.linkText("View all orders"));
        viewAllOrders.click();
//        3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement dateSusanMclaren = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/following-sibling::td[3]"));

      String expectedDate = "01/05/2010";
      String actualDate = dateSusanMclaren.getText();

       Assert.assertEquals(expectedDate,actualDate);


    }

}
