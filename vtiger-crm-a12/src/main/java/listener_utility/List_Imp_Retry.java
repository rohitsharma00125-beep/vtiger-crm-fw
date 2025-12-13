package listener_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class List_Imp_Retry implements IRetryAnalyzer {
	
	int initCount = 0;
	int Count = 5; // retry test case 5 times
	@Override
	public boolean retry(ITestResult result) 
	{
		
	

		if (initCount < Count) 
		{
			initCount++;
			return true; // retry the test
		}
		return false; // do not retry
	}
}

