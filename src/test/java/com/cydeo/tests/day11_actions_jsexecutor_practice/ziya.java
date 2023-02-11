package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WaitUtility;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class ziya {
    @Test
    public void javascript_executor_test1() {

        Driver.getDriver().get("https://www.alodokter.com/");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String str = "document.querySelector(\"hero-view\").shadowRoot.querySelector(\"#searchSpecialities\").value = \"Mustafa\";";
        js.executeScript(str);

//        document.querySelector("#content > hero-view").shadowRoot.querySelector("#searchSpecialities")

    }

    @Test
    public void textName() {

        Driver.getDriver().get("https://books-pwakit.appspot.com/");
        //find shadow host
        WebElement shadowHost = Driver.getDriver().findElement(By.tagName("book-app"));

        //execute JavaScript to return the shadow root
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();

        WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement app_header = shadowRoot.findElement(By.tagName("app-header"));
        WebElement app_toolbar = app_header.findElement(By.cssSelector(".toolbar-bottom"));
//        WebElement book_input_decorator = app_toolbar.findElement(By.tagName("book-input-decorator"));
//        WebElement searchField = book_input_decorator.findElement(By.id("input"));
//        searchField.sendKeys("Shadow DOM With Find Element");


        //Find the webElement then perform an action on the WebElement


//        WebElement inputBox = shadowRoot.findElement(By.cssSelector(".search-in-alodokter"));
//
//        inputBox.sendKeys("ali");
    }

    @Test
    public void todomvc(){
        Driver.getDriver().get("http:/todomvc.com");
        Driver.getDriver().findElement(By.xpath("//div[@class='tab-content flex-auto center-center horizontal layout style-scope paper-tab']")).click();
        WaitUtility.sleep(2);
        Driver.getDriver().findElement(By.xpath("//a[@href='examples/polymer/index.html']")).click();
        WaitUtility.sleep(2);
        Driver.getDriver().findElement(By.id("new-todo")).sendKeys("one" + Keys.ENTER);
        WaitUtility.sleep(2);
        Driver.getDriver().findElement(By.id("new-todo")).sendKeys("two" + Keys.ENTER);
        WaitUtility.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        WebElement two = Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
        actions.doubleClick(two).pause(2000).doubleClick().pause(2000).sendKeys(Keys.DELETE).perform();
        WaitUtility.sleep(2);
        actions.sendKeys("CCC" + Keys.ENTER).perform();
        WaitUtility.sleep(2);
        Driver.getDriver().close();

    }


}