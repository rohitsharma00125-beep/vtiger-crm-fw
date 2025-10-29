package testng_extra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
		@Test
		public void case1()
		{
			System.out.println("Hi");//print in console
		}
		
		@Test(enabled = false)
		public void case2()
		{
			Reporter.log("hello");// print in report
			
		}

		@Test
		public void case3()
		{
			Reporter.log("morning", true);	//true → prints message both in TestNG report and console (stdout).

											//false → prints message only in the TestNG report, not in the console.
		}
	
	
	
	
	
	
}
