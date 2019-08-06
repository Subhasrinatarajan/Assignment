package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.pages.HomePage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class HomePageScript {
	public void homePageScript() throws IOException {
		// HomePage
		HomePage homePage = new HomePage();
		homePage.getHomePage();
		homePage.toCheckHomePageWedElements();
	}
}
