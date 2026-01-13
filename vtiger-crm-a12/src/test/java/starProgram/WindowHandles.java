package starProgram;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles 
{

		public static void main(String[] args) throws InterruptedException 
		{

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://omayo.blogspot.com/");
			Thread.sleep(5000);
			driver.findElement(By.id("selenium143")).click();
			
			
			String windowHandle = driver.getWindowHandle();

			Set<String> windowHandles = driver.getWindowHandles();

			List<String> windowList = new ArrayList<>(windowHandles);
			System.out.println(windowHandle);
			System.out.println(windowHandles);
			System.out.println(windowList.get(0));
			System.out.println(windowList.get(1));
			
			driver.switchTo().window(windowList.get(1));
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.linkText("What is Selenium?")).click();
			driver.findElement(By.linkText("Join our Telegram Group")).click();
			
			Set<String> windowHandles1 = driver.getWindowHandles();

			List<String> windowList1 = new ArrayList<>(windowHandles1);
			
			driver.switchTo().window(windowList1.get(2));
			Thread.sleep(3000);
			driver.findElement(By.linkText("Preview channel")).click();
			
			
			driver.switchTo().window(windowList.get(0));
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.linkText("compendiumdev")).click();
			Thread.sleep(2000);
			
			driver.quit();

		}
		}
