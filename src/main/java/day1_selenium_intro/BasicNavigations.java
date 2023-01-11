package day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of the Selenium WEbdriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- this line will maximize the browser size
        driver.manage().window().maximize();

        //4- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println(" currentTitle = " + currentTitle);

        //get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 2 seconds
        Thread.sleep(2000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 2 seconds
        Thread.sleep(2000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 2 seconds
        Thread.sleep(2000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 2 seconds
        Thread.sleep(2000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting google page
        currentTitle = driver.getTitle();

        // System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println(" currentTitle = " + currentTitle);

        //get the current URL using selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);



        // this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();













    }


}
