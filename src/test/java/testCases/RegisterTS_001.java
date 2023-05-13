package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

import testBase.BaseClass;

public class RegisterTS_001 extends BaseClass
{
	@Test
	public void register()
	{
		
	HomePage hp=new HomePage(driver);	
	hp.myAccount();
	hp.clickonLogin();
	}
}
		
			
	

