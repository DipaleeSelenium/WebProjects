package identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.basePage;

public class VehicleIdentifier extends basePage {

	@FindBy(id = "add_vehicle")
	public WebElement btn_addVehicle;

	@FindBy(id = "veh_cd")
	public WebElement txt_codeVehicle;

	@FindBy(id = "prp_ddl")
	public WebElement dd_proprieteVehicle;

	@FindBy(id = "cat_ddl")
	public WebElement dd_categoryVehicle;

	@FindBy(id = "cap_ddl")
	public WebElement dd_volumeVehicle;

	@FindBy(id = "tra_ddl")
	public WebElement dd_transportorVehicle;

	@FindBy(id = "veh_cap")
	public WebElement txt_capacityVehicle;

	@FindBy(id = "veh_plate")
	public WebElement txt_plaqueVehicle;
	
	@FindBy(xpath = "//*[@id='div_veh_sites']/div/div[1]/input")
	public WebElement txt_siteVehicle;
	
//	@FindBy(id="spot_type_div/div")
//	public WebElement rb_vehicleSpot;
	
	@FindBy(id="//*[@id=\"bootstrap-duallistbox-nonselected-list_veh_sites[]\"]")
	public WebElement dd_siteVehicle;
	
	
	
	@FindBy(id="veh_plate")
	public WebElement txt_plaqueImmatriculation;
	
	@FindBy(xpath = "//*[@id='FrmAddVeh']/div[2]/div[3]/div/input")
	public WebElement btn_createVehicle;

}
