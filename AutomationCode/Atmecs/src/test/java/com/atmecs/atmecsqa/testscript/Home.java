package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.pages.BackToHomePage;
import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.pages.HomePage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Utils;

public class Home extends Base {
	Properties properties;

	@Test(priority=1)
	public void getHomePage() throws IOException {
		properties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		String homePage = ConfigReader.getData("homePage");

		openBrowser();
		HomePage.homePageScript(driver, homePage);
	}

	@Test(priority=2)
	public void toCheckHomePageWedElements() throws IOException {
		String exploreNow = ConfigReader.getData("exploreNow");
		HomePage.homePageScript(driver, exploreNow);
		BackToHomePage.backToHome();

		String artificialHomePage =ConfigReader.getData("artificialHomePage");
		HomePage.homePageScript(driver, artificialHomePage);
		BackToHomePage.backToHome();

		String augumentedHomePage =ConfigReader.getData("augumentedHomePage");
		HomePage.homePageScript(driver, augumentedHomePage);
		BackToHomePage.backToHome();

		String internetHomePage =ConfigReader.getData("internetHomePage");
		HomePage.homePageScript(driver, internetHomePage);
		BackToHomePage.backToHome();

		String roboticHomePage =ConfigReader.getData("roboticHomePage");
		HomePage.homePageScript(driver, roboticHomePage);
		BackToHomePage.backToHome();

		String blockChainHomePage =ConfigReader.getData("blockChainHomePage");
		HomePage.homePageScript(driver, blockChainHomePage);
		BackToHomePage.backToHome();

	}
}
