package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2
{
	
	public HomePage2 (WebDriver driver)
	{
		
	PageFactory.initElements( driver, this);	
			
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	public WebElement getcontactLink()
	{
		return contactLink;
		
	}
	
	
	@FindBy(css="img[src='themes/softed/images/user.PNG']")
	private WebElement picon;
	public WebElement getpicon() 
	{
		return picon;
		
	}
	
	@FindBy(className ="drop_down_usersettings")
	private WebElement solink;
	public WebElement getsolink()
	{
		return solink;
		
	}
	

}
