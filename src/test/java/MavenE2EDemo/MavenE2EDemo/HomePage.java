package MavenE2EDemo.MavenE2EDemo;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pageObject.Landingpage;
import pageObject.LoginPage;
import resource.Base;

public class HomePage extends Base{
	@BeforeTest
	public void initialize () throws IOException, InterruptedException
	{
		driver = intializeDriver();
		
	
	}
	
	@Test(dataProvider="getdata")
	public void basePageNavigation(String username,String password,String text) throws IOException 
	{
		driver.get(prop.getProperty("url"));
		Landingpage l = new Landingpage(driver);
	
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.EmailId().sendKeys("username");
		lp.Password().sendKeys("password");
		lp.logIn().click();
	
		System.out.println(text);
		
	}
	@AfterTest
	   
	public void teardown()
	{
	driver.close();
	driver= null;
	
	}
	
	@DataProvider
	public Object[][] getdata()
	{
	Object[][] data =new Object [2][3];
	//0 row for restricted student
	data[0][0]="pummy.jaiswal@gmail.com";
	data[0][1]="pummy";
	data[0][2]="restricted user";
	//1 row for non restricted student
	data[1][0]="pummy.jaiswal@gmail.com";
	data[1][1]="pummy";
	data[1][2]="non restricted user";
	
	return data;
	
	}

	
}

