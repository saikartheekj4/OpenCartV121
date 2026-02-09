package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountRegistration;
import testBase.BaseClass;

public class TC_01_MyAccount extends BaseClass {
	
	
	@Test(groups={"sanity","Master","Regression"})
	public void TC_01_MyAccounts()
	
	
	
	{
		logger.info("********Staring TC_01_MyAccount*************");
		
		try
		{
		
		HomePage hp = new HomePage(driver);
		
		logger.info("********Clicking on My Account*************");
		hp.MyAccount();
		
		
		
		
		logger.info("********Clicking on Register Link*************");
		hp.Register();
		
		
		
		MyAccountRegistration myacc= new MyAccountRegistration(driver);
		
		logger.info("********Providing the Customer Details*************");
		
		myacc.FirstName(randomString().toUpperCase());
		myacc.Lastname(randomString().toUpperCase());
		myacc.Email(randomString()+"@gmail.com");
		myacc.Telephone(randomNumber());
		
		String password =randomAlphaNumeric();
		
		myacc.Password(password);
		myacc.ConfirmPassword(password);
		myacc.AgreeCheckbox();
		myacc.SubmitBt();
		
		String confmsg=myacc.getconfirmationMsg();
		
		logger.info("********Validating expected message*************");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		}
		catch(Exception e)
		{
			
			logger.error("Test Failed");
			logger.debug("Debug Logs");
			Assert.fail();
		}
		
		logger.info("********Finished Execution*************");
		
		
	}
	
		
	
	
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


