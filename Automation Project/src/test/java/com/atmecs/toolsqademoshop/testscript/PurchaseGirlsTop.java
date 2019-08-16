package com.atmecs.toolsqademoshop.testscript;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.datadriven.ExpectedDataSet;
import com.atmecs.toolsqademoshop.operation.AddToCart;
import com.atmecs.toolsqademoshop.operation.ClickOperation;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class PurchaseGirlsTop extends TestBase {
	static Properties properties;

	@Test(priority = 1)
	public static void purchasepinktop() throws IOException {
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		ExpectedDataSet.getdata();
		String purchasepinktop = ConfigReader.getData("loc.link.purchasepinktop");
		ClickOperation.pg_click_opr(driver, purchasepinktop);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}

	@Test(priority = 2)
	public static void purchasecropped_tshirt() throws IOException {
		openBrowser();
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		String purchasecropped_tshirt = ConfigReader.getData("loc.link.puchasecropped_tshirt");
		ClickOperation.pg_click_opr(driver, purchasecropped_tshirt);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}

	@Test(priority = 3)
	public static void purchaseblack_tshirt() throws IOException {
		openBrowser();
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		String purchaseblack_tshirt = ConfigReader.getData("loc.link.purchaseblack_tshirt");
		ClickOperation.pg_click_opr(driver, purchaseblack_tshirt);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}

	@Test(priority = 4)
	public static void purchasetokyo_talkies() throws IOException {
		openBrowser();
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		String purchasetokyo_talkies = ConfigReader.getData("loc.link.purchase_tokyo_talkies");
		ClickOperation.pg_click_opr(driver, purchasetokyo_talkies);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}
	

	@Test(priority = 5)
	public static void purchaseblackcrossdress() throws IOException {
		openBrowser();
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		String purchaseblackcrossdress = ConfigReader.getData("loc.link.purchase_blackcrossdress");
		ClickOperation.pg_click_opr(driver, purchaseblackcrossdress);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}

	@Test(priority = 6)
	public static void purchaseredsatindress() throws IOException {
		openBrowser();
		properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		String purchaseredsatindress = ConfigReader.getData("loc.link.purchase_redsatindress");
		ClickOperation.pg_click_opr(driver, purchaseredsatindress);
		/**
		 * @Purchase addtocard
		 */
		AddToCart.addtocart();
	}
}

