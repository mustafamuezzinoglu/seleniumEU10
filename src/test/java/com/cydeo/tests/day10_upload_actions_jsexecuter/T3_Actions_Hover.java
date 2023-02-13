package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test() {
//        TC #3: Hover Test
//        1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" texts under here:
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

//2. Hover over to first image
        WaitUtility.sleep(1);
        actions.moveToElement(img1).perform();
        WaitUtility.sleep(2);
//3. Assert:
//a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
//b. “view profile” is displayed//a[@text()='View profile']
        WebElement viewProfile1 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/1']"));
        Assert.assertTrue(viewProfile1.isDisplayed());

//4. Hover over to second image
        actions.moveToElement(img2).perform();
        WaitUtility.sleep(2);
//5. Assert:
//a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());
//b. “view profile” is displayed
        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/2']"));
        Assert.assertTrue(viewProfile2.isDisplayed());

//6. Hover over to third image
        actions.moveToElement(img3).perform();
        WaitUtility.sleep(2);
//7. Confirm:
//a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());

//b. “view profile” is displayed
        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/3']"));
        Assert.assertTrue(viewProfile3.isDisplayed());

    }
}
