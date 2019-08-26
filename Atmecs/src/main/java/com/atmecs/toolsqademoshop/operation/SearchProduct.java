package com.atmecs.toolsqademoshop.operation;

import java.io.IOException;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class SearchProduct extends TestBase {

	
	public static void searchProducts() throws InterruptedException, IOException {

		String searchFunction = ConfigReader.getData("loc.icon.searchfunction");
		ClickOperation.click_operation(driver, searchFunction);
	}

}