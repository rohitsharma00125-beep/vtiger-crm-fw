package base_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic_utility.FileUtility;
import generic_utility.WebDriverUtility;
import practice_Utility.HomePage1;
import practice_Utility.Login_Page1;

public class BaseClass3 {

	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeClass
	public void openBro() throws IOException {
		FileUtility fUtil = new FileUtility();
		String BROWSER = fUtil.getDataFromPropertiesFile("bro");

		if (BROWSER.equalsIgnoreCase("chrome")) //it is not case sensitive and equals() is case sensitive
		{
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		sdriver = driver;
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() throws IOException {
		FileUtility fUtil = new FileUtility();
		String URL = fUtil.getDataFromPropertiesFile("url");

		driver.get(URL);
		Login_Page1 lp1 = new Login_Page1(driver);//
		lp1.login1();
	}

	@AfterMethod
	public void logout() {
		HomePage1 hp1 = new HomePage1(driver);
		WebElement profileIcon = hp1.getprofileIcon();

		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.hover(profileIcon);

		hp1.getsignOut().click();

	}

	@AfterClass
	public void closeBro() {
		driver.quit();
	}

}
