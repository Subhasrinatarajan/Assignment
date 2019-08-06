package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.helper.BackToHomePage;
import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class CareersPageScript extends Base
{
	public void careersPageScript() throws IOException
	{
	CareersPage careersPage=new CareersPage();
	careersPage.getCareersPage();
	careersPage.hyderabadCareerHomePage();
	careersPage.bangaloreCareerHomePage();
	careersPage.chennaiCareerHomePage();
}
}