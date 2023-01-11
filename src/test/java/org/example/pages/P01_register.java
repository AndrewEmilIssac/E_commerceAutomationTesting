package org.example.pages;

//import com.automation.step_definitions.Hooks;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));

    }
    public WebElement selectGender()
    {
        return Hooks.driver.findElement(By.className("male"));

    }
    public WebElement FirstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement LastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));

    }
    public WebElement DateOfBirthDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement DateOfBirthMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement DateOfBirthYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement Email()
    {
        return Hooks.driver.findElement(By.name("Email"));

    }
    public WebElement Page()
    {
        return Hooks.driver.findElement(By.className("form-fields"));

    }

    public WebElement Password()
    {
        return Hooks.driver.findElement(By.name("Password"));

    }
    public WebElement PasswordConfirm()
    {
        return Hooks.driver.findElement(By.name("ConfirmPassword"));

    }


    public void writeFirstAndLast(String firstName,String LastName){
        FirstName().sendKeys(firstName);
        LastName().sendKeys(LastName);
    }
    public void selectDateOfBirthday(String day,String month,String year){
        DateOfBirthDay().sendKeys(day);
        DateOfBirthMonth().sendKeys(month);
        DateOfBirthYear().sendKeys(year);
    }
    public void writeEmail(String email){

        Email().sendKeys(email);
    }

    public void writePassword(String password ,String confirmPassword){

        Password().sendKeys(password);
        PasswordConfirm().sendKeys(confirmPassword);


    }
    public WebElement RegisterBtn()
    {
        return Hooks.driver.findElement(By.name("register-button"));

    }
    public WebElement GetSuccessMsg()
    {
        return Hooks.driver.findElement(By.className("result"));

    }
}
