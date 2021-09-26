package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader1 {

	public static Properties prop;
	
	/**
	 * This method will read the properties file
	 * @throws IOException 
	 * 
	 */
	public static void readProperties(String filepath) throws IOException {
		FileInputStream str =new FileInputStream(filepath);
		prop = new Properties();
		prop.load(str);
		str.close();
	}
	
	/**
	 * THIS METHOD WILL RETURN THE VALUE FOR A SPECIFIC KEY
	 */
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	
}
