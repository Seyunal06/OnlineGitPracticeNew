package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        BrowserUtils.wait(2);

        //<input type="radio">
        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));

        for (WebElement radioButton: radioButtons){
            // to check if the button can be clicked
            String id = radioButton.getAttribute("id");
            //returns true if button is already clicked
            boolean selected = radioButton.isSelected();
            System.out.println(id + " is it selected? "+selected);

            if (radioButton.isEnabled()){

            radioButton.click();
                System.out.println("clicked on: "+id);
            BrowserUtils.wait(1);
        }else{
                System.out.println("button is disabled, not click : "+id);
            }
            System.out.println();
    }

        driver.quit();
    }
}
