package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass33;
import generic_utility.FileUtility;
import practice_Utility.ContactPage2;
import practice_Utility.HomePage2;
import practice_Utility.VerifyCP2;

@Listeners(listener_utility.List_Imp.class)

public class Final extends BaseClass33
{
	@Test
	
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		HomePage2 h2 =new HomePage2(driver);
		h2.getcontactLink().click();
		
		
		ContactPage2 cp2 =new ContactPage2(driver);
		cp2.getplusicon().click();
		
		
		FileUtility futil = new FileUtility();
		String fn = futil.getStringDataFromExcelFile("Contact", 6, 0);
		String ln = futil.getStringDataFromExcelFile("Contact", 6, 1);
		
		cp2.getfname().sendKeys(fn);
		cp2.getlname().sendKeys(ln);
		cp2.getsavebtn().click();
		Thread.sleep(30000);
		
		
		VerifyCP2 v2=new VerifyCP2(driver);
		String vfname=v2.getVfname2().getText();
		String vlname=v2.getVlname2().getText();
		
		
		
		
		Assert.assertEquals(fn, vfname);
		System.out.println("First Name Displayed");
		Assert.assertEquals(ln, vlname);
		System.out.println("Last Name Displayed");	
	}
	

}
