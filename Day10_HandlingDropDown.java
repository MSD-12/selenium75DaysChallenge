package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_HandlingDropDown {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.sap.com/india/index.html");

        WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
        Select dropdown = new Select(testDropDown);

        // Select by idex value start from 0
        dropdown.selectByIndex(1);

        // Selecting using visible text in dropdown
        dropdown.selectByVisibleText("SAP Learning Hub");

        //Closing the driver instance
		driver.quit();

   }
}