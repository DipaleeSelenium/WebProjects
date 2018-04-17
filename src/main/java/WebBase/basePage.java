package WebBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage extends webController {

	public static WebDriver basePageDriver = null;

	public basePage() {

		basePage.basePageDriver = webController.invokeWebController();
		PageFactory.initElements(basePageDriver, this);

	}
}
