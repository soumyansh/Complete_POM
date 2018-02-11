package TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Pages.AccountsPage;
import Pages.ServicesSelectionPage;
import Pages.TopMenu;
import TestBase.TestBase;
import Utilities.TestUtil;

public class CreateAccountTest extends TestBase  {
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void CreateAccount(Hashtable<String,String>data){
		ServicesSelectionPage ssp=new ServicesSelectionPage();
		AccountsPage ap=ssp.SelectCRM();
		
		ap.AccountCreation(data.get("MemberName"));
	}
}
