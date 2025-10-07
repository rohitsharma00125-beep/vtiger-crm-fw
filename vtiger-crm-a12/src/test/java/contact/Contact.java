package contact;


import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contact {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String Browser = p.getProperty("bro");
		String Url = p.getProperty("url");
		String Username = p.getProperty("un");
		String Password = p.getProperty("pwd");
		
		
		
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
		
		
		FileInputStream	fis1 = new FileInputStream("./src/test/resources/testScriptData.xlsx");	
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("Contact");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String fname = cell.getStringCellValue();
		
		Sheet sh1 = wb.getSheet("Contact");
		Row row1 = sh1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String lname = cell1.getStringCellValue();
		
		Sheet sh2 = wb.getSheet("Contact");
		Row row2 = sh2.getRow(1);
		Cell cell2 = row2.getCell(2);
		String mobile = cell2.getStringCellValue();
		
		
		
		
		
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
		driver.close();

	}

}
