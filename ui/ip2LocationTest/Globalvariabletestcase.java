package UItestingvalidation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Globalvariabletestcase {

	static int n = 1;
	static int actual = 1;
	static WebDriver driver = Definitionclass.definebrowser("chrome");
	static String Errormessage = "Please enter a valid IP address for lookup.";
	static Datafeed login = PageFactory.initElements(driver, Datafeed.class);
	static JavascriptExecutor js = (JavascriptExecutor) driver;

}
