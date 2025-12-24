package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ArrayCheck2 
{

	//helper attribute
	@Test(dataProvider = "getData", dataProviderClass = dataprovider_utility.Data_Provider.class)
	
	public void loginToVtiger(String url,String username, String password) throws InterruptedException 
	{

				
		// System.out.println(url);
		// System.out.println(username);
		//System.out.println(password);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
