package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11111 
{
	/*public static void main(String[] args) throws InterruptedException   
	{
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(3);
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 WebElement loginButton = driver.findElement(By.className("ijdqUS"));
	 
	// System.out.println(loginButton.getTagName());
	 System.out.println(loginButton.getCssValue("width"));
	}*/
	
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
				
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		
		String name = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']")).getText();
		
		System.out.println(name);
	
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']/../..//div[contains(@class,'DiR')]")).getText();

		System.out.println(price);
	}
	
}
