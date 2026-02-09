package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountRegistration extends BasePage {

	public MyAccountRegistration(WebDriver driver) 
	{
		super(driver);
	}
	
	
	//Locators
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement Telephone;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@name=\"agree\"]")
	WebElement AgreeCheckbox;
	
	@FindBy(xpath="//*[@value=\"Continue\"]")
	WebElement SubmitBtn;
	
	@FindBy(xpath="(//*[text()='Your Account Has Been Created!'])[2]")
	WebElement ConfirmMessage;
	
	
	//ActionMethods
	
	public void FirstName(String fname)
	{
		
		FirstName.sendKeys(fname);
	}
	
	public void Lastname(String Lname )
	{
		
		LastName.sendKeys(Lname);
	}
	
	public void Email(String Email )
	{
		
		email.sendKeys(Email);
	}
	
	
	public void Telephone(String Tele )
	{
		
		Telephone.sendKeys(Tele);
	}
	
	
	public void Password(String pwd )
	{
		
		Password.sendKeys(pwd);
	}
	
	public void ConfirmPassword(String confirmpwd )
	{
		
		ConfirmPassword.sendKeys(confirmpwd);
	}
	
	
	public void AgreeCheckbox()
	{
		
		AgreeCheckbox.click();
	}
	
	public void SubmitBt()
	{
		
		SubmitBtn.click();
		
		//sol3
		//SubmitBtn.submit();
		
		
		//sol 4
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(SubmitBtn).build().perform();
		
		//sol5
		
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		mywait.until(ExpectedConditions.elementToBeClickable(SubmitBtn)).click();
		
		//sol6
		//SubmitBtn.sendKeys(Keys.RETURN);
		
		
	}
	
	public String getconfirmationMsg()
	{
		try
		{
			return(ConfirmMessage.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
}
