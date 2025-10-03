package ddt_extra;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream	fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Class1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		
		
		System.out.println(value);
		wb.close();
		

	}

}
