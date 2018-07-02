package identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.basePage;

public class loginIdentifier extends basePage {

	
		@FindBy(id="buttonConnect")
		public WebElement btn_ssoConnection;
		
		@FindBy(xpath ="/html/body/div/div[2]/div/div/div/div[2]/h4")
		public WebElement txt_vehicleList;
		
		@FindBy(xpath = "/html/body/div/div[2]/nav/div/div[1]/ul[1]/li[2]/a")
		public WebElement txt_userMenu;
		
		@FindBy(xpath = "/html/body/div/div[2]/nav/div/div[1]/ul[1]/li[3]/a")
		public WebElement txt_factoryMenu;
		
	
	

}
