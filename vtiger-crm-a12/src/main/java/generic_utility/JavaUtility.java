package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility 
{
	public static String currentTime() //JavaUtility has less method that's y it is static no other specific reason
	{
		LocalDateTime now = LocalDateTime.now();//LocalDateTime is a class & now() is a static method
		System.out.println(now);

		String time= DateTimeFormatter.ofPattern("HHmmss_ddMMyyyy").format(now);//if used small hh it is
		// showing 12 hr time and if used HH so it is showing 24 hrs format
		
		
		return time;
	}

		public static int generateRandomNum() 
		{
		double random = Math.random() * 100;//1 se 100 k bich me number dega
		
		
		int ranNum = (int) random;
         
		return ranNum;
		}
		
		
		  public static void main(String[] args) 
		  {
		 
		 int Number= JavaUtility.generateRandomNum(); 
		 System.out.println(Number); 
		 String time = JavaUtility.currentTime();
		 System.out.println(time);
		 
		 
		 }
		 
}