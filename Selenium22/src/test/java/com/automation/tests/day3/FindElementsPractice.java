package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {
    public static void main(String[] args) throws Exception{

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(2000);
        WebElement fullName = driver.findElement(By.name("full_name"));
        //<input type="text" name="full_name">
        fullName.sendKeys("Mister Twister");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        //<input type="email" name="email">
        email.sendKeys("seyma.unal3@gmail.com");

        Thread.sleep(2000);

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        //<button class="radius" type="submit" name="wooden_spoon">Sign Up</button>
        signUp.submit();
        //or signUp.click(); but only when it doesnt say type submit

        Thread.sleep(2000);

        String expected = "Thank you for signing up. Click the button below to return to the home page.";

        WebElement message = driver.findElement(By.className("subheader"));
        String actual = message.getText();

        if (expected.equals(actual)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        driver.quit();



    }
}
