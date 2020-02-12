package yalo.pages;

import org.openqa.selenium.By;

import yalo.helper.SeleniumUtils;
import yalo.helper.StartWebDriver;

public class YaloHomePage extends StartWebDriver
{
	protected By loginBtn = By.xpath("//button[text()='Login']");
	
	public YaloLoginPage clickLogin() 
	{
		SeleniumUtils.clickElement(loginBtn);
		return new YaloLoginPage();
	}
}
