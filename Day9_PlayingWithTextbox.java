package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_PlayingWithTextBox {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.github.com/login/");

        //Locators Exploration on Linkedin Login Page  id=""
        WebElement userName= driver.findElement(By.id("login_field"));
        
        //  typing username in textbox
        userName.sendKeys("Github@test.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("test@123.com");

        // Clear password from textbox
        driver.findElement(By.name("password")).clear();

    }
}