package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Select {
	
	public WebDriver driver;
    
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private static WebElement selecthotel;
	@FindBy(xpath="//input[@name='continue']")
	 private static WebElement continuesubmit;
	
	 public Hotel_Select(WebDriver driver4) {
	 this.driver=driver4;
	 PageFactory.initElements(driver4, this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinuesubmit() {
		return continuesubmit;
	}
	
	

}
