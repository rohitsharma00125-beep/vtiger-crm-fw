package types_of_execution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo2 
{
@Test(groups = "Smoke Testing")
public void case11() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.quit();
}

@Test(groups = "Smoke Testing")
public void case12() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.quit();
}

@Test(groups = "Regression Testing")
public void case13() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	driver.quit();
}




}
