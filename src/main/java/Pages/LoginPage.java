package Pages;

import identifiers.loginIdentifier;

import org.testng.asserts.SoftAssert;

import Utilize.SCHelper;
import WebBase.basePage;

public class LoginPage extends basePage {

	loginIdentifier login = new loginIdentifier();
	SoftAssert sa = new SoftAssert();
	SCHelper SC = new SCHelper();

	public void soCleanLogin() {
		login.btn_ssoConnection.click();
		
		
//		boolean expectedHomeText = SC.isElementPresent(login.txt_vehicleList);
		
		sa.assertEquals(SC.isElementPresent(login.txt_vehicleList), "login successfull");
	}
	
	public void verifyMenu()
	{
		sa.assertEquals(SC.isElementPresent(login.txt_userMenu), "user menu available");
		sa.assertEquals(SC.isElementPresent(login.txt_factoryMenu), "factory menu available");
		
	}
	
}
