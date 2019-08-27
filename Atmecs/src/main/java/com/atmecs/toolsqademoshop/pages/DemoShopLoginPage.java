package com.atmecs.toolsqademoshop.pages;

import java.io.IOException;

import com.atmecs.toolsqademoshop.constants.GetDataSet;
import com.atmecs.toolsqademoshop.helper.ClickOperation;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class DemoShopLoginPage extends TestBase
{
  public static void demoShopLogin() throws IOException
  {
	  String shopaccount_hmpg = ConfigReader.getData("loc.link.my_account");
		ClickOperation.pg_click_opr(driver, shopaccount_hmpg);
		String username = ConfigReader.getData("loc.txt.username");
		GetDataSet.getDataSet(driver, username, ConfigReader.getData("value.username"));
		String psw = ConfigReader.getData("loc.txt.psw.id");
		GetDataSet.getDataSet(driver, psw, ConfigReader.getData("value.psw"));
		String login = ConfigReader.getData("loc.btn.login");
		ClickOperation.pg_click_opr(driver, login);
  }
}
