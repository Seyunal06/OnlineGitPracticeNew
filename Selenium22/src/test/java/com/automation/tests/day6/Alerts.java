package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class Alerts {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        buttons.get(0).click();//to click on the first button
        BrowserUtils.wait(3);
        //to get the text from popup message
        String popupText = driver.switchTo().alert().getText();
        System.out.println(popupText);

        driver.switchTo().alert().accept();//to click OK

        String expected = "You successfully clicked an alert";
        String actual = driver.findElement(By.id("result")).getText();

        //it will fail, because there is a typo #BuG#
        if (expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }
        BrowserUtils.wait(3);

        buttons.get(1).click();//clicking in 2nd button
        BrowserUtils.wait(3);

        //to click cancel
        driver.switchTo().alert().dismiss();

        String expected2 = "You clicked: Ok";
        String actual2 = driver.findElement(By.id("result")).getText();

        if (expected2.equals(actual2)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println("Expected: "+expected2);
            System.out.println("Actual: "+actual2);
        }
        BrowserUtils.wait(3);

        buttons.get(2).click();//click 3rd button
        BrowserUtils.wait(3);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Hello, world!");//enter text
        alert.accept();//click ok

        String actual3 = driver.findElement(By.id("result")).getText();
        String expected3 = "Hello, world";

        if (actual3.endsWith(expected3)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println("Expected: "+expected3);
            System.out.println("Actual: "+actual3);
        }

        BrowserUtils.wait(3);
        driver.quit();


    }
}
