package listeners_extra;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class JustToProve4 //switch off the net then execute it
{
	@Test(retryAnalyzer = listener_utility.List_Imp_Retry.class)
	public void case4() 
	{
		WebDriver driver = null;
		try {
			
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");

			/*WebElement logo = driver.findElement(By.id("nav-logo-spriteuyhy78j8j"));
			
			Assert.assertTrue(logo.isDisplayed());*/

			}

		
		  finally 
		  	{ 
			  driver.quit(); 
		  	}
		 
	}
}