package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException
	{
		 prop =new Properties();
		FileInputStream fis = new FileInputStream ("/Users/sandeepkumar/Documents/study/workspace/MavenE2EDemo/src/main/java/resource/data.properties");
	
	prop.load(fis);
	String browserName =prop.getProperty("browser");
	
	if (browserName.equals("chrome"))
	{
System.setProperty("webdriver.chrome.driver", "/Users/sandeepkumar/Downloads/chromedriver");
		
		 driver =	new ChromeDriver();
	}
	else if (browserName.equals("firefox"))
	{
		//firefoxpath
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	public void getScreenshot(String result) throws IOException {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	org.apache.commons.io.FileUtils.copyFile(src, new File("/Users/sandeepkumar/Documents/study/"+result+"screenshot.png"));
	
		
		
	
	
}
}
