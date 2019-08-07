package com.atmecs.atmecsqa.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class HyderabadCareersList extends Base
{
	Properties hyderabadCareersProperties;
	@Test
    public void get() throws IOException
    
    {
		Base.openBrowser();
		CareersPage careersPage=new CareersPage();
		careersPage.hyderabadCareerHomePage();
    	hyderabadCareersProperties = ConfigReader.loadProperty(Constants.HYDERABADCAREERLISTWEBELEMENT_FILE);
		String hyderabadCareersList = hyderabadCareersProperties.getProperty("hyderabadCareersList");
    	List<WebElement> hyderabadCareersLink= driver.findElements(By.xpath(hyderabadCareersList));
    	
    	for (int i = 1; i < hyderabadCareersLink.size(); i++) 
    	{
    		Utils.ignoreClickInterceptAndClickOnElement(driver,hyderabadCareersList);
    		BackToHomePage.backToHome();
		}
    	

    	
    }
}
