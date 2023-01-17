package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    SoftAssert soft= new SoftAssert();
    P03_homePage homePage = new P03_homePage();
    int FBButn = 1,
            TwitButn = 2,
            RssButn = 3,
            YTbutn = 4;
    int ClickedBUtn;

    @When("user opens facebook link")
    public void userClicksOnFacebookIcon() {
        homePage.FBButnn().click();
        ClickedBUtn = FBButn;
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        homePage.TwitButnn().click();
        ClickedBUtn = TwitButn;
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homePage.RssButnn().click();
        ClickedBUtn = RssButn;
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.YTButnn().click();
        ClickedBUtn = YTbutn;
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expectedUrl) throws InterruptedException {

        System.out.println("Current Url " + Hooks.driver.getCurrentUrl());
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String tabUrl = Hooks.driver.getCurrentUrl();
        switch (ClickedBUtn) {
            case 1:
                soft.assertTrue(tabUrl.equals(expectedUrl), "Wrong Facebook Url ");
                break;
            case 2:
                soft.assertTrue(tabUrl.equals(expectedUrl), "Wrong Twitter Url ");
                break;
            case 3:
                soft.assertTrue(tabUrl.equals(expectedUrl), "Wrong Rss Url ");
                break;
            case 4:
                soft.assertTrue(tabUrl.equals(expectedUrl), "Wrong Youtube Url ");
                break;
        }


    }
}