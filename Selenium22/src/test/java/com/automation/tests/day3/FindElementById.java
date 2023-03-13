package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementById {
    public static void main(String[] args) throws Exception{

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));
        //driver.findElement(By.name("username")).sendKeys("tomsmith");
        //<input type="text" name="username">
        username.sendKeys("tomsmith");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        //<input type="password" name="password">
        password.sendKeys("SuperSecretPassword");
        Thread.sleep(2000);

        driver.findElement(By.id("wooden_spoon")).click();
        //<button class="btn btn-primary" type="submit" id="wooden_spoon">Login</button>
        Thread.sleep(2000);

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        //<h4 class="subheader">Welcome to the Secure Area. When you are done click logout below.</h4>
        String actual = driver.findElement(By.tagName("h4")).getText();

        if (expected.equals(actual)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        //clicking on logout, its not a button its a link
       // <a class="button secondary radius" href="/logout"><i class="icon-2x icon-signout"> Logout</i></a>
       WebElement logout = driver.findElement(By.linkText("Logout"));

        String href = logout.getAttribute("href");
        String className = logout.getAttribute("class");

        //to see the link in run
        System.out.println(href);
        System.out.println(className);

        logout.click();
        Thread.sleep(2000);

        //invalid credentials
        driver.findElement(By.name("username")).sendKeys("wrong");
        driver.findElement(By.name("password")).sendKeys("wrong");
        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.id("flash-messages"));
        System.out.println(errorMessage.getText());

        Thread.sleep(2000);



        driver.quit();


    }
}
