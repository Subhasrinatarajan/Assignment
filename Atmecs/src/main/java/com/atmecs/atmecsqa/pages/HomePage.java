package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

import com.atmecs.atmecsqa.utils.Utils;

public class HomePage extends Base {

	public static void homePageScript(WebDriver driver, final String xpath) {
		// HomePage
		Utils.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}
}
