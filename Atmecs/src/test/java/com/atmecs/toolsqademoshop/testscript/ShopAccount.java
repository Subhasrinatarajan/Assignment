package com.atmecs.toolsqademoshop.testscript;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.datadriven.ExpectedDataSet;
import com.atmecs.toolsqademoshop.operation.Scrolling;
import com.atmecs.toolsqademoshop.pages.DemoShopLoginPage;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;
import com.atmecs.toolsqademoshop.utils.PageActionGetText;
import com.atmecs.toolsqademoshop.utils.PageValidation;

public class ShopAccount extends TestBase {
	Properties properties;

	@Test
	public void getaccountprotal() throws IOException {
		ExpectedDataSet.getdata();
		properties = ConfigReader.loadProperty(Constants.ACCOUNT_FILE);
		/**
		 * @ShopHomePage validation
		 */
		String shophmpg_validate = ConfigReader.getData("loc.txt.tools_qa_demoshop_homepage");
		PageActionGetText.get_text(driver, shophmpg_validate);
		PageValidation.pg_validation(PageActionGetText.text, ExpectedDataSet.getShop_hmpg(), "Home page Validation");
		/**
		 * @ShopPage scrolling operation
		 */
		Scrolling.scrolling_opr();
		/**
		 * @Category loginPage
		 */
		DemoShopLoginPage.demoShopLogin();

	}
}
