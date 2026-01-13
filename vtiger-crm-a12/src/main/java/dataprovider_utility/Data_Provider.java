package dataprovider_utility;

import org.testng.annotations.DataProvider;

public class Data_Provider 
{
	@DataProvider
	public Object[][] getData() 
	{

		Object[][] cred = new Object[3][3];

//		row => number of executions, here we used 3

//		col => number of parameters, here we used 3


		cred[0][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[0][1] = "admin";
		
		cred[0][2] = "manager";

		cred[1][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[1][1] = "admin";
		
		cred[1][2] = "manager";
		
		cred[2][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[2][1] = "admin";
		
		cred[2][2] = "manager";
		
		return cred;
	}
	
	
	@DataProvider
	public static Object[][] getData1() 
	{

		Object[][] cred = new Object[3][3];


		cred[0][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[0][1] = "admin";
		
		cred[0][2] = "manager";

		cred[1][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[1][1] = "admin";
		
		cred[1][2] = "manager";
		
		cred[2][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[2][1] = "admin";
		
		cred[2][2] = "manager";
		
		return cred;
}
	@DataProvider
	public static Object[][] getData3() 
	{

		Object[][] cred = new Object[3][3];


		cred[0][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[0][1] = "admin";
		
		cred[0][2] = "manager";

		cred[1][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[1][1] = "admin";
		
		cred[1][2] = "manager";
		
		cred[2][0] = "http://localhost:8888/index.php?action=Login&module=Users";

		cred[2][1] = "admin";
		
		cred[2][2] = "manager";
		
		return cred;
}
	
}

