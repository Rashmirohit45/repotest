package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static app.Common.driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public static void invokeApp() {
		driver.get("http://parabank.parasoft.com/");
		
	}

	public static void killBrowser() {
		driver.quit();
		
		
	}

}
