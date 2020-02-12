package yalo.tests;

import org.testng.annotations.Test;

import yalo.pages.YaloHomePage;
import yalo.pages.YaloLoginPage;

public class LoginTest extends TestBase
{
	@Test
	public void Login_ValidateUserAbleToLogin() 
	{
		YaloHomePage home = new YaloHomePage();
		YaloLoginPage login = home.clickLogin();		 
		login.enterUserName("testuser@example.com");
		login.enterPassword("test123");
		login.clickLoginButton();
	}
}
