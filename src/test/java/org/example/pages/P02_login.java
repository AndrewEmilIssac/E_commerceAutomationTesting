package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement clickOnLogIn()
    {
        return Hooks.driver.findElement(By.className("ico-login"));

    }
    public WebElement writeEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement writePassword()
    {
        return Hooks.driver.findElement(By.id("Password"));

    }
    public void writeEmailAndPasssword(String email, String password){
        writeEmail().sendKeys(email);
        writePassword().sendKeys(password);

    }
    public WebElement clickOnLogInBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));

    }
    public String getURL()
    {
        return Hooks.driver.getCurrentUrl();

    }
    public WebElement getErrorMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.message-error.validation-summary-errors"));

    }



}
