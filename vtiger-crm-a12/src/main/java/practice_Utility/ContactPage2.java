package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage2 
{
	
public ContactPage2 (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	
	@FindBy(css="img[src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;
	public WebElement getplusicon() 
	{
		return plusicon;
		
	}
	
	
	@FindBy(name="salutationtype")
	private WebElement dd;
	public WebElement getdd() 
	{
		return dd;
	}
	
	@FindBy(name="firstname")
	private WebElement fname;
	public WebElement getfname()
	{
		return fname;
	}	

	@FindBy(name="lastname")
	private WebElement lname;
	public WebElement getlname()
	{
		return lname;
	}
	
	@FindBy(css="input[value='T']")
	private WebElement radiobtn;
	public WebElement getradiobtn() 
	{
		return radiobtn;
		
	}
	
	@FindBy(name="button")
	private WebElement savebtn;
	public WebElement getsavebtn() 
	{
		return savebtn;
	}
	

}
