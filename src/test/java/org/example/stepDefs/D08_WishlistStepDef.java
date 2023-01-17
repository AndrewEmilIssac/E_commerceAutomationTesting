package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    String msg;
    String col;
    SoftAssert soft= new SoftAssert();
    @When("if you click on wishlist button ❤ on HTC product")
    public void clickOnWishlist() {
        homePage.WListbutn().click();
    }

    @Then("user will see  success message \"The product has been added to your wishlist\" with green background color")
    public void validateSuccessMsg() {
        msg = homePage.successBar().getText();

        Assert.assertTrue(msg.contains("product has been added"));
        col = homePage.getColor();

        Assert.assertTrue(col.contains("4bb07a"));
    }

    @Given("wait to success message to disappear")
    public void waitSuccessMessageDisappear() {
        homePage.waitUntillSuccMsgDis();

    }
    @And("go to wishlist page")
    public void clickOnWishList(){
        homePage.WishListButn().click();
    }
    @Then("Check the quantity of product bigger than 0")
    public void checkQuality(){
        String countNumber =   driver.findElement(By.className("qty-input")).getAttribute("value");

        int InCount=    Integer.parseInt(countNumber);

        soft.assertTrue(InCount>0);
    }

    }
