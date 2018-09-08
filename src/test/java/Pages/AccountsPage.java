package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;
import Utilities.TestUtil;

public class AccountsPage extends TestBase {

	public void AccountCreation(String membername){
		menu.Accounts();
		driver.findElement(By.cssSelector(".newwhitebtn.customPlusBtn")).click();
		driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(membername);
	
	}
	
}
