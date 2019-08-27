package com.atmecs.toolsqademoshop.testscript;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.helper.AddToCart;
import com.atmecs.toolsqademoshop.helper.ClickOperation;
import com.atmecs.toolsqademoshop.pages.GetProduct;
import com.atmecs.toolsqademoshop.report.LogReportInformation;
import com.atmecs.toolsqademoshop.testbase.TestBase;

import com.atmecs.toolsqademoshop.utils.ConfigReader;

import com.atmecs.toolsqademoshop.validation.WebsiteValidation;

public class PurchasedProductGrandTotalValidationAfterRemovalOneProduct extends TestBase {

	static Properties properties;
	static boolean grandtotalvalidation = true;
	static double sumofproducts;

	LogReportInformation log = new LogReportInformation();
	
	
	/**
	 * Validating home page and added products are available on cart and verify the grand total.
	 */
	
	@Test
	public void purchasedProdGrandTotalValidationAfterRemovalOneProduct() throws IOException, InterruptedException{
		
		
		log.info("Searching the first product and added to a cart....");
		
		GetProduct.searchFirstproduct();
		
		AddToCart.addtocart();

		log.info("Searching the second product and added to a cart...."); 
		
		GetProduct.searchSecondproduct();
		
		AddToCart.addtocart();
		
		log.info("View cart");
		
		ClickOperation.pg_click_opr(driver, viewCart);

		log.info("Validate Two Product GrandTotal...");
		
		WebsiteValidation.grandtotalValidation();
		
		log.info("Validate GrandTotal After removing One Product from cart....");
		
		ClickOperation.pg_click_opr(driver, removegreydressProduct);
		
		WebsiteValidation.grandtotalValidation_afterRemoveProduct();

		
	}
}