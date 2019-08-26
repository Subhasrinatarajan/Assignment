package com.atmecs.toolsqademoshop.testscript;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.operation.AddToCart;
import com.atmecs.toolsqademoshop.operation.ClickOperation;
import com.atmecs.toolsqademoshop.pages.GetProduct;
import com.atmecs.toolsqademoshop.report.LogReportInformation;
import com.atmecs.toolsqademoshop.testbase.TestBase;

import com.atmecs.toolsqademoshop.utils.ConfigReader;

import com.atmecs.toolsqademoshop.utils.PageValidation;

public class PurchasedProductGrandTotalValidationAfterRemovalOneProduct extends TestBase {

	static Properties properties;
	static boolean grandtotalvalidation = true;
	static double sumofproducts;

	LogReportInformation log = new LogReportInformation();
	
	@Test
	public void purchasedProdGrandTotalValidationAfterRemovalOneProduct() throws IOException, InterruptedException{
		
		
		log.info("Adding first product to a cart....");
		
		GetProduct.searchFirstproduct();
		
		AddToCart.addtocart();

		
		log.info("Adding second product to a cart...."); 
		
		GetProduct.searchSecondproduct();
		
		AddToCart.addtocart();

		log.info("Validate Two Product GrantTotal...");
		
		ClickOperation.pg_click_opr(driver, viewCart);

		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);

		String firstprodpath = ConfigReader.getData("loc.span.firstproductvalue");
		String firstprod = driver.findElement(By.xpath(firstprodpath)).getText();
		double blackdressprice = Double.valueOf(firstprod.substring(1, 5));

		String secondprodpath = ConfigReader.getData("loc.span.secondproductvalue");
		String secondprod = driver.findElement(By.xpath(secondprodpath)).getText();
		double greydressprice = Double.valueOf(secondprod.substring(1, 5));
		
		
		String grandtotalpath = ConfigReader.getData("loc.span.granttotalvalue");
		String grandtotal = driver.findElement(By.xpath(grandtotalpath)).getText();
		double grandtotalprice = Double.valueOf(grandtotal.substring(1, 5));

		if (grandtotalvalidation == true) {
			sumofproducts = blackdressprice + greydressprice;
			PageValidation.price_validation(grandtotalprice, sumofproducts, "Grandtotal validation...");
		} else {
			System.out.println("GrandTotal validation Failed....");
		}

		
		log.info("Validate GrandTotal After removing One Product from cart....");
		
		
		String removegreydressProduct=ConfigReader.getData("loc.link.productremoval");
		ClickOperation.pg_click_opr(driver, removegreydressProduct);
		
		String afterProductremovalgrandtotal = driver.findElement(By.xpath(grandtotalpath)).getText();
		double afterProductremovalgrandtotalprice = Double.valueOf(afterProductremovalgrandtotal.substring(1, 5));
		
		
		
		if(afterProductremovalgrandtotalprice==blackdressprice)
		{
			PageValidation.price_validation(afterProductremovalgrandtotalprice, blackdressprice, "Grandtotal validation After Removed One product from cart...");
		}else
		{
			log.info("After Product Removal GrandTotal Validation Failed...");
		}
		
	}
}