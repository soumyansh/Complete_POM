package TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ServicesSelectionPage;
import Pages.TopMenu;
import TestBase.TestBase;
import Utilities.TestUtil;

public class LoginTest_User extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void doLogin_User(Hashtable<String, String> data) {
	////////logger=extent.startTest("Starting Login");
		HomePage hp = new HomePage();
		LoginPage lp = hp.ClickOnSignIn();
		lp.doLogin(data.get("UserName"), data.get("Password"));
		System.out.println("Login Done by User");

	}

}
