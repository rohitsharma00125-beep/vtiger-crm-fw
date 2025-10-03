package contact;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import generic_utility.FileUtility;

public class Contact3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FileUtility f   =   new FileUtility();
		String Url 	    =	f.getDataFromPropertiesFile("url");
		String Browser  =	f.getDataFromPropertiesFile("bro");
		String Username =	f.getDataFromPropertiesFile("un");
		String Password =	f.getDataFromPropertiesFile("pwd");
		
		WebDriver driver = null;
		
		if(Browser.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(Browser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Something went wrong");
			
		}
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String fname =	f.getStringDataFromExcelFile("Contact", 1, 0);
		String lname =	f.getStringDataFromExcelFile("Contact", 1, 1);
		String mobile =	f.getStringDataFromExcelFile("Contact", 1, 2);
		
		
		
		driver.get(Url);
		Thread.sleep(3000);
		driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
		
		WebElement dd = driver.findElement(By.name("salutationtype"));
		Select sel = new Select(dd);
		sel.selectByValue("Mr.");
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("mobile")).sendKeys(mobile);
		driver.findElement(By.cssSelector("[type=\'checkbox\']")).click();
		driver.findElement(By.cssSelector("[title=\'Save [Alt+S]\']")).click();
		
		String actualFName = driver.findElement(By.id("dtlview_First Name")).getText();
		String actualLName = driver.findElement(By.id("dtlview_Last Name")).getText();
		String actualMobile = driver.findElement(By.id("dtlview_Mobile")).getText();
		
		
		if (fname.equals(actualFName) && lname.equals(actualLName) && mobile.equals(actualMobile)) 
		{
			System.out.println("created contact successfully!!!!");
		}
		else 
		{
			System.out.println("something went wrong");
		}

		WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(profilePic).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
