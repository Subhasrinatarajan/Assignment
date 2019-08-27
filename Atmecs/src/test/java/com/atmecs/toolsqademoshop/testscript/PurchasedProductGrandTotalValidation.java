package com.atmecs.toolsqademoshop.testscript;



import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.toolsqademoshop.helper.AddToCart;
import com.atmecs.toolsqademoshop.helper.ClickOperation;
import com.atmecs.toolsqademoshop.helper.CommonUtils;
import com.atmecs.toolsqademoshop.report.LogReportInformation;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.validation.WebsiteValidation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class PurchasedProductGrandTotalValidation extends TestBase {
	
     static LogReportInformation log=new LogReportInformation();
     /**
      * Validating home page and added products are available on cart and then validate the grand total after removing one product from a cart.
      */
     public static ExtentTest extentTest;
     
	@Test
	public void purchaseblack_tshirt() throws IOException {		
	    
		
		log.info("Adding first product to a cart...."); 
		
		ClickOperation.pg_click_opr(driver, purchaseblack_tshirt);
		
		AddToCart.addtocart();
		
		
		log.info("Return to Shop Homepage...");
		
		CommonUtils.backToHome();
		
		log.info("Adding second product to a cart...."); 
		
		ClickOperation.pg_click_opr(driver, purchasecropped_tshirt);
		
		AddToCart.addtocart();
		
		log.info("Validate Two Product GrantTotal...");
		
		ClickOperation.pg_click_opr(driver, viewCart);
		
		WebsiteValidation.grandtotalValidation();
		extentTest.log(LogStatus.PASS,"TEST CASE PASSED IS");
		
			
	}
	
}

