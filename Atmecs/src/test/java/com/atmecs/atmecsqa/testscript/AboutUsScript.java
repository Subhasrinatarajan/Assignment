package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import com.atmecs.atmecsqa.pages.AboutUsPage;
import com.atmecs.atmecsqa.testbase.Base;

public class AboutUsScript extends Base {
	public void aboutUsScript() throws IOException {
		// AboutUsPage
		AboutUsPage aboutUsPage = new AboutUsPage();
		aboutUsPage.gotopartners();
	}
}