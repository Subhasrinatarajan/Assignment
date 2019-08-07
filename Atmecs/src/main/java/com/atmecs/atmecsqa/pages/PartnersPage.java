package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.Utils;

public class PartnersPage extends Base {

	public static void partnersScript(WebDriver driver, final String xpath) {
		// Partners
		Utils.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}
}