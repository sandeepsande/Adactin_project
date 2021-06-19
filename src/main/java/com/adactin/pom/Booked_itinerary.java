package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itinerary {
	

	public  WebDriver driver;
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	public static WebElement logout;


	

	public Booked_itinerary(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

	public  WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}


}
