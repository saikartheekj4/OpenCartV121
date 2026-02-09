package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@value=\"Login\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="(//*[text()='Logout'])[2]")
	WebElement logoutbtn;
	
	//Action Methods
	
	public void Email(String Email)
	{
		email.sendKeys(Email);
		
	}
	
	public void Password(String pwd)
	{
		Password.sendKeys(pwd);
		
		
	}
	
	public void Login_Button()
	{
		
		loginbtn.click();
	}
	
	public void Logou_btn()
	{
		logoutbtn.click();
	}
	
	
	
	
	
	
	
}
