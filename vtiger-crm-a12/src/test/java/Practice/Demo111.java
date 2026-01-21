package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo111//jsexecuter scrollIntoView method eg
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement btn=driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
	
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView(true)",btn );
		 jse.executeScript("arguments[0].click()",btn );
		 Thread.sleep(3000);
		 //btn.click();
		 driver.quit();
		//driver.manage().window().setSize(new Dimension(100, 100));
		//driver.manage().window().setPosition(new Point(200,300));
	
		
	
	}
}
