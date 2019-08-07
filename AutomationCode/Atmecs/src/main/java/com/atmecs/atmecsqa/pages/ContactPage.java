package com.atmecs.atmecsqa.pages;



import org.openqa.selenium.WebDriver;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.Utils;



public class ContactPage extends Base {

	public static void contactPage(WebDriver driver, final String xpath){
		// ContactUsPage
    	Utils.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}
}