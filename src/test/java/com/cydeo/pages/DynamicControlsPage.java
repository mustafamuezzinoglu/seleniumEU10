package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.google.common.base.Verify;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class DynamicControlsPage {

    public DynamicControlsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(xpath = " //input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy(css= "input[type='text']")
    public WebElement inputBox;
}
