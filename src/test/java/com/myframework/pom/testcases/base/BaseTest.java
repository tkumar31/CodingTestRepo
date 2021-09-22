package com.myframework.pom.testcases.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver = null;
	public Properties prop = null;

	
	@BeforeTest
	public void setUp()
	{
	   
		
		
		File file = new File(System.getProperty("user.dir")+"\\config.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			    driver.get(prop.getProperty("URL"));
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
			 WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			    driver.get(prop.getProperty("URL"));

		}
		
		else if (browserName.equalsIgnoreCase("IE"))
		
	    {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		    driver.get(prop.getProperty("URL"));

		}
		
		
	}

	
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
}
