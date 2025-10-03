package contact;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contact2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(3000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("[title='Create Contact...'")).click();
		
		WebElement dd = driver.findElement(By.name("salutationtype"));
		Select sel = new Select(dd);
		sel.selectByValue("Mr.");
		
		String fname = "ROHIT";
		String lname = "SHARMA";
		String mobile = "9560354604";
		
		
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
		driver.close();
	}

}
