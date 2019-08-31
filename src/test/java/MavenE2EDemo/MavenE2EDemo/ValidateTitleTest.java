package MavenE2EDemo.MavenE2EDemo;

import org.testng.annotations.Test;

import pageObject.Landingpage;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import resource.Base;

public class ValidateTitleTest {
	
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
			
			Landingpage l = new Landingpage(driver);
			AssertJUnit.assertTrue(l.getnavigationTitle().isDisplayed());
			;
		}		
@AfterTest
   
	public void teardown()
	{
	driver.close();
	}
	}
	}
 