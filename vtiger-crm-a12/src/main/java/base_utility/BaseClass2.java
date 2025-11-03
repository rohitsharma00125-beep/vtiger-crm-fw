package base_utility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import generic_utility.FileUtility;
import generic_utility.JavaUtility;
import generic_utility.WebDriverUtility;
import object_repository.HomePage;
import object_repository.LoginPage;

public class BaseClass2 implements ISuiteListener,ITestListener{


	
		public WebDriver driver;	
		public ExtentReports report;
		ExtentTest test;
		@Override
		public void onStart(ISuite suite) {
		String rep = JavaUtility.currentTime();

		ExtentSparkReporter spark = new ExtentSparkReporter("./ad_reports/" + rep + ".html");
		spark.config().setDocumentTitle("vtiger");
		spark.config().setReportName("First Report");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Window", "11");
		report.setSystemInfo("Processor", "intel");
		report.setSystemInfo("Username", "Rohit");
		report.setSystemInfo("Project", "vtiger");
	}
		

		@Override
		public void onTestStart(ITestResult result) {
			String methodName = result.getMethod().getMethodName();
			test = report.createTest(methodName);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, "This is passing");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			test.log(Status.FAIL, "This is failing");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, "This is skipped");
		}
	@BeforeClass
	public void openBro() throws IOException {
		FileUtility fUtil = new FileUtility();
		String BROWSER = fUtil.getDataFromPropertiesFile("bro");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		FileUtility fUtil = new FileUtility();
		String URL = fUtil.getDataFromPropertiesFile("url");
	
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.login();
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);
		WebElement profilePic = hp.getProfilePic();

		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.hover(profilePic);
		
		hp.getSignOutLink().click();
	}
	
	@AfterClass
	public void closeBro() {
		driver.quit();
	}
	
	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		//System.out.println("Suite finished: " + suite.getName());
	}
}
