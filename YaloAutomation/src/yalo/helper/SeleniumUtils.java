package yalo.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumUtils extends StartWebDriver
{
	public static WebElement getElement(By by) 
	{
		return driver.findElement(by);
	}
	
	public static void enterKeys(String keys, By by) 
	{
		getElement(by).sendKeys(keys);
	}
	
	public static void clickElement( By by) {
		getElement(by).click();
	}
}
