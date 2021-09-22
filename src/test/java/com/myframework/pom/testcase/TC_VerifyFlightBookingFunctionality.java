package com.myframework.pom.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myframework.pom.pages.Page_Confirmation;
import com.myframework.pom.pages.Page_Purchase;
import com.myframework.pom.pages.Page_ReserveFlight;
import com.myframework.pom.pages.Page_Welcome;
import com.myframework.pom.testcases.base.BaseTest;

public class TC_VerifyFlightBookingFunctionality extends BaseTest {
	public String testCaseName = "TC_VerfifyBookingFunctionality";
	
	@Test
	public void flightBookingTest()
	{
		System.out.println("Execution Started- Verify the flight booking functionality");
		
		Page_Welcome obj_Welcome = new Page_Welcome(driver);
		PageFactory.initElements(driver, obj_Welcome);
		Page_ReserveFlight obj_Reserve = obj_Welcome.findFlights("Boston","Rome");
		Page_Purchase obj_Purchase = obj_Reserve.chooseFlight();
		 Page_Confirmation obj_Confirmation = obj_Purchase.fill_Form("Tom", "Main Street", "New York", "New York", "12345", "Visa", "12345678", "11", "2017", "John");
		 String bookingID = obj_Confirmation.getBookingID();
		 
		 System.out.println("The booking ID for the flight booking is "+bookingID);
	}

}
