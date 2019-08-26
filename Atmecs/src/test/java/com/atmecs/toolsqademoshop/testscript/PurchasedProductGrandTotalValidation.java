package com.atmecs.toolsqademoshop.testscript;



import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.operation.AddToCart;
import com.atmecs.toolsqademoshop.operation.ClickOperation;
import com.atmecs.toolsqademoshop.report.LogReportInformation;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.CommonUtils;
import com.atmecs.toolsqademoshop.utils.ConfigReader;
import com.atmecs.toolsqademoshop.utils.PageValidation;


public class PurchasedProductGrandTotalValidation extends TestBase {
	static Properties properties;
	static boolean grandtotalvalidation=true;
	static double sumofproducts;

     static LogReportInformation log=new LogReportInformation();
	
	@Test
	public static void purchaseblack_tshirt() throws IOException {
		
	    
		log.info("Adding first product to a cart...."); 
		
		
		ClickOperation.pg_click_opr(driver, purchaseblack_tshirt);
		
		AddToCart.addtocart();
		
	
		
		CommonUtils.backToHome();
		
		log.info("Adding second product to a cart...."); 
		
		ClickOperation.pg_click_opr(driver, purchasecropped_tshirt);
		
		AddToCart.addtocart();
		
		log.info("Validate Two Product GrantTotal...");
		
		
		ClickOperation.pg_click_opr(driver, viewCart);
		
		
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE); 
		
		
		
		String firstprodpath = ConfigReader.getData("loc.span.firstproductvalue");
		String firstprod=driver.findElement(By.xpath(firstprodpath)).getText();
		double blackdressprice=Double.valueOf(firstprod.substring(1, 5));
		
		
		String secondprodpath = ConfigReader.getData("loc.span.secondproductvalue");
		String secondprod=driver.findElement(By.xpath(secondprodpath)).getText();
		double greydressprice=Double.valueOf(secondprod.substring(1, 5));
		
		if(grandtotalvalidation==true)
		{
			 sumofproducts=blackdressprice+greydressprice;
		}else
		{
			System.out.println("GrandTotal validation Failed....");
		}

		String grandtotalpath = ConfigReader.getData("loc.span.granttotalvalue");
		String grandtotal=driver.findElement(By.xpath(grandtotalpath)).getText();
		double grandtotalprice=Double.valueOf(grandtotal.substring(1, 5));
		
		
		
        PageValidation.price_validation(grandtotalprice, sumofproducts, "Grandtotal validation...");
		
	}
	
	

}

