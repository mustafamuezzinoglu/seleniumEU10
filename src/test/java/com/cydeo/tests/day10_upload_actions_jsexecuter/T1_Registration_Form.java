package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class T1_Registration_Form {

//    TC#1: Registration form confirmation
//    Note: Use JavaFaker OR read from configuration.properties file when possible.

    @Test
    public void registration_form_test() {
//1. Open browser

//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        Faker faker = new Faker(new Locale("en"));
//3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());
//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
//5. Enter username username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
//        inputUserName.sendKeys(faker.name().username().replace(".",""));
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);
//6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
//        String mail = faker.letterify("????????.???");
//        inputEmail.sendKeys(user + "@"+ mail);
        inputEmail.sendKeys(user + "@email.com");
//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
//        inputPassword.sendKeys(faker.numerify("########"));
        inputPassword.sendKeys(faker.internet().password());

//8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));
//9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();
//10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
//        faker.number().numberBetween(2004,1920);
        inputBirthday.sendKeys("03/10/2000");

//11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
//12. Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));
//13. Select programming language from checkboxes
        WebElement checkBoxCplusplus = Driver.getDriver().findElement(By.xpath("//input[@value='cplusplus']"));
        checkBoxCplusplus.click();
        WebElement checkBoxJava = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        checkBoxJava.click();
        WebElement checkBoxJavaScript = Driver.getDriver().findElement(By.xpath("//input[@value='javascript']"));
        checkBoxJavaScript.click();
//14. Click to sign up button
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signInButton.click();
//15. Verify success message “You’ve successfully completed registration.” is
//    displayed.

        WebElement successMessage = Driver.getDriver().findElement(By.tagName("p"));
        Assert.assertTrue(successMessage.isDisplayed());
    }
}
