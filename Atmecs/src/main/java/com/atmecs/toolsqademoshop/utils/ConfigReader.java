package com.atmecs.toolsqademoshop.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import com.atmecs.toolsqademoshop.constant.Constants;
import java.io.FileReader;



public class ConfigReader extends Constants
{
	public static Properties properties;
	static FileReader reader;
	static File file;
	public static Properties loadProperty(String filePath) throws IOException 
	{
	properties = new Properties();
	file = new File(filePath);
	reader = new FileReader(file);
	properties.load(reader);
	return properties;
	}

	public static String getData(String by) throws IOException {

	String filedata = properties.getProperty(by);
	return filedata;
	}

	public static void configure(String logfilepathFile) {
		// TODO Auto-generated method stub
		
	}
	

	public static String setData(String by) throws IOException {
		String fileInput=driver.findElement(By.xpath(properties.getProperty(by))).getText();
		return fileInput;
	}


	
	
}