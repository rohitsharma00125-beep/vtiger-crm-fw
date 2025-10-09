package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//	Initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);//always write this in second position
	}

	//	declaration
	@FindBy(id = "user-name")
	private WebElement un;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "login-button")
	private WebElement login;

	//	Getter Method
	public WebElement getUn() 
	{
		return un;
	}
	
	public WebElement getPwd() 
	{
		return pwd;
	}
	
	public WebElement getLogin() 
	{
		return login;
	}
}