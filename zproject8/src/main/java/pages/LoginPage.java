package pages;

import org.openqa.selenium.By;
import static app.Common.driver;

public class LoginPage {
	
	public By edit_username=By.xpath("//input[@name='username']");
	public By edit_password=By.xpath("//input[@name='password']");
	public By btn_login=By.xpath("//input[@value='Log In']");
	public By txt_customer_login=By.xpath("//h1[normalize-space()='Accounts Overview']");
	
	

	public void verifyLoginPage() {
		driver.findElement(edit_username).sendKeys("test123");
		driver.findElement(edit_password).sendKeys("test123");
		driver.findElement( btn_login).click();
	}

	public void performlogin() {
		if(driver.findElement(txt_customer_login).isDisplayed()) {
			System.out.println("Pass - user login successfull");
		}else {
			System.out.println("login is not successfull");
		}
	}

}
