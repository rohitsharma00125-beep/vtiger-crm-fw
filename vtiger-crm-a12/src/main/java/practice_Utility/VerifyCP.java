package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCP 
{
public VerifyCP(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
	@FindBy(id="dtlview_First Name")
	private WebElement vfname;
	
	public WebElement getVfname()
	{
		return vfname;
	}
	@FindBy(id="dtlview_Last Name")
	private WebElement vlname;
	public WebElement getVlname()
	{
		return vlname;
	}
	
}
