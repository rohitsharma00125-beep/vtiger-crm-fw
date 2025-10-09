package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemo 
{
    	public static void main(String[] args) throws InterruptedException 
    	{
    	System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");//edgedriver not working that's why add this line. so ignore this line
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(3000);

        // ===== LOGIN PAGE =====
        LoginPage lp = new LoginPage(driver);

        // Declaration & initialization
        WebElement uN = lp.getUn();
        WebElement pwD = lp.getPwd();
        WebElement logiN = lp.getLogin();

        // Refreshing before use (optional)
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Utilization
        uN.sendKeys("standard_user");
        pwD.sendKeys("secret_sauce");
        logiN.click();

        // ===== VERIFY LOGIN =====
        HomePage hp = new HomePage(driver);
        WebElement logo = hp.getLogo();

        if (logo.isDisplayed()) 
        {
            System.out.println("Logged in successfully!");
        } 
        else 
        {
            System.out.println(" Could not log in!");
        }

        Thread.sleep(2000);

        // ===== ADD PRODUCT TO CART =====
        WebElement addToCart = hp.getAddToCartBikeLight();
        addToCart.click();
        Thread.sleep(5000);

        // ===== OPEN CART =====
        hp.openCart();
        Thread.sleep(2000);

        // ===== CART PAGE =====
        CartPage cp = new CartPage(driver);

        // Click on Checkout button
        WebElement clickcheckoutButton = cp.getCheckoutButton();
        clickcheckoutButton.click();
        Thread.sleep(2000);

        // ===== CHECKOUTONE PAGE =====
        CheckOutOne cp1 = new CheckOutOne(driver);

        // Declaration & initialization
        WebElement fn = cp1.getFN();
        WebElement ln = cp1.getLN();
        WebElement pc = cp1.getPC();
        WebElement cb = cp1.getCB();

        // Utilization
        fn.sendKeys("Rohit");
        ln.sendKeys("Sharma");
        pc.sendKeys("122001");
        cb.click();
        Thread.sleep(3000); 
        
     // ===== Checkouttwo PAGE =====
        CheckOutTwo ch2 = new CheckOutTwo(driver);

        // Click Checkout button
        WebElement clickfinishButton = ch2.getFinishButton();
        clickfinishButton.click();
        Thread.sleep(2000);
        
        
        
        //verify confirmation page
        ConfirmationPage confpage = new ConfirmationPage(driver);
        // Click Checkout button
        WebElement plogo = confpage.getPonyLogo();
        if (plogo.isDisplayed()) 
        {
            System.out.println("Thank you for your order");
        } 	
        else 
        {
            System.out.println(" Something went wrong");
        }
        	Thread.sleep(3000);
        	driver.quit();
        
    	}
}