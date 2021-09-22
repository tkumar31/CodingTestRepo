package com.myframework.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myframework.pom.base.BasePage;

public class Page_Confirmation extends BasePage {
	
	
	public WebDriver driver = null;
	
	@FindBy(xpath="//td[text()='Id']//following-sibling::td")
	private WebElement confrimationID;
	
	
	public Page_Confirmation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getBookingID()
	{
	   String bookingID = getText(confrimationID);
	   return bookingID;
	}
	
	

}
