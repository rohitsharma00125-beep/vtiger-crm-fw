package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 //class name homepage1 isliye diya hai kyunki test class me i.e. Demo1 me jab iska object
//bna rha hu toh ye HomePage class object_repository wala le rha hai. isliye name change kr diya 
{

public HomePage1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	
	@FindBy(linkText = "Contacts")
	private WebElement contactBtn;
	
	public WebElement getcontactBtn() 
	{
	return contactBtn;	
	}
	
	@FindBy(css ="img[src='themes/softed/images/user.PNG']")
	private WebElement profileIcon;
	public WebElement getprofileIcon()
	{
		return profileIcon;
	}
	@FindBy(css ="a[href='index.php?module=Users&action=Logout']")
	private WebElement signout;
	public WebElement getsignOut()
	{
		return signout;
	}
	
	
	
	
}
