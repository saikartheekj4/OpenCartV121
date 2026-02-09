package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_02_LoginPage extends BaseClass {
	
	
	@Test(groups={"Regression","Master","sanity"})
	public void Verify_AccountPage()
	{
		
		logger.info("***************Starting TC_02_LoginPage*****************");
		
		
		try
		{
		HomePage hp = new HomePage(driver);
		
		hp.MyAccount();
		
		hp.Login();
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Email(p.getProperty("email"));
		lp.Password(p.getProperty("password"));
		lp.Login_Button();
		
		
		
		MyAccountPage myacc = new MyAccountPage(driver);
		
		boolean targetpage=myacc.AccountPageExists();
		
		myacc.Logout();
		
		//Assert.assertEquals(targetpage, false, "Login Failed");
		
		Assert.assertTrue(targetpage);
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("***************Starting TC_02_Finished Execution*****************");
	}
	
	
	
	
	
	
	

}
