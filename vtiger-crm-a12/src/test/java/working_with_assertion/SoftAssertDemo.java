package working_with_assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test
	public void case1() 
	{
		String a = "abc";
		String b = "abc";
		String c = "xyz";
		
		Object obj1 = null;
		Object obj2 = new Object();

		boolean status1 = a.equals(b);//true
		boolean status2 = b.equals(c);//false
		
		SoftAssert sa = new SoftAssert();

		sa.assertTrue(status2);//failed
		sa.assertFalse(status1);//failed
		
		sa.assertTrue(status1);//pass
		sa.assertFalse(status2);//pass

		sa.assertEquals(a, b);//pass
		sa.assertNotEquals(a, c);//pass

		sa.assertNull(obj1);//pass
		sa.assertNotNull(obj2);//pass
		
		sa.assertAll();
		
	}

}
