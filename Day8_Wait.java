package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Wait {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.github.com/login/");

        // This will wait 2 secondsto perform next command
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));


        //Locators Exploration on Linkedin Login Page  id=""
        WebElement userName= driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement joinNow = driver.findElement(By.className("mt-1 mb-0 p-0"));
    }
}