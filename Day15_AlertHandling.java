package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_AlertHandling throws InterruptedException{
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        //Set implicit wait of 10 seconds
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to a website
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();

        Thread.sleep(3000);
		
        //Handling alert boxes
	    //Click on generate alert button
	    driver.findElement(By.cssSelector("div#AlertBox button")).click();
		
    	Thread.sleep(3000);
		
        //Using Alert class to first switch to or focus to the alert box
        Alert alert = driver.switchTo().alert();
            
        //Using accept() method to accept the alert box
        alert.accept();
            
        //Handling confirm box
        //Click on Generate Confirm Box
        driver.findElement(By.cssSelector("div#ConfirmBox button")).click();
            
        Thread.sleep(3000);
            
        Alert confirmBox = driver.switchTo().alert();
            
        //Using dismiss() command to dismiss the confirm box
        //Similarly accept can be used to accept the confirm box
        confirmBox.dismiss();

        //Closing the driver instance
		driver.quit();

   }
}