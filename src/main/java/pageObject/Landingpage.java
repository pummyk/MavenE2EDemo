package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	
	
	
	
	public WebDriver driver;
	
	By singnIn = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By Text = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By Navigation = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
	
	

	
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(singnIn);
		
	}

	public WebElement getnavigationTitle()
	{
		return driver.findElement(Navigation);
		
	}
	
	public WebElement getChkText()
	{
		return driver.findElement(Text);
		
	}

}
