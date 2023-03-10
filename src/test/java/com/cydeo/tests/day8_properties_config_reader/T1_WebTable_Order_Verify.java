package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    //    TC #1: Web table practice

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test1() {

        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

        //WebElement pizzaButton = driver.findElement(By.xpath("//a[@href='https://www.google.com/search?q=pizza']"));
        //   pizzaButton.click();
// locator other method -- > //td[.='Bob Martin']/..//td[5]
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell = " + bobMartinCell);

        // 2. Verify Bob’s name is listed as expected.
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();
        System.out.println("bobMartinCell = " + bobMartinCell.getText());
        Assert.assertEquals(actualBobName, expectedBobName);

        //    Expected: “Bob Martin”
        //  3. Verify Bob Martin’s order date is as expected
        //   Expected: 12/31/2021

        WebElement bobMartinsOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobOrderDateCell = "12/31/2021";
        String actualBobOrderDateCell = bobMartinsOrderDate.getText();
        System.out.println("bobMartinsOrderDate = " + bobMartinsOrderDate.getText());
        Assert.assertEquals(actualBobOrderDateCell, expectedBobOrderDateCell);
    }

    @Test
    public void test2() {

        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    @Test
    public void test3() {
        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }


}







