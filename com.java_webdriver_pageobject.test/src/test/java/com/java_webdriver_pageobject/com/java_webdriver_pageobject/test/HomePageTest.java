package com.java_webdriver_pageobject.com.java_webdriver_pageobject.test;

import org.junit.Test;
import com.java_webdriver_pageobject.test.AboutPage;
import com.java_webdriver_pageobject.test.ContactPage;
import com.java_webdriver_pageobject.test.HomePage;
import com.java_webdriver_pageobject.test.ServicesPage;
import com.java_webdriver_pageobject.test.WorkPage;

import junit.framework.Assert;
import support.Base;


public class HomePageTest extends Base{

@Test 
public void ValtechTest() {
	//ScroolToElement(driver.findElement(By.cssSelector(".news-post__listing-header h2")));
	HomePage home = new HomePage(driver);
	Assert.assertEquals("LATEST NEWS", home.GetLatestNewsText());  
	home.ClickOnMainMenu();
	home.aboutLink.click();
	WaitFor(true);
	AboutPage about = new AboutPage(driver);
	Assert.assertEquals("About", about.GetHeaderText());
	home.aboutLink.click();
	home.workLink.click();
	WaitFor(true);
	WorkPage work = new WorkPage(driver);
	Assert.assertEquals("Work", work.GetHeaderText());
	home.aboutLink.click();
	home.servicesLink.click(); 
	WaitFor(true);
	ServicesPage services = new ServicesPage(driver);
	Assert.assertEquals("Services", services.GetHeaderText());
	home.contact.click();
	ContactPage contact = new ContactPage(driver);
	WaitFor(contact.contactHeader);
	System.out.println(contact.locations.size());
	
}

}