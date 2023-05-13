package testCases;




import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Myaccount;
import testBase.BaseClass;

public class TC_002LoginTest extends BaseClass
{
	@Test
	public void loginVerification()
	{
		HomePage hp=new HomePage(driver);
		hp.myAccount();
		hp.clickonLogin();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickonLogin();
		Myaccount ma=new Myaccount(driver);
Assert.assertTrue(ma.Account());
ma.signOff();
}
}