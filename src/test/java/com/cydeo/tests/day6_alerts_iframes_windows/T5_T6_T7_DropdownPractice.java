package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.ChromeStartUtility;
import com.cydeo.utilities.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T5_T6_T7_DropdownPractice {

    //    TC #5: Selecting state from State dropdown and verifying result

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open Chrome browser
        driver = ChromeStartUtility.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


    @Test
    public void dropdown_task5() {

        //    we located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        WaitUtility.sleep(1);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        WaitUtility.sleep(1);
        stateDropdown.selectByValue("VA");

        //5. Select California
        WaitUtility.sleep(1);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionsText = "California";
        String actualOptionsText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionsText, expectedOptionsText);


        //    Use all Select options. (visible text, value, index)

    }

    @Test
    public void dropdown_task5ForLoop() {
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        List<WebElement> states = stateDropdown.getOptions();
        for (WebElement eachstate : states) {
            //  stateDropdown.selectByValue((eachstate.getAttribute("value")));
            stateDropdown.selectByVisibleText((eachstate.getText()));
            System.out.println(eachstate.getText());
            //  System.out.println(eachstate.getAttribute("value"));
            WaitUtility.sleep(0.1);

        }
    }

    @Test
    public void dropdown_task6() {

//        Select “December 1st, 1924” and verify it is selected.

//        Select year using : visible text
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1924");

//        Select month using : value
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");

//        Select day using : index number
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);
//         and verify it is selected.
        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";
        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualDay = day.getFirstSelectedOption().getText();
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);
    }
    @Test
    public void dropdown_task7(){
//        TC #7: Selecting value from non-select dropdown
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
//        3. Click to non-select dropdown
        WebElement dropDownLink = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropDownLink.click();
//        4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebookLink.click();
//        5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle =  "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println(" Title verification is PASSED!");
        }else{
            System.out.println(actualTitle);
            System.out.println(" Title verification is FAILED!");
        }





    }


    @AfterMethod
    public void tearDownMethod(){
       driver.close();
    }


}
