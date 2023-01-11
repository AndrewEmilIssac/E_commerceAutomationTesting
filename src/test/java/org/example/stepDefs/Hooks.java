package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

/** Andrew Emil
 *
 *
 */
public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser() throws InterruptedException {
        // the bridge
        String chromePath =   System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe" ;

        System.out.println(chromePath );

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
