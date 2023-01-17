package org.example.pages;

//import com.automation.step_definitions.Hooks;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement RegLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));

    }
    public WebElement selectGen()
    {
        return Hooks.driver.findElement(By.className("male"));

    }
    public WebElement FtName()
    {

        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement LtName()
    {
        return Hooks.driver.findElement(By.id("LastName"));

    }
    public WebElement DateBirthday()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement DateBirthMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement DateBirthYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement EM()
    {
        return Hooks.driver.findElement(By.name("Email"));

    }
    public WebElement Page()
    {
        return Hooks.driver.findElement(By.className("form-fields"));

    }

    public WebElement PW()
    {
        return Hooks.driver.findElement(By.name("Password"));

    }
    public WebElement PwCon()
    {
        return Hooks.driver.findElement(By.name("ConfirmPassword"));

    }


    public void writeFtAndLt(String firstName, String LastName){
        FtName().sendKeys(firstName);
        LtName().sendKeys(LastName);
    }
    public void selectBirthdayDate(String day, String month, String year){
        DateBirthday().sendKeys(day);
        DateBirthMonth().sendKeys(month);
        DateBirthYear().sendKeys(year);
    }
    public void writeEm(String email){

        EM().sendKeys(email);
    }

    public void writePw(String password , String confirmPassword){

        PW().sendKeys(password);
        PwCon().sendKeys(confirmPassword);


    }
    public WebElement RegButn()
    {
        return Hooks.driver.findElement(By.name("register-button"));

    }
    public WebElement successMSG()
    {
        return Hooks.driver.findElement(By.className("result"));

    }
}
