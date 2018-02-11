package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class HomePage extends TestBase {

	public LoginPage ClickOnSignIn(){
	driver.findElement(By.cssSelector(".signin")).click();
		return new LoginPage();
	}
	
}
