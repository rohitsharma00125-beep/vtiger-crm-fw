package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOne 
{
	
	public CheckOutOne(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Checkout: Your Information")
	private WebElement heading1;//page heading
	
	public WebElement getHeading1() 
	{
		return heading1;
		
	}
	
	
	@FindBy(id="first-name")
	private WebElement fname;
	
	public WebElement getFname() 
	{
		return fname;
		
	}
	
	@FindBy(id="last-name")
	private WebElement lname;
	
	public WebElement getLname() 
	{
		return lname;
		
	}
	
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	public WebElement getPostalCode() 
	{
		return postalcode;
		
	}
	
	@FindBy(className = "btn_primary cart_button")
	private WebElement continuebutton;
	
	public WebElement getContinueButton() 
	{
		return continuebutton;
		
	}
	
	
	
	
	
	
	
}
