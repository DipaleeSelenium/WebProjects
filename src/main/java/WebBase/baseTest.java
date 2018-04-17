package WebBase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class baseTest extends webController {

	public static WebDriver baseTestDriver;
	
//	JavascriptExecutor jse = (JavascriptExecutor)driver;

	public baseTest() {

		baseTest.baseTestDriver = webController.invokeWebController();
		PageFactory.initElements(baseTestDriver, this);

	}
	
	@SuppressWarnings("unchecked")
	@DataProvider(name = "init")
	public Object[][] injectPage(Method method) throws NoSuchMethodException,
	InvocationTargetException, IllegalAccessException {

	Test test = method.getAnnotation(Test.class);
	Class<? extends Page> clazz = test.page();
	if (clazz.equals(Object.class)) {
	return new Object[][] { {} };
	}

	return new Object[1][1];
	}


}
