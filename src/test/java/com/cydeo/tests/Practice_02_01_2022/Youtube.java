package com.cydeo.tests.Practice_02_01_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Youtube {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        List<WebElement> webElementList = driver.findElements(By.tagName("a"));
        System.out.println("webElementList.size() = "+ webElementList.size());
        System.out.println(webElementList);
        for (WebElement each : webElementList){
            System.out.println(each.getAttribute("href"));
            System.out.println(each.getText());

        }







    }
}
