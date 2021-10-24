package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import com.Pages.BaseClass;

public class ExcelUtils extends BaseClass {

	FileInputStream fis = null;
	Workbook wb = null;
	Sheet sh = null;
	Cell c = null;

	public String getCellData(String filePath, String name, int row, int colm) {
		DataFormatter df = new DataFormatter();
		try {
			
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		sh = wb.getSheet(name);
		c = sh.getRow(row).getCell(colm);
		
		return df.formatCellValue(c);

	}

	@Test 
	public void Test_1() {
		
		
		String jxlpath=System.getProperty("user.dir")+"/src/test/resources/Test.xls";
		String poipath=System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";
		System.out.println(getCellData(jxlpath, "login", 0, 0));
		System.out.println(getCellData(poipath, "login", 0, 0));
	}
	
}

