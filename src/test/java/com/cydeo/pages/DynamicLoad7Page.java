package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DynamicLoad7Page {

    //#1-Create constructor and instantiate driver and object of the class

    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block'] ")
    public WebElement spongeBobImage;

}