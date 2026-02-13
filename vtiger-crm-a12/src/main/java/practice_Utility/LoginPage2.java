package practice_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.FileUtility;

public class LoginPage2 
{
	
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(name="user_name")
		private WebElement un;
		
		public WebElement getUN()
		{
			return un;
		}
		
		@FindBy(name="user_password")
		private WebElement pwd;
		
		public WebElement getPWD()
		
		{
			return pwd;
		}
		
		@FindBy(id="submitButton")
		private WebElement lnBtn;
		
		public WebElement getLNBTN()
		{
			return lnBtn;
		}
		
		
		
		public void login2() throws IOException
		{
			
			FileUtility futil = new FileUtility();
			String Uname=futil.getDataFromPropertiesFile("un");
			String Pwd=futil.getDataFromPropertiesFile("pwd");
			un.sendKeys(Uname);
			pwd.sendKeys(Pwd);
			lnBtn.click();
			
		}
		

}
