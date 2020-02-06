package com.practiceNotApartOfFramework;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLWriting {

	@Test
	public void write() throws Exception {
		
		String filePath = System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\practiceNotApartOfFramework\\MyData.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wbook=new XSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Test");
		//if cell is there, create a cell
		sheet.getRow(0).createCell(2).setCellValue("Language");
		//if cell is there, grab and update
		sheet.getRow(0).getCell(2).setCellValue("Instructor");
		//if row is not there, create one
		sheet.createRow(2).createCell(0).setCellValue("Syntax123");
		//when row is created, grab 
		sheet.getRow(2).createCell(2).setCellValue("TestNG");
		//bring object of FileOutputStream to write back into the excel file
		FileOutputStream fos=new FileOutputStream(filePath);
		wbook.write(fos);
		
		fos.close();
		wbook.close();
		fis.close();
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
