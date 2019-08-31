package MavenE2EDemo.MavenE2EDemo;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import resource.Base;

public class ValidateText extends Base {
	
	
	@BeforeTest
	public void initialize () throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	
	public void basePageNavigation() throws IOException 
	{
		
		Landingpage l =new Landingpage (driver);
		
		AssertJUnit.assertEquals(l.getChkText().getText(), "FEATURED COURSES123");
		
	}	
	@AfterTest
	   
	public void teardown()
	{
	driver.close();
	driver = null;
	
	}
}
