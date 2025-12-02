package listener_utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import generic_utility.JavaUtility;

public class List_Imp implements ISuiteListener, ITestListener {

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		//System.out.println("Suite started: " + suite.getName());
		String rep = JavaUtility.currentTime();

		ExtentSparkReporter spark = new ExtentSparkReporter("./ad_reports/" + rep + ".html");
		spark.config().setDocumentTitle("vTiger");
		spark.config().setReportName("First Report");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Window", "11");
		report.setSystemInfo("Processor", "intel");
		report.setSystemInfo("OS", "Window");
		report.setSystemInfo("Tester", "Rohit");
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
	
	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		//System.out.println("Suite finished: " + suite.getName());
	}
}

