package com.cydeo.tests.Practice_02_01_2022.EkstraTasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1_2 {
    //TC#3: Smartbear software order verification
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //. Open browser and login to Smartbear software
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }


    @Test
    public void  orderVerification(){


//        3. Enter username: “Tester”
    WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
    username.click();
    username.sendKeys("Tester");
    //4. Enter password: “test”
    WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("test");
    //5. Click to Login button
    WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
    loginButton.click();
// 6. Print out count of all the links on landing page
        List<WebElement> webElementLinks = driver.findElements(By.tagName("a"));
        System.out.println("webElementLinks size = " + webElementLinks.size());
//  7. Print out each link text on this page
        for (WebElement eachLink : webElementLinks) {
            System.out.println(eachLink.getAttribute("href"));
            System.out.println(eachLink.getText());
        }

    }
}

class SmartBearUtils {
    public static void loginToSmartBear(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.click();
        username.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        //5. Click to Login button
        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }
}
/*


Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter
TC#2: Smartbear software order placing
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”
 */