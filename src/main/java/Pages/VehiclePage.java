package Pages;

import identifiers.VehicleIdentifier;
import Utilize.AppConstantString;
import Utilize.SCHelper;
import WebBase.basePage;

public class VehiclePage extends basePage {

	VehicleIdentifier vehicle = new VehicleIdentifier();
	AppConstantString constantString = new AppConstantString();
	SCHelper scHelper = new SCHelper();

	@SuppressWarnings("static-access")
	public void soCleanAddVehicle() throws Exception {
		vehicle.btn_addVehicle.click();
		vehicle.txt_codeVehicle.sendKeys(constantString.VEHICLECODE);
		vehicle.dd_proprieteVehicle.click();
		scHelper.dropDown(constantString.VEHICLEPROPRIETE);
		vehicle.dd_proprieteVehicle.click();
		if(vehicle.dd_proprieteVehicle.getAttribute("value").equals("SP"))
		{
			scHelper.radioButton(constantString.VEHICLERADIOSPOT);
		}
		if (scHelper.isElementPresent(vehicle.txt_plaqueImmatriculation)) {
			vehicle.txt_plaqueImmatriculation.sendKeys(AppConstantString.VEHICLEPLATE);
		}
		scHelper.dropDown(constantString.VEHICLECATEGORY);
		scHelper.dropDown(constantString.VEHICLEVOLUME);
		scHelper.dropDown(constantString.VEHICLETRANSPORTER);
		vehicle.txt_capacityVehicle.sendKeys(constantString.VEHICLECAPACITY);
		// try {
		// scHelper.scrollPageUp();
		// } catch (ClassCastException e) {
		//
		// e.printStackTrace();
		// }
		vehicle.txt_siteVehicle.click();

		vehicle.txt_siteVehicle.sendKeys(constantString.VEHICLESITE);
//		vehicle.dd_siteVehicle.click();
		scHelper.dropDown(constantString.VEHICLESITES);
		vehicle.dd_siteVehicle.click();

		// try {
		// scHelper.scrollPageDown();
		// } catch (ClassCastException e) {
		//
		// e.printStackTrace();
		// }
		vehicle.btn_createVehicle.click();
		Thread.sleep(5000);
	}
}
