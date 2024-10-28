package pages;

import org.openqa.selenium.By;
import static app.Common.driver;
public class Homepage {
	
	
	
	public By text_account_overview=By.xpath("//h1[normalize-space()='Accounts Overview']");
	public By link_logout=By.xpath("//a[normalize-space()='Log Out']");
	public void verifyHomepage() {
		if(driver.findElement(text_account_overview).isDisplayed()) {
			System.out.println("Pass - user is in login page");
		}else {
			System.out.println("Fail- user is not in login page");
		}
		
	}

	public void logout() {
		driver.findElement(link_logout).click();
		
	}

}
