package testng_extra;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo3 
{
		@Test(priority =-1)
		public void case1()
		{
			System.out.println("Hi");//print in console
		}
		
		@Test(priority = 0)
		public void case2()
		{
			Reporter.log("hello",true);//print in both console & test-ng report
		}

		@Test(priority = 1)
		public void case3()
		{
			Reporter.log("morning", true);	//true → prints message both in TestNG report and console (stdout).

											//false → prints message only in the TestNG report, not in the console.
		}
	
	
	
	
	
	
}
