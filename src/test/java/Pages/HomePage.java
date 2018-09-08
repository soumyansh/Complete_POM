package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class HomePage extends TestBase {

	public LoginPage ClickOnSignIn(){

	
	driver.findElement(By.xpath("//*[text()='Login']")).click();
		return new LoginPage();
	}
	
}
