package com.cydeo.tests.Practice_02_01_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.JavascriptExecutor;
//import org.testng.annotations.Test;
//public class ScrollByPixel {WebDriver sürücüsü;@Ölçekpublic void ByPixel () {System.setProperty ("webdriver.chrome.driver", "E: //Selenium//Selenium_Jars//chromedriver.exe");sürücü = yeni ChromeDriver ();JavascriptExecutor js = (JavascriptExecutor) sürücüsü;// Uygulamayı başlatdriver.get ("http://demo.guru99.com/test/guru99home/");// Pencereyi büyütmek için. Bu kod Selenium 3 kavanozlarla çalışmayabilir. Komut dosyası başarısız olursa aşağıdaki satırı kaldırabilirsinizdriver.manage (). window (). maximize ();// Bu, sayfayı 1000 piksel dikey kaydırırjs.executeScript ("window.scrollBy (0,1000)");}}

public class Youtube2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://youtube.com");

//        WebElement signInBttn = driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
//        signInBttn.click();

//        WebElement threeline = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[1]/yt-icon-button[2]/button/yt-icon"));
//        threeline.click();

WebElement setingsBttn = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item"));

setingsBttn.click();




    }
}
