package com.atmecs.toolsqademoshop.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.testbase.TestBase;

public class PropertyFileProvider extends TestBase 
{
	public static  class PropertyReader {
		private static PropertyReader propReader;
		private Properties prop;

		//loads all files
		private PropertyReader() {
		List<String> propsFiles = Arrays.asList(Constants.PURCHASE_FILE,Constants.ACCOUNT_FILE);
		prop = new Properties();

		for (String filePath : propsFiles) {
		try {
		prop.load(new FileInputStream(new File(filePath)));
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		}
		 public static PropertyReader getInstance()
		 { 
		 if(propReader == null)
		 {
		propReader = new PropertyReader();
		 }
		 return propReader;
		 }
		public String getValue(String key) {
		return prop.getProperty(key);
		}
		/*String secondprod=driver.findElement(By.xpath(secondprodpath)).getText();*/
	
		public static void main(String[] args) {
		String s=propReader.getValue("clickTogglePass");
		System.out.println(s);
		}
}
}