package com.java_webdriver_pageobject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".news-post__listing-header h2")
	public WebElement latestNews;
	
	@FindBy(css="[data-icon='hamburger2']") 
	public WebElement mainNavigation;
	
	@FindBy(css="[href='/about/']") 
	public WebElement aboutLink;
	
	@FindBy(css="[href='/cases/']") 
	public WebElement workLink;
	
	@FindBy(css="[href='/services/']") 
	public WebElement servicesLink;
	
	@FindBy(css="data-icon='earth-contact'") 
	public WebElement contact;
	
	
	public void ClickOnMainMenu(){
		mainNavigation.click();
	}
	
	public String GetLatestNewsText(){
		return latestNews.getText();
	}
	
	
}
