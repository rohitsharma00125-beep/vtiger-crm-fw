package testng_extra;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo6 
{

	    @BeforeMethod
	    public void setup() {
	        System.out.println(" login successful");
	    }

	    @Test
	    public void test1() {
	       
	        Assert.assertTrue(false);//intentionally fail the test case
	        System.out.println("Test 1 started");
	    }
	    

	    @Test(dependsOnMethods = "test1", alwaysRun = true)
	    public void test2() {
	        System.out.println("Test 2 started");
	    }

	    @AfterMethod
	    public void tearDown() {
	        System.out.println("logout");
	    }
	}

	
	
	
	
	

