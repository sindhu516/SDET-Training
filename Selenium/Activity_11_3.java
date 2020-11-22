package Selenium_Sessions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		driver.findElement(By.xpath("//div[contains(@class, 'activity')]//button[contains(@class, 'green')]")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		String promptAlertText = promptAlert.getText();
		System.out.println("Alert text is : " + promptAlertText);
		
		promptAlert.sendKeys("Yes, you are!");
		
		promptAlert.accept();
		
		driver.close();
		
	}

}