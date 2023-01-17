package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    String URL;
    String errMsg;
    P02_login log = new P02_login();
    SoftAssert soft= new SoftAssert();

@Given("user go to login page")

public void userGoToLoginPage(){
log.clickOnLogIn().click();
}


@When("user login with  \"(.*)\" and \"(.*)\"$")

    public void userLoginValid(String email,String password){
    log.writeEmAndPW(email, password);
}

@And("user press on login button")

    public void clickOnLogin(){
    log.loginButton().click();
}

@Then("user login to the system successfully")

    public void loginToSystemSuccessfully(){

    URL = log.getURL();

    Assert.assertTrue(URL.contains("https://demo.nopcommerce.com/"));
}
@Then("user could not login to the system")

    public void CouldntLog(){

        errMsg = log.getErrorMsg().getText();
    soft.assertTrue(errMsg.contains("Login was unsuccessful"));

    }

}

