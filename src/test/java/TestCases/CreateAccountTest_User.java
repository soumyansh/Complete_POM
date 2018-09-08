package TestCases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.AccountsPage;
import Pages.ServicesSelectionPage;
import Pages.TopMenu;
import TestBase.TestBase;
import Utilities.TestUtil;

public class CreateAccountTest_User extends TestBase  {
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void CreateAccountTest_User(Hashtable<String,String>data){
	//	logger=extent.startTest("Starting Create Account");
		ServicesSelectionPage ssp=new ServicesSelectionPage();
		AccountsPage ap=ssp.SelectCRM();
		
		ap.AccountCreation(data.get("MemberName"));
		
	}
}
