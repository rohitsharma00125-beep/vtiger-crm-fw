package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetMultipleDatafromExcelFile 
{

	public static void main(String[] args) throws IOException 
	{
	FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");

	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Class1");
	
	for (int i = 1; i <=sh.getLastRowNum(); i++) 
	{
		
		for (int j = 0; j <sh.getRow(i).getLastCellNum(); j++) //gLCN method 1 se start hota hai
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);	
		}
		//String value1 = sh.getRow(i).getCell(1).getStringCellValue();
		//System.out.println(value1);
		
	}
	wb.close();
    fis.close();

	
	
	
	}

}
