package com.atmecs.toolsqademoshop.datadriven;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

/**
 * @author Subhasri.Natarajan
 *
 */
public class ExpectedDataSet extends TestBase {
	public static Properties properties;
	public static String shop_hmpg;
	public static String pinkproduct;

	public static void getdata() {
		try {
			properties = ConfigReader.loadProperty(Constants.EXPECTEDTITLE_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		setShop_hmpg();
		setPinkproduct();
	}

	public static String getShop_hmpg() {
		return shop_hmpg;
	}

	public static void setShop_hmpg() {
		try {
			shop_hmpg = ConfigReader.getData("txt.toolsqademoshop_hmpg_tilte");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static String getPinkproduct() {
		return pinkproduct;
	}

	public static void setPinkproduct() {
		try {
			pinkproduct = ConfigReader.getData("txt.hmpg_submenu_service_title");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		ExpectedDataSet dataSet = new ExpectedDataSet();
		dataSet.getdata();

	}

}

