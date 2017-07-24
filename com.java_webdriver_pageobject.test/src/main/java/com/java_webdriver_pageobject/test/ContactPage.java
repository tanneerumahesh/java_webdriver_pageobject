package com.java_webdriver_pageobject.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[data-icon='location']")
	public List<WebElement> locations;
	
	@FindBy(css="contactheader")
	public WebElement contactHeader;
	
	
}
