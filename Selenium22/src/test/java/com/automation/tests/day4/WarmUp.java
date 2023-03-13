package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class WarmUp {
    static WebDriver driver;
    public static void main(String[] args) throws Exception {
        ebay();
        amazon();

    }
        public static void ebay()throws Exception{
        driver = DriverFactory.createADriver("chrome");

        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("gh-ac")).

            sendKeys("shoes");
//id="gh-ac" name="_nkw" autocapitalize="off" autocorrect="off" spellcheck="false" autocomplete="off" aria-haspopup="true" role="combobox" aria-owns="ui-id-1">
        Thread.sleep(2000);

        driver.findElement(By.id("gh-btn")).

            submit();
        Thread.sleep(2000);

            WebElement searchResults = driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText());

        driver.quit();
        }
        public static void amazon()throws Exception{
        driver = DriverFactory.createADriver("chrome");
        driver.get("https://www.amazon.com/");
            Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
        driver.findElement(By.id("nav-search-submit-button")).submit();
            Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.contains("Books")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }



            driver.quit();
    }

}
