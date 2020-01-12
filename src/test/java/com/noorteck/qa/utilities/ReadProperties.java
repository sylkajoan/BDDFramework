package com.noorteck.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		//Create a Properties  class object to access the property file.
		Properties prop = new Properties();
		//Create file input stream object for the properties file
		FileInputStream file;
		try {
			file= new FileInputStream("./src/test/resources/configs/EnvironmentData.properties");
			//Load properties file
			prop.load(file);
			
		System.out.println(prop.get("url"));
		System.out.println(prop.getProperty("browserType"));
		System.out.println(prop.get("chromeName"));
			
		}catch (Exception e) {
			System.out.println("Exception Occured: " + e);
			e.printStackTrace();
		}
	}
	public static Properties getProperties (String filePath) {
		// Create a Properties class object to access the property file.
		Properties prop = new Properties();
		// Create file input stream object for the properties file
		FileInputStream file;
		try {
			file = new FileInputStream(filePath);
			// Load properties file
			prop.load(file);

		} catch (Exception e) {
			System.out.println("Exception Occured: " + e);
			e.printStackTrace();
		}
		return prop;	
	}
}	
		
		
		












//		// Create a Properties class object to access the property file.
//		Properties prop = new Properties();
//
//		// create file input stream object for the properties file
//		FileInputStream file = new FileInputStream("./src/test/resources/configs/EnvironmentData.properties");
//
//		// Load properties file
//		prop.load(file);
//		// Get the values using 'get("key")' method or
//		// ("key") method by passing key as the parameter
//		System.out.println(prop.get("url"));
//		System.out.println(prop.getProperty("browserType"));
//		System.out.println(prop.get("chromeName"));

