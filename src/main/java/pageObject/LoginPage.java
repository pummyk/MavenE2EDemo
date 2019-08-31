package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	

	public WebDriver driver;
	
	By username = By.id("user_email");
	
	By password = By.id("user_password");
	
	By summit = By.name("commit");
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}


	public WebElement EmailId()
	{
		return driver.findElement(username);
		
	}

	public WebElement Password()
	{
		return driver.findElement(password);
		
	}
	public WebElement logIn()
	{
		return driver.findElement(summit);
		
	}
}
