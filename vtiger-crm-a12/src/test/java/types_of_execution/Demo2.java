package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void case2() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();	
	Thread.sleep(5000);

	
	driver.quit();
	
	}
	
	

}
