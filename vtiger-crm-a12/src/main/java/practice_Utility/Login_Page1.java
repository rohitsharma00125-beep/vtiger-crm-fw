package practice_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.FileUtility;

public class Login_Page1 
{
public Login_Page1(WebDriver driver)
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
	
	public void login1() throws IOException
	{
		FileUtility fUtil = new FileUtility();
		String USERNAME = fUtil.getDataFromPropertiesFile("un");
		String PASSWORD = fUtil.getDataFromPropertiesFile("pwd");
		un.sendKeys(USERNAME);
		pwd.sendKeys(PASSWORD);
		
		lnBtn.click();
	}
	
}
