package com.atmecs.atmecsqa.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.utils.Constants;

public class Helper
{
	public static String prop = null;
	public static Properties webElementProperties;
	public void readWebElementsPath()
    {
		final String propFile = System.getProperty("user.dir")
				+ "\\resources\\locators\\PartnerAndAboutUsWebElement.properties";
		File file = new File(propFile);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
}
