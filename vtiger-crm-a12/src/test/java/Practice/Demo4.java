package Practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException,InvalidSelectorException,NoSuchElementException,NoSuchWindowException,NoAlertPresentException,NoSuchFrameException
	
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // TimeOutException - Waiting for an element that does NOT appear within 5 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nonExistingElement")));

            driver.findElement(By.id("nonExistingElement")).click();
			
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//InvalidSelectorException
			driver.findElement(By.cssSelector("alt='Login'")).click();
		
	
			//NoSuchElementException
			driver.findElement(By.cssSelector("[alt='Loginn']")).click();
			
			//NoSuchWindowException
			driver.switchTo().window("abc");
			
			//NoAlertPresentException
			driver.switchTo().alert();
			
			//NoSuchFrameException
			driver.switchTo().frame(2);
			
			}
			
			catch(TimeoutException e)
			{
				System.out.println("Exception Occurred Element not found within given time " + e.getMessage());
			}
			
			catch(InvalidSelectorException e)
			{
				System.out.println("Exception Occurred " + e.getMessage());
			}
		
			catch(NoSuchElementException e)
			{
				System.out.println("Exception Occurred " + e.getMessage());
			}
			
			catch(NoSuchWindowException e)
			{
				System.out.println("Exception Occurred " + e.getMessage());
			}
			
			catch(NoAlertPresentException e)
			{
				System.out.println("Exception Occurred " + e.getMessage());
			}
			
			catch(NoSuchFrameException e)
			{
				System.out.println("Exception Occurred " + e.getMessage());
			}
		
				driver.quit();
	}
}

