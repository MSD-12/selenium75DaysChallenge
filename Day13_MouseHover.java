package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_MouseHover {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://github.com");
        driver.manage().window().maximize();

		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.class("btn-mktg width-full width-md-auto mb-3 mb-md-0 rounded-md-left-0 home-campaign-signup-button btn-signup-mktg"));
		action.moveToElement(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
        //Closing the driver instance
		driver.quit();

   }
}