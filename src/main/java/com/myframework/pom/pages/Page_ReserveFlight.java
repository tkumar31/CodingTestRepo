package com.myframework.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myframework.pom.base.BasePage;

public class Page_ReserveFlight extends BasePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[1]")
	private WebElement chooseFlightbtn;
	
	public Page_ReserveFlight(WebDriver driver) {
		
		this.driver = driver;

	}



	
	public Page_Purchase chooseFlight()
	{
		clickElement(chooseFlightbtn);
		Page_Purchase obj_Purchase = new Page_Purchase(driver);
		PageFactory.initElements(driver, obj_Purchase);
		return obj_Purchase;

	}
}
