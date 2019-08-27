package com.atmecs.toolsqademoshop.validation;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.toolsqademoshop.report.LogReportInformation;
import com.atmecs.toolsqademoshop.testbase.TestBase;

public class WebsiteValidation extends TestBase{
	
	
	
	static LogReportInformation log=new LogReportInformation();

	public static void pg_validation(String actualTitle, String expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);

			System.out.println("Passed: " + message + " EXPECTED: " + expectedTitle + " ACTUAL: " + actualTitle);
		} catch (AssertionError assertionError) {
			
			System.out.println("Failed" + message + expectedTitle + actualTitle);
		}
	}
	
	
	public static void price_validation(Double actualTitle, Double expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);

			System.out.println("Passed: " + message + " EXPECTED: " + expectedTitle + " ACTUAL: " + actualTitle);
		} catch (AssertionError assertionError) {
			
			System.out.println("Failed" + message + expectedTitle + actualTitle);
		}
	}
	
	
	public static void grandtotalValidation()
	{
		String firstprod=driver.findElement(By.xpath(firstprodpath)).getText();
		double blackdressprice=Double.valueOf(firstprod.substring(1, 5));
		
		
		
		String secondprod=driver.findElement(By.xpath(secondprodpath)).getText();
		double greydressprice=Double.valueOf(secondprod.substring(1, 5));
		
		
		String grandtotal=driver.findElement(By.xpath(grandtotalpath)).getText();
		double grandtotalprice=Double.valueOf(grandtotal.substring(1, 5));
		
		if(grandtotalvalidation==true)
		{
			 sumofproducts=blackdressprice+greydressprice; 
			 price_validation(grandtotalprice, sumofproducts, "Grandtotal validation...");
			 log.info("GrandValidation Successfully Passed...");
		}else
		{
			log.info("GrandTotal validation Failed....");
		}
	}
	
	public static void grandtotalValidation_afterRemoveProduct()
	
	{
		String firstprod=driver.findElement(By.xpath(firstprodpath)).getText();
		double blackdressprice=Double.valueOf(firstprod.substring(1, 5));
		
		String afterProductremovalgrandtotal = driver.findElement(By.xpath(grandtotalpath)).getText();
		double afterProductremovalgrandtotalprice = Double.valueOf(afterProductremovalgrandtotal.substring(1, 5));
		
		if(afterProductremovalgrandtotalprice==blackdressprice)
		{
			price_validation(afterProductremovalgrandtotalprice, blackdressprice, "Grandtotal validation After Removed One product from cart...");
		}else
		{
			log.info("After Product Removal GrandTotal Validation Failed...");
		}
	}
}

     

