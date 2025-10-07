package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage 
{
	public ConfirmationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(className = "pony_express")
	private WebElement ponylogo;

		public WebElement getPonyLogo() 
		{
			return ponylogo;
		}
}
