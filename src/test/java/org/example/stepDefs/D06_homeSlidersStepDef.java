package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;


public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();
String newURL;

    SoftAssert soft= new SoftAssert();
    @Given("user click on first slider on home page")
    public void ClickFirstSlid() {


        homePage.ftSlid().click();

        newURL = homePage.getURL();
        System.out.println(newURL);
    }
        @Then("user navigates to new url")
       public void validateURL() {
            soft.assertTrue(newURL.contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        }



    @Given("user click on second slider on home page")
    public void ClickSecondSlid() throws InterruptedException {


        Thread.sleep(8000);
        homePage.sndSlid().click();

        newURL = homePage.getURL();
        System.out.println(newURL);
    }
  @Then("user navigates to iphone URL")
  public void ValidateIphone(){
        soft.assertTrue(newURL.contains("https://demo.nopcommerce.com/nokia-lumia-1020"));


    }
}