package com.half.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
//to get data from the any file loaded
	//for ex. when we need to read 2 different file 
	//Properties cred=readProperties(credentials.properties)
	//Properties configs=readProperties(configurations.properties)
	private static Properties prop;

	public static Properties readProperties(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}
	
//if we have multiple configuration file , when we need to get sth specific key value from that specific file
	public static String getProperty(String key) {
		return prop.getProperty(key);

	}

}
