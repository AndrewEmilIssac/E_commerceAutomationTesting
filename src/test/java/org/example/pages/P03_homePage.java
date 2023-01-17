package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    public WebElement ftSlid() {

        return driver.findElement(By.xpath("//div[@id='nivo-slider']//child::a[contains(@href,'http://demo.nopcommerce.com/')][1]"));

    }

    public WebElement sndSlid() {
        return driver.findElement(By.xpath("//div[@id='nivo-slider']//child::a[contains(@href,'http://demo.nopcommerce.com/')][2]"));
    }

    public String getURL() {
        return driver.getCurrentUrl();

    }

    public WebElement FBButnn() {

        return driver.findElement(By.className("facebook"));
    }


    public WebElement TwitButnn() {

        return driver.findElement(By.className("twitter"));
    }


    public WebElement RssButnn() {

        return driver.findElement(By.className("rss"));
    }

    public WebElement YTButnn() {

        return driver.findElement(By.className("youtube"));
    }

    public WebElement WListbutn() {

        return driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button"));
    }

    public WebElement successBar() {

        return driver.findElement(By.className("content"));

    }



    public String getColor() {
        String x = driver.findElement(By.cssSelector("#bar-notification > div")).getCssValue("background-color");
        System.out.println("Color is :" + x);
        String hex = Color.fromString(x).asHex();
        return hex;
    }

    public void waitUntillSuccMsgDis() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successBar = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        wait.until(ExpectedConditions.invisibilityOf(successBar));
    }

    public WebElement WishListButn() {

        return driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\""));

    }

    public WebElement subcatePage() {


        return  driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title"));

    }
    public WebElement searchBox() {

        return driver.findElement(By.id("small-searchterms"));

    }
    public String writeProductNameOnSearchBox(String productName ){
        searchBox().sendKeys(productName);


        return productName;


    }
    public WebElement productImg() {

        return driver.findElement(By.className("product-item"));

    }

    public WebElement productDesc() {

        return driver.findElement(By.className("overview"));

    }

}
