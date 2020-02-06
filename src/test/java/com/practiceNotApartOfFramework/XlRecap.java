package com.practiceNotApartOfFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XlRecap {

	@Test

	public void read() throws Exception {
		String filePath = System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\practiceNotApartOfFramework\\MyData.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		Workbook wbook = new XSSFWorkbook(fis);
		Sheet xlsheet = wbook.getSheet("Login");
		String value = xlsheet.getRow(2).getCell(1).toString();
		System.out.println(value);

		// how to find the number of rows
		int rows = xlsheet.getPhysicalNumberOfRows();
		System.out.println(rows);

		// how to find the number of columns
		int cols = xlsheet.getRow(0).getLastCellNum();
		System.out.println(cols);

		// read entire data one by one (if we start from i=0 we will also get the
		// headers,
		// if i=1 , we will not get the 1st row(headers)

//		for (int i = 0; i < rows; i++) {
//			for (int y = 0; y < cols; y++) {
//				String values = xlsheet.getRow(i).getCell(y).toString();
//				System.out.println(values);
//
//			}
//		}

		// how to retrieve the data from excel, then store inside the 2D Array

		// First we need to create an 2D array Object

		Object[][] data = new Object[rows - 1][cols];

		for (int i = 1; i < rows; i++) { // looping from 2nd row of excel
			for (int y = 0; y < cols; y++) { // looping from 1st column of excel
				String values = xlsheet.getRow(i).getCell(y).toString(); // retrieving value from excel by specified row
																			// and column
				System.out.println(values);
				data[i - 1][y] = values;// storing data into 2D array
			}
		}

		wbook.close();
		fis.close();
		
		System.out.println("**** Values from 2D array***************");
		for (Object[] rowArray : data) {
			for (Object d : rowArray) {
				System.out.println(d);

			}

		}
	}
}
