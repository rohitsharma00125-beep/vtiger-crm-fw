package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass3;
import generic_utility.FileUtility;
import generic_utility.WebDriverUtility;
import practice_Utility.ContactPage;
import practice_Utility.HomePage1;
import practice_Utility.VerifyCP;

@Listeners(listener_utility.List_Imp.class)
class JustToProve00 extends BaseClass3 {
	@Test
	public void m1() throws EncryptedDocumentException, IOException, InterruptedException {

		// click on contact module
		HomePage1 h1 = new HomePage1(driver);
		h1.getcontactBtn().click();

		// click on + icon
		ContactPage cp = new ContactPage(driver);
		cp.getlpusIcon().click();

		// click on dropdown
		WebElement dd = cp.getDropDown();

		// select 1st option i.e. Mr.
		WebDriverUtility wd = new WebDriverUtility(driver);
		wd.select(dd, 1);

		// enter first and last name in the T.F. and click on save btn.
		FileUtility fu = new FileUtility();
		String fName = fu.getStringDataFromExcelFile("Contact", 3, 0);
		cp.getFname().sendKeys(fName);
		String lName = fu.getStringDataFromExcelFile("Contact", 3, 1);
		cp.getLname().sendKeys(lName);
		cp.getSaveBtn().click();
		Thread.sleep(3000);

		// verify the first & last name
		VerifyCP vcp = new VerifyCP(driver);// vcp=verify contact page
		String vfn = vcp.getVfname().getText();// vfn=verify first name
		String vln = vcp.getVlname().getText();// vln=verify last name
		/*
		 * if(fName.equals(vfn) && lName.equals(vln)) {
		 * System.out.println("contact saved successfully"); }
		 */

		//Here we used Hard assert for verifivcation.
		Assert.assertEquals(vfn, fName);
		System.out.println("successful first name");
		Assert.assertEquals(vln, lName);
		System.out.println("successful last name");

	}

	@Test
	public void genRep1() throws InterruptedException {
		Assert.assertTrue(false);
		Thread.sleep(2000);
		System.out.println("this is genRep1");
	}

	@Test
	public void genRep2() throws InterruptedException {
		Assert.assertTrue(true);
		Thread.sleep(2000);
		System.out.println("this is genRep2");
	}

	@Test(dependsOnMethods = "genRep1")
	public void genRep3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is genRep3");
		
	}

	@Test(dependsOnMethods = "genRep1", alwaysRun = true)
	public void genRep4() throws InterruptedException {
		System.out.println("this is genRep4");
		Thread.sleep(2000);
	}

	@Test(enabled = false) // skip by intentionally
	public void genRep5() throws InterruptedException {
		System.out.println("this is genRep5");
		Thread.sleep(2000);
	}

}