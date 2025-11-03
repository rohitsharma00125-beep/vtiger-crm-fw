package listeners_extra;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(base_utility.BaseClass2.class)
class List_Imp2 {

	@Test
	public void method1() throws InterruptedException {
		Assert.assertTrue(false);
		Thread.sleep(2000);
	}

	@Test
	public void method2() throws InterruptedException {
		Assert.assertTrue(true);
		
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "method1")
	public void method3() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test
	public void method4()  {
	
		//int a = 11 //didn't used semicolon because deliberately fail the test case.
  
	}
	
	
}