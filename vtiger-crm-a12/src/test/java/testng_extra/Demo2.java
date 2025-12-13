package testng_extra;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 
{
		@Test
		public void create()
		{
			System.out.println("baby");
		}
		
		@Test(dependsOnMethods = "create")
		public void modify()
		{
			Assert.assertTrue(false);//it fail the test case intentionally
			System.out.println("boy");
			
		}

		@Test(dependsOnMethods = "modify")
		public void delete()
		{
			System.out.println("delete boy");
		}
	
	
	
	
	
	
}
