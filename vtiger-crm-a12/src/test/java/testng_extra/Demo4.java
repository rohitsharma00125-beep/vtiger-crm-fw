package testng_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 
{
	@Test
	public void assembly1()
	{
		System.out.println("weldshop");
	}
	
	@Test(dependsOnMethods = "assembly1")
	public void assembly2()
	{
		
		System.out.println("paintshop");
	}

	@Test(dependsOnMethods = {"assembly2","assembly1"})
	public void finalassembly()
	{
		System.out.println("final car");
	}


}
