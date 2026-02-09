package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		
		super(driver);
	}

	

	@FindBy(xpath="(//*[text()='My Account'])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement Register;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement Login;
	
	
	public void MyAccount()
	{
		MyAccount.click();
		
	}
	
	public void Register()
	{
		Register.click();
	}
	
	public void Login()
	{
		
		Login.click();
	}
	
	
	
}
