package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    // initialize the driver instance and object of the class
    public LibraryLoginPage() {

//initElements method will create connection in between the current driver session and object of the current class
        PageFactory.initElements(Driver.getDriver(), this);
    }

//        use @FindBy annotayion to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath="//div[.='This field is required.']/div")
    public WebElement requiredField;

    @FindBy(xpath="//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath="//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;





}

