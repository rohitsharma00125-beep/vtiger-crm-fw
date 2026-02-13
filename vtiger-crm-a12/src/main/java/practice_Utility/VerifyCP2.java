package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCP2 
{
	public VerifyCP2(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
		@FindBy(id="dtlview_First Name")
		private WebElement vfname2;
		
		public WebElement getVfname2()
		{
			return vfname2;
		}
		@FindBy(id="dtlview_Last Name")
		private WebElement vlname2;
		public WebElement getVlname2()
		{
			return vlname2;
		}	
	
	
	
	
	

}
