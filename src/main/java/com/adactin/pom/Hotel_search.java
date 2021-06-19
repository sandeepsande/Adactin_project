package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_search {
	
	  public WebDriver driver;

	  @FindBy(xpath="//select[@name='location']")
	  private static WebElement location;
	  @FindBy(xpath="//select[@name='hotels']")
	  private static WebElement  hotels;
	  @FindBy(xpath="//select[@name='room_type']")
	  private static WebElement  roomtype;
	  @FindBy(xpath="//select[@name='room_nos']")
	  private static WebElement  noofrooms;
	  @FindBy(xpath="//input[@name='datepick_in']")
	  private static WebElement  checkin;
	  @FindBy(xpath="//input[@name='datepick_out']")
	  private static WebElement  checkout;
	  @FindBy(xpath="//select[@name='adult_room']")
	  private static WebElement  adultsperroom;
	  @FindBy(xpath="//select[@name='child_room']")
	  private WebElement  childrenperroom; 
	  @FindBy(xpath="//input[@name='Submit']")
	  private static WebElement  search;
	  
	public Hotel_search(WebDriver driver3) {
	this.driver = driver3;
	PageFactory.initElements(driver3, this);

	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public  WebElement getHotels() {
		return hotels;
	}
	public  WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultsperroom() {
		return adultsperroom;
	}
	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	public WebElement getSearch() {
		return search;
	}


}
