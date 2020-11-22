package Selenium_Sessions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		driver.findElement(By.xpath("//button[contains(@class, 'blue')]")).click();
		
		Alert confirmAlert = driver.switchTo().alert();
		
		String confirmAlertText = confirmAlert.getText();
		System.out.println("Alert text is : " + confirmAlertText);
		
		confirmAlert.accept();
		
		driver.findElement(By.xpath("//button[contains(@class, 'blue')]")).click();
		
		Alert confirmAlert2 = driver.switchTo().alert();
		
		String confirmAlertText2 = confirmAlert2.getText();
		System.out.println("Alert text is : " + confirmAlertText2);
		
		confirmAlert2.dismiss();
		
		driver.close();
		
	}

}