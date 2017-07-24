package com.java_webdriver_pageobject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	
	public ServicesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".page-header h1")
	public WebElement headerText;
	
	public String GetHeaderText(){
		
		return headerText.getText();
	}
	
}
