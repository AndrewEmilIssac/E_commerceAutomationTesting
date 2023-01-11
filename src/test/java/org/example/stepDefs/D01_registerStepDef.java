package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    String msg;
    String comp = "complete";
    P01_register reg = new P01_register();
    SoftAssert soft= new SoftAssert();

    @Given("user go to register page")
    public void goRegisterPage() {
        reg.registerlink().click();
    }


    @When("user select gender type")
    public void selectGenderType() {
        reg.selectGender().click();
    }

    @And("user enter first name\"Andrew\" and last name\"Emil\"")
    public void enterFirstAndLastName() {
        reg.writeFirstAndLast("Andrew", "Emil");
    }

    @And("user enter date of birth")
    public void enterDateOfBirth() {

        reg.selectDateOfBirthday("24", "April", "1999");
         reg.Page().click();

    }

    @And("user enter email \"test@example.com\" field")
    public void enterEmailField() {
        reg.Email().click();
        reg.writeEmail("test@example.com");

    }

    @And("user fills Password fields \"P@ssw0rd\" \"p@ssw0rd\"")
    public void enterPassword() {
        reg.writePassword("P@ssw0rd", "P@ssw0rd");

    }

    @And("user clicks on register button")
    public void clickonRegisterBtn() {
        reg.RegisterBtn().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {

        msg= reg.GetSuccessMsg().getText();
        soft.assertTrue(msg.contains(comp));

    }


}



