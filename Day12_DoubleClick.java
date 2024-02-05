package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_RightClick {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();

		//Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.id("dblClkBtn"));
		action.doubleClick(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
        //Closing the driver instance
		driver.quit();

   }
}