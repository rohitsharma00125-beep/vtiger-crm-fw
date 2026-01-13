package starProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EandFwait {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("hi");
	/*	driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Search for Products, Brands and More']")));
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobile");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		FluentWait wait = new FluentWait(driver);
		
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMilis(250));
		wait.ignoring(ElementNotInteractableException.class);
		wait.until(ExpectedConditions.alertsIsPresent());
		driver.switchTo().alert().accept();
		driver.quit();*/
		
		
		
		
		
		
		
	}

}

