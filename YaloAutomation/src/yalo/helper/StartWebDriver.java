package yalo.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import executables.Settings;

public class StartWebDriver 
{
	public static WebDriver driver;
	
	public enum Browser
	{
		CHROME,FIREFOX,IE
	}
	
	public void init(Browser browser, String URL) 
	{
		switch (browser) 
		{
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\deneb\\eclipse-workspace\\YaloAutomation\\src\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
			break;
			case FIREFOX:
			break;
			case IE:
			break;
			default:
				throw new IllegalStateException();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Settings.wait, TimeUnit.SECONDS);
	}
}
