package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_day11_CircleDragAndDrop {
//    TC #: Drag and drop
    @Test
    public void dragAndDrop(){
//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//Locate "AcceptCookies" button and click
        WebElement acceptCookies= Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookies.click();

        JavascriptExecutor js = (JavascriptExecutor)  Driver.getDriver();

        js.executeScript("window.scrollBy(0,300)");
//Locate the small and big circles.
        WebElement smallCircle= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

//2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
//3. Assert:
        String expectedText ="You did great!";
        String actualText= bigCircle.getText();
        Assert.assertEquals(expectedText,actualText);
//Text in big circle changed to: “You did great!”



    }
}
