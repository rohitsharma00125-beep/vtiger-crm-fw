package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOne 
{

    // ===== Initialization =====
    public CheckOutOne(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }

    // ===== Element Declarations =====

    @FindBy(id = "first-name")//first name text field
    private WebElement FN;

    @FindBy(id = "last-name")//last name text field
    private WebElement LN;

    @FindBy(id = "postal-code")//zip/postal code
    private WebElement PC;

    @FindBy(xpath = "//input[@value='CONTINUE']")//continue button
    private WebElement CB;

//	Getter Method
	public WebElement getFN() 
	{
		return FN;
	}
	
	public WebElement getLN() 
	{
		return LN;
	}
	public WebElement getPC() 
	{
		return PC;
	}
	public WebElement getCB() 
	{
		return CB;
	}
	
}