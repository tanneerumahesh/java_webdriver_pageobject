package com.java_webdriver_pageobject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkPage {
	
	public WorkPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="h1")
	public WebElement headerText;
	
	public String GetHeaderText(){
		
		return headerText.getText();
	}

	
}
