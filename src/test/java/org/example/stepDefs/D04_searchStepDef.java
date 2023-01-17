package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {

    String currURL;
    String searchText;

    SoftAssert soft= new SoftAssert();
    P03_homePage homePage = new P03_homePage();

    @When("user search on  \"(.*)\"$")
    public void searchOnProduct(String product) {
        searchText = homePage.writeProductNameOnSearchBox(product);
        homePage.searchBox().sendKeys(Keys.ENTER);
        currURL = homePage.getURL();
    }

    @Then("Verify URL")
    public void verifyURL() {
        Assert.assertTrue(currURL.contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("verify each result contains the search words")
    public void verifyEachResult() {
        List<String> products = new ArrayList<>();
        List<WebElement> items = driver.findElements(By.className("search-results"));

        for (int i = 0; i < items.size(); i++) {
            products.add(items.get(i).getText());

            soft.assertTrue(items.get(i).getText().toLowerCase().contains(searchText));


        }
    }
        @Given("user search with \"(.*)\"$")
        public void searchOnSKU (String SKU) {
            searchText = homePage.writeProductNameOnSearchBox(SKU);
            homePage.searchBox().sendKeys(Keys.ENTER);
            currURL = homePage.getURL();

        }
        @When("user clicks open the product")
      public void clickOnTheProduct(){
    homePage.productImg().click();
        }
        @Then("verify result contains the search words")
        public void verifyResultsContainSKU() {

            String description = homePage.productDesc().getText();
            soft.assertTrue(description.contains(searchText));

        }
    }
