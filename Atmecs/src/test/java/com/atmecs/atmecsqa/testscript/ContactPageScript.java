package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import com.atmecs.atmecsqa.pages.ContactUsPage;

public class ContactPageScript {
	public void contactPageScript() throws IOException {
		// ContactUsPage
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.getContactUsPage();
		contactUsPage.validateContactUsPortal();
	}
}