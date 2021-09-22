package com.myframework.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myframework.pom.base.BasePage;

public class Page_Welcome extends BasePage {
	public WebDriver driver;

	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement chooseDeptDD;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement chooseDestDD;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement findFlightBtn;
	
	

	
	public Page_Welcome(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//method to select the from and to drop down
	
	public Page_ReserveFlight findFlights(String departure, String destination)
	{
		
		selectValue_DD(chooseDeptDD, departure);
		selectValue_DD(chooseDestDD, destination);
		clickElement(findFlightBtn);
		Page_ReserveFlight obj_reserveFlight = new Page_ReserveFlight(driver);
		PageFactory.initElements(driver, obj_reserveFlight);
		return obj_reserveFlight;
	}

}
