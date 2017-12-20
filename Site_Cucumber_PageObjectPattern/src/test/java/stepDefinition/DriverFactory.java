package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	static{
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
	}
	protected static WebDriver driver= new ChromeDriver();
}
