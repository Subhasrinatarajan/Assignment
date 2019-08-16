package com.atmecs.toolsqademoshop.operation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.Utils;

public class ClickOperation extends TestBase {

	public static void pg_click_opr(WebDriver driver, final String xpath) {
		
		Utils.click_operation(driver, xpath);
	}
}

