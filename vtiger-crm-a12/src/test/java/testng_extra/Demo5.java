package testng_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 
{
	@Test(invocationCount = 16,threadPoolSize = 3)
    public void testInvocation() {
        //System.out.println("Test method executed");
		//Reporter.log("hi i am rohit");
		WebDriver driver = new ChromeDriver();
		driver.quit();
	
	}	
	
}
