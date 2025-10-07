package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemo {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/v1/");

		LoginPage lp = new LoginPage(driver);

		// login
		// Declaration with initialization
		WebElement uN = lp.getUn();
		WebElement pwD = lp.getPwd();
		WebElement logiN = lp.getLogin();

		driver.navigate().refresh();

		// Utilization
		uN.sendKeys("standard_user");
		pwD.sendKeys("secret_sauce");
		logiN.click();
		Thread.sleep(5000);
		

		// verify
		HomePage hp = new HomePage(driver);

		// Declaration & initialization
		WebElement logo = hp.getLogo();

		// utilization
		if (logo.isDisplayed()) 
		{
			System.out.println("Logged in successfully!!!!");
		} 
		else 
		{
			System.out.println("Could not log in....");
		}

		Thread.sleep(5000);

		// Click on add to cart button
		CartPage cp = new CartPage(driver);
		WebElement cartButton = cp.getCartButton();
		cartButton.click();
		Thread.sleep(5000);

		// Click on cart logo

		WebElement cartLogo = cp.getCartLogo();
		cartLogo.click();
		Thread.sleep(5000);

		// click on checkout button
		WebElement coButton = cp.getcheckOutButton();
		coButton.click();
		Thread.sleep(5000);
		
		//verify checkoutone page. it is showing in url
		CheckOutOne coone =new CheckOutOne(driver);
		WebElement heading1 = coone.getHeading1();
		if(heading1.isDisplayed())
		{
			System.out.println("checkoutone page is displayed");
		}
		else
		{
			System.out.println("something went wrong");
		}
		
		WebElement fName =coone.getFname();//first name text field
		fName.sendKeys("Rohit");
		
		WebElement lName =coone.getLname();//last name text field
		fName.sendKeys("Sharma");
		
		WebElement pCode =coone.getPostalCode();//zip/postal code text field
		fName.sendKeys("122001");
		
		WebElement contiButton =coone.getContinueButton();//click on continue button
		contiButton.click();
		Thread.sleep(5000);
		
		
		//verify checkouttwo page
		CheckOutTwo cotwo = new CheckOutTwo(driver);
		
		WebElement heading2 = cotwo.getHeading2();
		if(heading2.isDisplayed())
		{
			System.out.println("checkouttwo page is displayed");
		}
		else
		{
			System.out.println("something went wrong");
		}
		
		WebElement fiButton = cotwo.getFinishButton();
		fiButton.click();
		
		
		//verify confirmation/checkout page
		ConfirmationPage conpage = new ConfirmationPage(driver);
		WebElement ponyLogo = conpage.getPonyLogo();
		
		if(ponyLogo.isDisplayed())
		{
			System.out.println("checkout page is displayed");
			
		}
		else
		{
			System.out.println("something went wrong");
		}
		
		
		
	}

}
