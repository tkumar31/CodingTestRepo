package com.myframework.pom.base;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage{
	
	public WebDriver driver = null;

	 
	 
	 public void selectValue_DD(WebElement element, String vText) {
			Select select = new Select(element);
			try {
				select.selectByValue(vText);
			} catch (StaleElementReferenceException e) {
				select.selectByValue(vText);
			}

		}

	 public void clickElement(WebElement element) {
			try {
				element.click();
			} catch (StaleElementReferenceException e) {
				try {
					element.click();
				} catch (StaleElementReferenceException e1) {
					element.click();
				}
			}
		}
	 
	 
	 
		public void setText(WebElement element, String text) {
			try {
				element.sendKeys(text);
			} catch (StaleElementReferenceException e) {
				element.sendKeys(text);
			}

		}
	 
		public void selectVisibleText_DD(WebElement element, String vText) {
			Select select = new Select(element);
			select.selectByVisibleText(vText);

		}
		
		public String getText(WebElement element) {
			try {
				return element.getText();
			} catch (StaleElementReferenceException e) {
			
				return element.getText();
			}
		}
		

 }