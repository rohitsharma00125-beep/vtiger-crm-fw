package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

		public HomePage(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);
		}

		@FindBy(className = "app_logo")
		private WebElement logo;

		// Bike LIGHT Add to Cart 
		
		@FindBy(xpath ="//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//button")
		//we used //button in path. Because it find the button element in whole ancestor path.new thing to learn.
	    private WebElement addToCartBikeLight;

	    @FindBy(className = "shopping_cart_link")
	    private WebElement cartButton;
	    
	    
	    
	    public WebElement getLogo() 
	    {
			return logo;
		}
	    
	    public WebElement getAddToCartBikeLight() 
	    {
	        return addToCartBikeLight;
	    }

	    public void openCart() 
	    {
	        cartButton.click();
	    }
}