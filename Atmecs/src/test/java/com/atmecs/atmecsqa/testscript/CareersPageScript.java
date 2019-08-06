package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.testbase.Base;

public class CareersPageScript extends Base {
	@Test
	public void careersPageScript() throws IOException {
		CareersPage careersPage = new CareersPage();
		careersPage.getCareersPage();
		careersPage.hyderabadCareerHomePage();
		careersPage.bangaloreCareerHomePage();
		careersPage.chennaiCareerHomePage();
	}
}