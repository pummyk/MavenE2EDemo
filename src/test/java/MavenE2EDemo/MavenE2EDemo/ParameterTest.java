package MavenE2EDemo.MavenE2EDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	
	WebDriver driver;
	
	
	
	@Parameters({"Browser","url","emailId"})
	@Test
	public void LoginTest(String Browser,String url ,String emailId) {
		if (Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/sandeepkumar/Downloads/chromedriver");
			driver = new ChromeDriver();
		}else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(emailId);
		
	}
	

}
