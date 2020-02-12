package executables;

import java.io.IOException;
import java.util.Properties;

import yalo.helper.StartWebDriver.Browser;

public class ConfigReader 
{
	public static void settingsPopulate() throws IOException 
	{
		ConfigReader reader = new ConfigReader();
		reader.readProperty();
	}
	
	private void readProperty() throws IOException 
	{
		Properties prop = new Properties();
		prop.load(getClass().getResourceAsStream("config.properties"));
		Settings.browser = Browser.valueOf(prop.getProperty("browser"));
		Settings.url = prop.getProperty("URL");
		Settings.wait = Integer.parseInt(prop.getProperty("wait"));
	}
}
