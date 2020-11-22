package Selenium_Sessions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		// Open Page
		driver.get("https://www.training-support.net/selenium/iframes");
		
		// Print Title
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		
		// Switch to Frame1
		driver.switchTo().frame(0);
		
		// Print Frame Header
		String frameHeader1 = driver.findElement(By.xpath("//div[@style]//div[@class='content']")).getText();
		System.out.println("Heading of the 1st frame is : " + frameHeader1);
		
		// Button attributes before click
		WebElement button1 = driver.findElement(By.xpath("//div[@style]//parent::div[contains(@class,'sizer')]//child::button"));
		String buttonText1 = button1.getText();
		String buttonColor1 = button1.getCssValue("background-color");
		System.out.println("Button text before click is : " + buttonText1 + "\nButton colour before click is : " + buttonColor1);
		
		// Button click
		button1.click();
		
		// Button attributes after click
		String buttonText2 = button1.getText();
		String buttonColor2 = button1.getCssValue("background-color");
		System.out.println("Button text after click is : " + buttonText2 + "\nButton colour after click is : " + buttonColor2);
		
		// Switch to parent page
		driver.switchTo().defaultContent();
		
		// Switch to Frame2
		driver.switchTo().frame(1);
		
		// Print Frame Header
		String frameHeader2 = driver.findElement(By.xpath("//div[@style]//div[@class='content']")).getText();
		System.out.println("Heading of the 2nd frame is : " + frameHeader2);
		
		// Button attributes before click
		WebElement button2 = driver.findElement(By.xpath("//div[@style]//parent::div[contains(@class,'sizer')]//child::button"));
		String button2Text1 = button2.getText();
		String button2Color1 = button2.getCssValue("background-color");
		System.out.println("Button text before click is : " + button2Text1 + "\nButton colour before click is : " + button2Color1);
		
		// Button click
		button2.click();
		
		// Button attributes after click
		String button2Text2 = button2.getText();
		String button2Color2 = button2.getCssValue("background-color");
		System.out.println("Button text after click is : " + button2Text2 + "\nButton colour after click is : " + button2Color2);
		
		// Close browser		
		driver.close();
	}

}