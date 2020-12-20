package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewUser {
	
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^The user is on login page$")
    public void LoginPage() {
     
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
    
    @And("^Admin user enters\"(.*)\"and\"(.*)\"$")
    public void Admin_user_enters_and(String Username, String Password) throws Throwable {
    	
    	driver.findElement(By.id("user_login")).sendKeys(Username);
        driver.findElement(By.id("user_pass")).sendKeys(Password);
        driver.findElement(By.id("wp-submit")).click();
    }
    
    @When ("^user finds the Users option$")
    public void ClickUser() {
    	
    	driver.findElement(By.linkText("Users")).click();
    }
    
    @And ("^clicks on Add New user$")
    public void ClickAdduser() {
    	
    	driver.findElement(By.linkText("Add New")).click();
    	
    }
    
    @And("^fills in the required details$")
    public void FormFill() {
    	
    	driver.findElement(By.id("user_login")).sendKeys("Denise123");
    	driver.findElement(By.id("email")).sendKeys("Denise123@abc.com");
    	driver.findElement(By.id("first_name")).sendKeys("Denise");
    	driver.findElement(By.id("last_name")).sendKeys("Russo");
    	driver.findElement(By.cssSelector(".wp-generate-pw")).click();
    	driver.findElement(By.id("pass1")).sendKeys("Idiot!tali@n");
    	
    }
    
    @And("^creates new user")
    public void CreateUser() {
    	
    	driver.findElement(By.id("createusersub")).click(); 	
    }
    
    @Then("^validates if user is created")
    public void Validate() {
    	
    	if (driver.findElement(By.cssSelector("#message > p:nth-child(1)")).isDisplayed()) {
    		
    		System.out.println("The user is created successfully");
    	}
    	
    	else {
    		
    		System.out.println("Please recheck there is an issue");
    	}
    }
    
    @And("^closes the browser$")
    public void CloseBrowser() {
    	
        driver.close();
    }
    

}