
package gu_extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.WebDriverUtility2;

public class TestScript 
{
	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		
		WebDriverUtility2 wdUtil = new WebDriverUtility2(driver);

		wdUtil.openUrl();
		
//		driver.manage().window().maximize();
		wdUtil.winMax();
		
		WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

//		Actions act = new Actions(driver);
//		act.moveToElement(profilePic).build().perform();
		wdUtil.hover(profilePic);
		
		
		
	}
}
