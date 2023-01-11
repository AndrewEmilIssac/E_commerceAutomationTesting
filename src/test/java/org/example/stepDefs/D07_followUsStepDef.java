package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    SoftAssert soft= new SoftAssert();
    P03_homePage homePage = new P03_homePage();
   @When("user clicks on facebook btn")
    public void clickOnFacebook() {
       homePage.facebookBtn().click();
       ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
       System.out.println(tabs.size());
       driver.switchTo().window(tabs.get(1));
       System.out.println("tab 1:  " + driver.getCurrentUrl());

   }
       @Then("new tab should be opened")
       public void verifyNewTab () {
           String faceBookURL = driver.getCurrentUrl();
           Assert.assertTrue(faceBookURL.contains("https://www.facebook.com/nopCommerce"));


       }

    @When("user clicks on twiiter btn")
    public void clickOnTwitter() {
        homePage.twitterBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());

    }
    @Then("new twitter tab should be opened")
    public void verifyTab () {
        String faceBookURL = driver.getCurrentUrl();
        soft.assertTrue(faceBookURL.contains("https://twitter.com/nopCommerce"));


    }
    @When("user clicks on rss btn")
    public void clickOnrss() {
        homePage.rssBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());

    }
    @Then("new rss tab should be opened")
    public void verifyRssTab () {
        String rssURL = driver.getCurrentUrl();
        soft.assertTrue(rssURL.contains("https://demo.nopcommerce.com/new-online-store-is-open"));


    }
    @When("user opens youtube link")
    public void clickOnYouTube() {
        homePage.youtubeBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());

    }
    @Then("youTube is opened in new tab")
    public void verifyYouTubeTab () {
        String faceBookURL = driver.getCurrentUrl();
        Assert.assertTrue(faceBookURL.contains("https://www.youtube.com/user/nopCommerce"));


    }



}
