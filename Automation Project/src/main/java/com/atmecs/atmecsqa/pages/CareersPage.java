package com.atmecs.atmecsqa.pages;



import org.openqa.selenium.WebDriver;


import com.atmecs.atmecsqa.testbase.Base;

import com.atmecs.atmecsqa.utils.Utils;

public class CareersPage extends Base
{
	
	public static void careersPage(WebDriver driver, final String xpath)
	{
		Utils.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}
}