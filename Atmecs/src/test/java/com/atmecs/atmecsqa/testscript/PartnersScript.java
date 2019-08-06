package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.pages.PartnersPage;
import com.atmecs.atmecsqa.testbase.Base;

public class PartnersScript extends Base {
	
	public void partnersScript() throws IOException {
		// Partners
		PartnersPage partnersPage = new PartnersPage();
		partnersPage.gotopartners();
	}
}