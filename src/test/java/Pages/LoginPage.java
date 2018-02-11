package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class LoginPage extends TestBase {

	public ServicesSelectionPage doLogin(String username,String password){
		driver.findElement(By.cssSelector("#lid")).sendKeys(username);
		driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
		driver.findElement(By.cssSelector("#signin_submit")).click();
		return new ServicesSelectionPage();
	}
	
}
