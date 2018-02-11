package TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ServicesSelectionPage;
import Pages.TopMenu;
import TestBase.TestBase;
import Utilities.TestUtil;

public class LoginTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void doLogin(Hashtable<String, String> data) {
		HomePage hp = new HomePage();
		LoginPage lp = hp.ClickOnSignIn();
		lp.doLogin(data.get("UserName"), data.get("Password"));
		System.out.println("Login Done by Garvita 223");

	}

}
