package com.myframework.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myframework.pom.base.BasePage;

public class Page_Purchase extends BasePage{

	
	public WebDriver driver;
	
	@FindBy(id="inputName")
	private WebElement firstName;
	
	@FindBy(id="address")
	private WebElement addressBox;
	
	@FindBy(id="city")
	private WebElement cityBox;
	
	@FindBy(id="state")
	private WebElement stateBox;
	
	@FindBy(id="zipCode")
	private WebElement zipCodeBox;
	
	@FindBy(xpath="//select[@id='cardType']")
	private WebElement cardTypeDD;
	
	
	@FindBy(id="creditCardNumber")
	private WebElement creditCardNumber;
	
	@FindBy(id="creditCardMonth")
	private WebElement creditCardMonth;
	
	@FindBy(id="creditCardYear")
	private WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	private WebElement nameOnCardBox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchaseFlightBtn;
	
	
	public Page_Purchase(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public Page_Confirmation fill_Form(String name, String address,String city,String state, String zipCode,
			String cardType,String creditCardNum, String month, String year,String nameOnCard)
	{
		setText(firstName, name);
		setText(addressBox, address);
		setText(cityBox, city);
		setText(stateBox, state);
		setText(zipCodeBox, zipCode);
		selectVisibleText_DD(cardTypeDD, cardType);
		setText(creditCardNumber, creditCardNum);
		setText(creditCardMonth, month);
		setText(creditCardYear, year);
		setText(nameOnCardBox, nameOnCard);
		clickElement(purchaseFlightBtn);
		
		Page_Confirmation obj_Confirmation = new Page_Confirmation(driver);
		PageFactory.initElements(driver, obj_Confirmation);
		return obj_Confirmation;

		
	}

}
