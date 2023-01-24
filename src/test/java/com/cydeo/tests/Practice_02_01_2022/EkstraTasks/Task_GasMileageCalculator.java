package com.cydeo.tests.Practice_02_01_2022.EkstraTasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_GasMileageCalculator {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.calculator.net");

    }

    @Test
    public void gasMileageCalculator() {

//    Task #: Gas Mileage Calculator Automation Test
//1. Add a new class GasMileageCalculatorTest
//2. Go to https://www.calculator.net
// 3. Search for “gas mileage” using search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");
//4. Click on the “Gas Mileage Calculator” link
        WebElement searchLink = driver.findElement(By.xpath("//a[text()='Gas Mileage Calculator']"));
        searchLink.click();
//5. On Next page verify:
//    a. Title equals: “Gas Mileage Calculator”
        String expectedTitle = "Gas Mileage Calculator";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

//    b. “Gas Mileage Calculator” label is displayed
        WebElement labelIsDisplayed = driver.findElement(By.xpath("//h1"));
        labelIsDisplayed.isDisplayed();

        WebElement usUnits = driver.findElement(By.xpath("//a[text()='US Units']"));
        usUnits.click();

//6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometer = driver.findElement(By.xpath("//input[@id='uscodreading']"));
        currentOdometer.clear();
        currentOdometer.sendKeys("7925");
//7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer = driver.findElement(By.xpath("//input[@id='uspodreading']"));
        previousOdometer.clear();
        previousOdometer.sendKeys("7550");
//8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded = driver.findElement(By.xpath("//input[@id='usgasputin']"));
        gasAdded.clear();
        gasAdded.sendKeys("16");
//9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice = driver.findElement(By.xpath("//input[@id='usgasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");
//10. Click on Calculate button
        WebElement calculateButton = driver.findElement(By.xpath("(//input[@src='//d26tpo4cm8sb6k.cloudfront.net/img/svg/calculate.svg'])[1]"));
        calculateButton.click();
//11. Verify mpg value is as expected:
//    Expected value: “23.44 mpg”
        WebElement mpgValue = driver.findElement(By.xpath("(//b)[1]"));
        String expectedValue = "23.44 mpg";
        String actualValue = mpgValue.getText();
        Assert.assertEquals(actualValue, expectedValue);
    }
}