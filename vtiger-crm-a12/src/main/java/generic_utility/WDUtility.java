package generic_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WDUtility 
{
WebDriver driver;
Actions act;

	public WDUtility(WebDriver driver)
	{
	this.act=new Actions(driver);
	this.driver=driver;	
		
	}
	
	public void wmax() 
	{
		driver.manage().window().maximize();	
	}
	public void wmin()
	{
		driver.manage().window().minimize();
	}
	public void openUrl() 
	{
		driver.get("flipkart.com");
	}
	public void screenShot(String ssname) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./screeenshot/" +ssname+ ".png");
		FileHandler.copy(src, dest);
	}
	public void selectIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void moveToEle(WebElement element)
	{
		act.moveToElement(element).perform();;
	}
	public void rightClick(WebElement element)
	{
		act.contextClick(element).perform();
	}
}
