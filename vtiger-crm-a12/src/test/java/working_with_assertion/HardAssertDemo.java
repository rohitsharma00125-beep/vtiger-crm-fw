package working_with_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo 
{
	@Test
	public void case1() 
	{
		String a = "abc";
		String b = "abc";
		String c = "xyz";
		
		Object obj1 = null;
		Object obj2 = new Object();

		boolean status1 = a.equals(c);//false
		boolean status2 = b.equals(c);//false
	
		Assert.assertTrue(status2);//failed
		Assert.assertFalse(status1);//pass
	
		Assert.assertEquals(a, b);//pass
		Assert.assertNotEquals(a, c);//pass

		Assert.assertNull(obj1);//pass
		Assert.assertNotNull(obj2);//pass
		
	}

}
