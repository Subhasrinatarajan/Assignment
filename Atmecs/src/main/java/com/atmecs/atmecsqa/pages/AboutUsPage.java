package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.Utils;

public class AboutUsPage extends Base {

	public static void aboutUsPage(WebDriver driver, final String xpath) {
		// AboutUsPage

		Utils.ignoreClickInterceptAndClickOnElement(driver, xpath);

	}
}