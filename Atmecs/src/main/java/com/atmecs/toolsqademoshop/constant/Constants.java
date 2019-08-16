package com.atmecs.toolsqademoshop.constant;

import java.io.File;

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class Constants extends TestBase {
	public final static String USERS_HOME = System.getProperty("user.dir") + File.separator;
	public final static String PROJECT_BASE_PATH = System.getProperty("user.dir");
	public final static long PAGE_LODE_TIMEOUT = 20;
	public final static long IMPLICIT_WAIT = 10;

	public final static String EXPECTEDTITLE_HOME = USERS_HOME + "resources"+ File.separator;
	public final static String EXPECTEDTITLE_FILE = EXPECTEDTITLE_HOME + "expectedTile.properties";

	public final static String CHROMEBROWSER_HOME = USERS_HOME + "lib" + File.separator;
	public final static String CHROMEBROWSERDRIVER_FILE = CHROMEBROWSER_HOME + "chromedriver.exe";

	public final static String CONFIG_HOME = USERS_HOME + "Resources" + File.separator;
	public final static String CONFIG_FILE = CONFIG_HOME + "config.properties";

	// public final static String LOG4J_HOME = USER_HOME + "Resources" +
	// File.separator + "log4j" + File.separator;
	// public final static String LOG4J_FILE = LOG4J_HOME + "log4j.properties";

	public final static String FIREFOXBROWSER_HOME = USERS_HOME + "lib" + File.separator;
	public final static String FIREFOXBROWSERDRIVER_FILE = FIREFOXBROWSER_HOME + "geckodriver.exe";

	public final static String IEBROWSER_HOME = USERS_HOME + "lib" + File.separator;
	public final static String IEBROWSERDRIVER_FILE = IEBROWSER_HOME + "IEDriverServer.exe";

	public final static String ABOUTUSPAGE_HOME = USERS_HOME + "resources" + File.separator+"locators"+File.separator;
	public final static String ABOUTUSPAGEWEBELEMENT_FILE = ABOUTUSPAGE_HOME + "aboutUsPageWebElement.properties";
	
	public final static String ACCOUNT_HOME = USERS_HOME + "resources" + File.separator+"locators"+File.separator;
	public final static String ACCOUNT_FILE = ACCOUNT_HOME + "shopaccount.properties";
	
	public final static String SHOPHOMEPAGE_HOME = USERS_HOME + "resources" + File.separator+"locators"+File.separator;
	public final static String SHOPHOMEPAGE_FILE = SHOPHOMEPAGE_HOME + "shophomepage.properties";
	
	public final static String PURCHASE_HOME = USERS_HOME + "resources" + File.separator+"locators"+File.separator;
	public final static String PURCHASE_FILE = PURCHASE_HOME + "purchase.properties";
	
	public final static String VALIDATEPATH_HOME = USERS_HOME + "resources" + File.separator+"locators"+File.separator;
	public final static String VALIDATEPATH_FILE = VALIDATEPATH_HOME + "validatepath.properties";
}
