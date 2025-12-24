package Practice;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
	
	 
	    public static void main(String[] args) 
	    {
	    	WebDriver driver= new ChromeDriver();
	        
	        driver.get("https://example.com");
	        try {
	           

	            // ❌ Trying to switch to a window that does not exist
	            driver.switchTo().window("InvalidWindowName");
	        	
	        
	        

	            // ❌ Trying to switch to a frame that does not exist
	            driver.switchTo().frame("InvalidFrame");
	            }

	        catch (NoSuchWindowException e1) {
	            System.out.println("NoSuchWindowException handled: Window not found");

	        } catch (NoSuchFrameException e) {
	            System.out.println("NoSuchFrameException handled: Frame not found");

	        } 
			        finally 
			        {
			            driver.quit();
			        }
			    
	}

}
