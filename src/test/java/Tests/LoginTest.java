package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import WebBase.baseTest;

public class LoginTest extends baseTest {

	LoginPage loginPage = new LoginPage();

	
	@Test(priority = 1)
	public void loginCase() {
		loginPage.soCleanLogin();

	}
	@Test(priority = 2)
	public void menuCase()
	{
		loginPage.verifyMenu();
	}
	
}
