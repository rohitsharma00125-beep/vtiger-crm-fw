package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutTwo 
{
	public CheckOutTwo(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Checkout: Overview")
	private WebElement heading2;
	
	public  WebElement getHeading2() 
	{
		return heading2;
	}
	
	
	@FindBy(className ="btn_action cart_button")
	private WebElement finishbutton;
	
	public WebElement getFinishButton() 
	{
		return finishbutton;
		
	}
	
	
	
	
	
	
	
	
	
	
}
