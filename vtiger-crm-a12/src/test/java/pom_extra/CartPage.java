package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	public CartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(className = "btn_primary btn_inventory")
		private WebElement acbutton;//location of add to cart button
		
		public WebElement getCartButton()
		{
			return acbutton;
			
		}
	
		@FindBy(className = "svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ")
		private WebElement cartlogo;//location of cart logo
		
		public WebElement getCartLogo()
		{
			return cartlogo;
			
		}
		
		@FindBy(className = "btn_action checkout_button")
		private WebElement cobutton;//location of checkout button
		
		public WebElement getcheckOutButton()
		{
			return cobutton;
			
		}
	
	

}
