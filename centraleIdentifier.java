package identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.basePage;

public class centraleIdentifier extends basePage {
	
	@FindBy(linkText = "Centrale")
	public WebElement btn_centrale;
	
	@FindBy(xpath = "//*[@id='add_vehicle']")
	public WebElement txt_createCentrale;
	
	@FindBy(xpath = "//*[@id='cen_cd']")
	public WebElement txt_codeCentrale;
	
	@FindBy(xpath = "//*[@id='cen_cd_vega']")
	public WebElement txt_vegaCodeCentrale;
	
	@FindBy(xpath = "//*[@id='cen_name']")
	public WebElement txt_nameCentrale;
	
	@FindBy(xpath = "//*[@id='sit_ddl']")
	public WebElement dd_siteCentrale;
	
	@FindBy(xpath = "//*[@id='cmp_ddl']")
	public WebElement dd_SocietyCentrale;
	
	@FindBy(xpath = "//*[@id='cen_addr']")
	public WebElement dd_addressCentrale;
	
	@FindBy(xpath = "//*[@id='cen_addr2']")
	public WebElement dd_addr1Centrale;
	
	@FindBy(xpath = "//*[@id='cen_zip']")
	public WebElement txt_zipCentrale;
	
	@FindBy(xpath = "//*[@id='cen_city']")
	public WebElement txt_cityCentrale;
	
	@FindBy(xpath = "//*[@id='cen_phone']")
	public WebElement txt_phoneCentrale;
	
	@FindBy(xpath = "//*[@id='cen_fax']")
	public WebElement txt_faxCentrale;
	
	@FindBy(xpath = "//*[@id='cen_transfert']")
	public WebElement txt_codeTransferCentrale;
	
	@FindBy(xpath = "//*[@id='active_div']")
	public WebElement cb_NFCentrale;
	
	@FindBy(xpath = "//*[@id='cen_avgflow']")
	public WebElement txt_averageFlowCentrale;
	
	@FindBy(xpath = "//*[@id='cen_ip']")
	public WebElement txt_ipCentrale;
	
	@FindBy(xpath = "//*[@id='FrmAddCen']")
	public WebElement btn_createCentrale;

}
