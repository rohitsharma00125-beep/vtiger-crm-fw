package dp_extra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCheck 
{

	@Test(dataProvider = "getData")

	public void loginToSauceDemo(String username, String password) 
	{

//				String username = "Dinga";//we should never use hard code the data

//				String password = "Dingi@143";

		 System.out.println(username);

		 System.out.println(password);

	}

	@DataProvider
	public Object[][] getData() 
	{

		Object[][] cred = new Object[5][2];

//									  row => number of executions

//									  col => number of parameters

		cred[0][0] = "Rohit";

		cred[0][1] = "rohit@123";

		cred[1][0] = "Soni";

		cred[1][1] = "soni@123";

		cred[2][0] = "Rajan";

		cred[2][1] = "rajan@123";

		cred[3][0] = "Raj";

		cred[3][1] = "raj@123";

		cred[4][0] = "Vishal";

		cred[4][1] = "vishal@123";

		return cred;
	}

}
