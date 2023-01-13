package com.cydeo.tests.Practice_02_01_2022;

import com.cydeo.utilities.Before_Method;
import com.cydeo.utilities.WaitUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstChallengeZiya extends Before_Method {

    WebDriver driver;

    @Test
    public void WiredPhone() {


        driver.get("https://flipkart.com");

        WebElement xbutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        xbutton.click();
        WaitUtility.sleep(2);

//        WebElement searchbutton = driver.findElement(By.cssSelector("input._3704LK"));
//        searchbutton.sendKeys("laptop"+ Keys.ENTER);
//        WaitUtility.waitSeconds(2);
//        WebElement loginButton = driver.findElement(By.cssSelector("a._1_3w1N"));
//        loginButton.click();

        driver.navigate().refresh();
//        WebElement elektronics = driver.findElement(By.xpath("//a[text()='Wired Headphones']"));
        WebElement elektronics = driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/audio-video/headphones/pr?sid=0pm%2Cfcn&otracker=categorytree&p%5B%5D=facets.connectivity%255B%255D%3DWired&fm=neo%2Fmerchandising&iid=M_e1216b04-c9bc-4b6f-a05e-8d15b86e3c8c_1_372UD5BXDFYS_MC.LSKPCXUOS6SB&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~Wired%2BHeadphones_LSKPCXUOS6SB&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L2_view-all&cid=LSKPCXUOS6SB']"));
        elektronics.click();
    }

    @Test
    public void tshirt() {
//        WebElement tshirt = driver.findElement(By.cssSelector("div.lrtEPN"));
//        tshirt.click();

    }
}

