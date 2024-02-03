package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_RightClick {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://artoftesting.com/samplesiteforselenium");

	    //Right click in the TextBox
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.id("fname"));
		action.contextClick(searchBox).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);

        //Closing the driver instance
		driver.quit();

   }
}