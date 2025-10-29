
package types_of_execution1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 
{

	@Parameters({"bro","url","un","pwd"})//here we don't use property file
	@Test
	public void case3(String Browser,String URL,String UN, String PWD) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");
		WebDriver driver = null;



		if (Browser.equals("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (Browser.equals("edge")) 
		{
			driver = new EdgeDriver();
		} else if (Browser.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}

		Thread.sleep(5000);
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UN);	
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
		driver.quit();
	}
	

}