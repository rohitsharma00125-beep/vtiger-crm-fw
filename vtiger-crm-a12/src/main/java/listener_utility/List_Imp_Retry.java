package listener_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class List_Imp_Retry implements IRetryAnalyzer {
	int count = 0;
	int initCount = 5;

	@Override
	public boolean retry(ITestResult result) 
	{
		
	

		if (count < initCount) 
		{
			count++;
			return true;
		}
		return false;
	}
}

