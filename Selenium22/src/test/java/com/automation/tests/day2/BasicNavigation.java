package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //In selenium, everything starts from Webdriver interface
        //ChromeDriver extends RemoteWebdriver-->implements Webdriver
        driver.get("http://google.com");//to open a website
        driver.manage().window().maximize();//to maximize browser

        Thread.sleep(3000);//for demo, wait 3 seconds

        //method that returns page title
        //you can also see it as tab name, in the browser
        String title = driver.getTitle();//returns <title>some title</title> text
        String expectedTitle = "Google";//we provide it
        System.out.println("Title is "+title);
        if (expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //going into another website with the same window
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);//for demo, wait 3 seconds

        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //come back to google
        driver.navigate().back();
        Thread.sleep(3000);//for demo, wait 3 seconds
        //checking if page title equals google
        verifyEquals(driver.getTitle(),"Google");
        //move forward in the browser history
        //again, going to amazon
        driver.navigate().forward();
        Thread.sleep(3000);//for demo, wait 3 seconds
        System.out.println("Title " +driver.getTitle());
        //driver.getTitle() - returns page title of the page that is currently opened
        //to get URL
        System.out.println("URL: "+driver.getCurrentUrl());
        //driver.navigate().to() and driver.get() is the same thing

        driver.close();
    }
    //checking if two Strings are the same
    public static void verifyEquals(String arg1, String arg2){
        if (arg1.equals(arg2)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
