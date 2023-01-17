package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage();
    Actions actions=new Actions(driver);

    int first = 0;

    int last = 2;
    int chosenCategory = (int)Math.floor(Math.random()*(last-first+1)+first);
    String chosenSubCategoryText;

    SoftAssert soft= new SoftAssert();
    String title;

    @Given("user hoovers on random category")

        public void hooverOnRandomCategory() throws InterruptedException {



        List<WebElement> categories = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));

            actions.moveToElement(categories.get(chosenCategory)).perform();
            String selectedCategoryText = categories.get(chosenCategory).getText();

       chosenCategory = chosenCategory+1;


    }

    @And("click on subcategory")
    public void clickOnSubcategory(){

        String locator = "(//ul[@class='top-menu notmobile']//ul)["+chosenCategory+"]/li";
        List<WebElement> subCategoryLinks = driver.findElements(By.xpath(locator));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int chosenSubCategory = (int) Math.floor(Math.random() * (last - first + 1) + first);
         chosenSubCategoryText = subCategoryLinks.get(chosenSubCategory).getText();
        subCategoryLinks.get(chosenSubCategory).click();
        System.out.println(chosenSubCategoryText);


    }
    @Then("Subcategory page open successfully and with same selected subcategory title")
    public void verifyTitle(){
       title= homePage.subcatePage().getText();
        soft.assertTrue(chosenSubCategoryText.contains(title));
       System.out.println(title);
    }
}
