package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
 
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
 
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
 
        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
 
        firstName.sendKeys("satya");
        lastName.sendKeys("sindhu");
 
        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("satya@example.com");
 
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9087654321");
 
        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("text message");
 
        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        
        //Thread Sleep for visual verification of steps
        Thread.sleep(1000);
        
        //Close the browser
        driver.quit();

	}

}