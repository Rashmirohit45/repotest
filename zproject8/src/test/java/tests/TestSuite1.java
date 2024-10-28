package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.FrameWorkUtils;

public class TestSuite1 {
 
	@Test
	public void testLogin() {
		LoginPage loginPage=new LoginPage();  
		Homepage homepage =new Homepage();
		FrameWorkUtils.setUpDriver();
		BrowserUtils.launchBrowser();
		BrowserUtils.invokeApp();
		loginPage.verifyLoginPage();
		loginPage.performlogin();
		homepage.verifyHomepage();
		homepage.logout();
		BrowserUtils.killBrowser();
		
		
		
		
		}
	}
		
