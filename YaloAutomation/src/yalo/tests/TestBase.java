package yalo.tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import executables.ConfigReader;
import executables.Settings;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;
import yalo.helper.StartWebDriver;

public class TestBase extends StartWebDriver
{
	@BeforeSuite
	public void setUp() throws IOException 
	{
		ConfigReader.settingsPopulate();
		init(Settings.browser, Settings.url);
	}
	
	@AfterSuite
	public void tearDown() 
	{
		try 
		{
			if(driver != null) 
			{
				driver.close();
				driver.quit();
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
