package com.atmecs.toolsqademoshop.pages;

import java.io.IOException;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.constants.GetDataSet;
import com.atmecs.toolsqademoshop.helper.EnterOperation;
import com.atmecs.toolsqademoshop.helper.SearchProduct;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;
import com.atmecs.toolsqademoshop.utils.ExcelDataReader;

public class GetProduct extends TestBase
{
    
    public static void searchFirstproduct() throws IOException, InterruptedException
    {
    	ExcelDataReader config = new ExcelDataReader(Constants.KEYVALUE_FILE);
    	
    	 properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
    	 
    	 SearchProduct.searchProducts();
     
    	String firstProduct = config.getKeyValue(0, 0, 1);
		String searchbox = ConfigReader.getData("loc.input.searchbox");
		GetDataSet.getDataSet(driver, searchbox, firstProduct);
		EnterOperation.pressEnter();
	}
	
	
	public static void searchSecondproduct() throws IOException, InterruptedException
    {
    	ExcelDataReader config = new ExcelDataReader(Constants.KEYVALUE_FILE);
    	
    	 properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
         
    	 SearchProduct.searchProducts();
    	 
 		String secondProduct = config.getKeyValue(0, 1, 1);
		String searchbox = ConfigReader.getData("loc.input.searchbox");
		GetDataSet.getDataSet(driver, searchbox, secondProduct);
		EnterOperation.pressEnter();
	}
	
}
