package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class TopMenu extends TestBase {

	public void Leads(){
	
		driver.findElement(By.cssSelector("#tab_Leads")).click();
	}


	public void Accounts() {
		driver.findElement(By.cssSelector("#tab_Accounts")).click();
		
	}
}
