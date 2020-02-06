package com.practiceNotApartOfFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileReading {
	/*
	 * we will be reading (input-loading data from a file) we have to have a file
	 * then we need to specify the file path we have to pass our file path to
	 * FileInputStream then it will give exception(try and catch) (Until this step
	 * everything is same for any kind of files, after that different classes will
	 * be used for excel, txt, properties file etc.) depending on the file , we need
	 * to use different libraries for properties file is a java file so, we will use
	 * Properties class then we will load the fis data(Stream will be open and data
	 * will flow) another exception (IO Exception) will occur(outside of java world
	 * , when we input the data, if the stream closed or flow etc.
	 * 
	 * 
	 */

	Properties prop;

	@Test
	public void read() {
		String filePath = System.getProperty("user.dir")
				+ "/src/test/java/com/practiceNotApartOfFramework/Example.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);

			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = prop.getProperty("company");
		System.out.println(value);
		// OR

		String[] value1 = { "company", "city", "suite", "employeeName", "lastname", "empId" };
		for (int i = 0; i < value1.length; i++) {
			System.out.println(prop.getProperty(value1[i]));
		}

	}
}
