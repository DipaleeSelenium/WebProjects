package identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.basePage;

public class userIdentifier extends basePage {

	@FindBy(linkText = "Utilisateur")
	public WebElement btn_utilisateur;

	@FindBy(id = "add_vehicle")
	public WebElement txt_createUser;

	@FindBy(xpath = "//*[@id='usr_sgid']")
	public WebElement txt_userSGID;

	@FindBy(xpath = "//*[@id='usr_lastname']")
	public WebElement txt_userLName;

	@FindBy(xpath = "//*[@id='usr_firstname']")
	public WebElement txt_userFName;

	@FindBy(xpath = "//*[@id='usr_mail']")
	public WebElement txt_userEmail;

	@FindBy(xpath = "//*[@id='usr_tel']")
	public WebElement txt_userTelphone;

	@FindBy(xpath = "//*[@id='usr_fax']")
	public WebElement txt_userFax;

	@FindBy(xpath = "//*[@id='user_save']")
	public WebElement btn_userSaveButton;

	@FindBy(xpath = "//*[@id='u_action_buttons']/button")
	public WebElement btn_userCancle;

	@FindBy(xpath = "//*[@id='applications']")
	public WebElement dd_appSelection;

	@FindBy(xpath = "//*[@id='sites']")
	public WebElement dd_siteSelection;

	@FindBy(xpath = "//*[@id='roles']")
	public WebElement dd_roleSelection;

	@FindBy(xpath = "//*[@id='centrale_boxes']")
	public WebElement cb_boxCentrale;

	@FindBy(xpath = "//*[@id='btn_add_permission']")
	public WebElement btn_addPermission;
	
	@FindBy(xpath = "//*[@id='users_table_filter']/label/div/input")
	public WebElement txt_searchUser;

}
