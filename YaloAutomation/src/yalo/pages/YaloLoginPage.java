package yalo.pages;

import org.openqa.selenium.By;

import yalo.helper.SeleniumUtils;
import yalo.helper.StartWebDriver;

public class YaloLoginPage extends StartWebDriver
{
	protected By usernameField = By.name("login.username");
	protected By passwordField = By.name("login.password");
	protected By cancelButton = By.className("btn btn-lg btn-default button-cancel");
	protected By loginButton = By.xpath("//button[text()='Login']");
	
	
	public void enterUserName(String user) 
	{
		SeleniumUtils.enterKeys(user, usernameField);
	}
	
	public void enterPassword(String pass) 
	{
		SeleniumUtils.enterKeys(pass, passwordField);
	}
	
	public void clickLoginButton() 
	{
		SeleniumUtils.clickElement(loginButton);
	}

}
