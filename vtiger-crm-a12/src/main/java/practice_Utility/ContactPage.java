package practice_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
public ContactPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}

@FindBy(css="img[src='themes/softed/images/btnL3Add.gif']")
private WebElement plusicon;
public WebElement getlpusIcon() 
{
	return plusicon;
}

@FindBy(name="salutationtype")
private WebElement dropdown;
public WebElement getDropDown()
{
	return dropdown;
}
	
@FindBy(name="firstname")
private WebElement fname;
public WebElement getFname()
{
	return fname;
}	

@FindBy(name="lastname")
private WebElement lname;
public WebElement getLname()
{
	return lname;
}

@FindBy(name="button")
private WebElement savebtn;
public WebElement getSaveBtn() 
{
	return savebtn;
}




}
