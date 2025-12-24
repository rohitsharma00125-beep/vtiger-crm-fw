package Practice;

import java.io.IOException;

import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.WebDriverUtility;

public class Demo {

	/*public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		WDUtility w=new WDUtility(driver);
		w.wmax();
		w.screenShot("new");
		//WebElement dd= dribenfv
		//w.selectDD(dd, 2);
		w.moveToEle(null);
		

	}*/
	
	
	/*@Test(priority = 3)
	public static void m1()
	{
		System.out.println("1");
	}
	
	@Test(priority = 0)
	public static void m2()
	{
		System.out.println("2");
	}
	
	@Test(priority = -8)
	public static void m3()
	{
		System.out.println("3");
	}*/
	
	@Test(invocationCount = 5,threadPoolSize = 2)
	public void m4()
	{
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}
	
	

}
