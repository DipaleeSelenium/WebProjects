package Tests;

import org.testng.annotations.Test;

import Pages.VehiclePage;
import WebBase.baseTest;

public class VehicleTest extends baseTest{
	
	VehiclePage vehiclePage = new VehiclePage();
	
//	@DataProvider(name ="init")
	@Test(priority = 1)
	public void vehicleAdd() throws Exception
	{
		vehiclePage.soCleanAddVehicle();
	}

	
}
