package Utilize;

import identifiers.VehicleIdentifier;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import WebBase.webController;

public class SCHelper {

	VehicleIdentifier vehicle = new VehicleIdentifier();
	webController driver = new webController();

	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void dropDown(String locaterName) {
		// Select drpdwn = new Select(element);
		List<WebElement> options = webController.driver.findElements(By
				.xpath("" + locaterName + ""));
		// int iCnt = options.size();
		Random rand = new Random();
		int index = rand.nextInt(options.size());
		// index = 0;
		if (index == 0) {
			index = index + 1;
		}
		options.get(index).click();

		// drpdwn.selectByVisibleText(dropdownvalue);
	}

	public void radioButton(String radioButtonLocator) {
		List<WebElement> radioButtonList = webController.driver.findElements(By
				.xpath("" + radioButtonLocator + ""));
		// int index =radioButtonList.size();

		Random rand = new Random();
		int index = rand.nextInt((radioButtonList.size()));
		radioButtonList.get(index).click();
		// boolean is_Selected = radioButtonList.get(0).isSelected();
		// if (is_Selected == true) {
		// radioButtonList.get(1).click();
		// } else {
		// radioButtonList.get(0).click();
		// }
	}

	// public void scrollDown()
	// {
	//
	// jse.executeScript("window.scrollBy(0,250)", "");
	// }
	//
	// public void scrollUp()
	// {
	// jse.executeScript("window.scrollBy(0,-250)", "");
	// }

	public void scrollPageUp() throws Exception {
		// init();

		webController.driver.navigate();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,-400)");
	}

	public void scrollPageDown() throws Exception {
		// init();

		webController.driver.navigate();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,400)");
	}
}
