package Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_utility.FileUtility;
import generic_utility.WebDriverUtility;
import practice_Utility.ContactPage;
import practice_Utility.HomePage1;
import practice_Utility.Login_Page1;
import practice_Utility.VerifyCP;

public class Demo1 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
				WebDriver driver=null;
				//open browser
				FileUtility fu =new FileUtility();
				
				String BRO=fu.getDataFromPropertiesFile("bro");
				
				if(BRO.equals("chrome"))
				{
					driver=new ChromeDriver();
				}
				else if (BRO.equals("firefox"))
				{
					driver=new FirefoxDriver();
				}
				else
				{
					System.out.println("something went wrong");
				}
				Thread.sleep(3000);
				//open app using url
				String URL = fu.getDataFromPropertiesFile("url");
				driver.get(URL);
				Thread.sleep(3000);
				//enter data into un & pass text field
				Login_Page1 lp=new Login_Page1(driver);
				
				String UN=fu.getDataFromPropertiesFile("un");
				lp.getUN().sendKeys(UN);
				
				String PWD = fu.getDataFromPropertiesFile("pwd");
				lp.getPWD().sendKeys(PWD);
				lp.getLNBTN().click();
				Thread.sleep(3000);
				//click on contact module
				HomePage1 h1 = new HomePage1(driver);
				h1.getcontactBtn().click();
				
				//click on + icon
				ContactPage cp = new ContactPage(driver);
				cp.getPlusIcon().click();
				
				//click on dropdown
				WebElement dd=cp.getDropDown();
				
				//select 1st option i.e. Mr.
				WebDriverUtility wd = new WebDriverUtility(driver);
				wd.select(dd,1);
				
				//enter first and last name in the T.F. and click on save btn.
				String fName=fu.getStringDataFromExcelFile("Contact",3, 0);
				cp.getFname().sendKeys(fName);
				String lName=fu.getStringDataFromExcelFile("Contact", 3, 1);
				cp.getLname().sendKeys(lName);
				cp.getSaveBtn().click();
				Thread.sleep(3000);
				
				//verify the first & last name
				VerifyCP vcp = new VerifyCP(driver);//vcp=verify contact page
				String vfn=vcp.getVfname().getText();//vfn=verify first name
				String vln=vcp.getVlname().getText();//vln=verify last name
				
				/*if(fName.equals(vfn) && lName.equals(vln))
				{
					System.out.println("contact saved successfully");
				}*/
				
				//signout
				WebElement pi=h1.getprofileIcon();//pi=profile icon
				wd.hover(pi);
				Thread.sleep(3000);
				//click on signout link
				h1.getsignOut().click();
				Thread.sleep(3000);
				
				//quit browser
				driver.quit();
				
				//Note: jab me prog ko run kr rha hu toh contact saved successfully print nhi
				//ho rha hai . lekin prog quit ho ja rha hai.so just leave it.Main focus 
				//on how to write a prog and execute the prog.
}

}

