package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    String msg;
    String comp = "complete";
    P01_register reg = new P01_register();
    SoftAssert soft= new SoftAssert();

    @Given("user go to register page")
    public void goRegisterPage() {
        reg.RegLink().click();
    }


    @When("user select gender type")
    public void selectGenderType() {
        reg.selectGen().click();
    }

    @And("user enter first name\"Andrew\" and last name\"Emil\"")
    public void enterFirstAndLastName() {
        reg.writeFtAndLt("Andrew", "Emil");
    }

    @And("user enter date of birth")
    public void enterDateOfBirth() {

        reg.selectBirthdayDate("24", "April", "1999");
         reg.Page().click();

    }

    @And("user enter email \"test@example.com\" field")
    public void enterEmailField() {
        reg.EM().click();
        reg.writeEm("test@example.com");

    }

    @And("user fills Password fields \"P@ssw0rd\" \"p@ssw0rd\"")
    public void enterPassword() {
        reg.writePw("P@ssw0rd", "P@ssw0rd");

    }

    @And("user clicks on register button")
    public void clickonRegisterBtn() {
        reg.RegButn().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {

        msg= reg.successMSG().getText();
        soft.assertTrue(msg.contains(comp));

    }


}



