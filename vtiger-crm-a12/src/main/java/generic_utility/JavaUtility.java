package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility 
{
	public static String currentTime() 
	{
		LocalDateTime now = LocalDateTime.now();//LocalDateTime is a class & now() is a static method
		System.out.println(now);

		return DateTimeFormatter.ofPattern("HHmmss_ddMMyyyy").format(now);
	}

		public static int generateRandomNum() 
		{
		double random = Math.random() * 100;
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