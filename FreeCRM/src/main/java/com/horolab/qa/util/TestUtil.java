package com.horolab.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 20;
	public static String TESTDATA_SHEET_PATH = "D:\\Nivedita\\FreeCRM\\src\\main\\java\\com\\horolab\\qa\\testdata\\HorolabTestData.xlsx";
	static XSSFWorkbook workbook;
	static Sheet sheet;
	static FileInputStream file;
	
	public static Object[][] getTestData(String sheetName){
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			workbook = new XSSFWorkbook(file);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		int index = workbook.getSheetIndex(sheetName); 
		sheet= workbook.getSheetAt(index);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i= 0; i<sheet.getLastRowNum();i++) {
			for(int j=0; j<sheet.getRow(i).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
}
