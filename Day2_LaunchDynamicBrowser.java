package org.casperproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class Day2_LaunchDynamicBrowser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select browser of your choice to launch "+'\n'+" 1 for chrome "+'\n'+" 2 for firefox): ");        String browserChoice = scanner.nextLine().toLowerCase();

        WebDriver driver;

        switch (browserChoice) {
            case "1":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "2":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser choice.");
                return;
        }
        // Close the browser when done
        driver.quit();
    }
}