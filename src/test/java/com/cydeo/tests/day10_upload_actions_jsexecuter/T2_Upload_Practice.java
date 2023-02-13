package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

//        2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\Asus\\OneDrive\\Masaüstü\\CYDEO\\html class\\cybertruck.jpeg";
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);
//        3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-submit"));
        fileUpload.click();
//        4. Assert:
//        -File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }

}
