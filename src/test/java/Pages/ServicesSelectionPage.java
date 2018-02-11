package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class ServicesSelectionPage extends TestBase {

	public AccountsPage SelectCRM(){
		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		return new AccountsPage();
	}
	
}
