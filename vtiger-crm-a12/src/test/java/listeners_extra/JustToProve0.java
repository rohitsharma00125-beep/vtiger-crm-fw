package listeners_extra;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass2;

@Listeners(listener_utility.List_Imp.class)
class JustToProve0 extends BaseClass2
{

	@Test
	public void genRep() throws InterruptedException {
		Assert.assertTrue(false);
		Thread.sleep(2000);
	}

	@Test
	public void genRep2() throws InterruptedException {
		Assert.assertTrue(true);
		//int a = 11 used for fail the test case

       System.out.println("5-12-25");
		Thread.sleep(2000);
	}

	
	@Test(dependsOnMethods = "genRep")
	public void genRep3() throws InterruptedException {
		Thread.sleep(2000);
	}
}