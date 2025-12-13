package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo112 //iframe
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		
		//1st method :-     driver.switchTo().frame(0);
		//below line is 2nd method
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		driver.findElement(By.id("datepicker")).sendKeys("05/14/2024");
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
