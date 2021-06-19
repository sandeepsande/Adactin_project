package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Book {
	
	
public WebDriver driver;
	
    @FindBy(xpath="//input[@name='first_name']")
	private static WebElement firstname;
    @FindBy(xpath="//input[@name='last_name']")
	private static WebElement lastname;
    @FindBy(xpath="//textarea[@name='address']")
	private static WebElement billingaddress;
    @FindBy(xpath="//input[@name='cc_num']")
	private static WebElement cardnumber;
    @FindBy(xpath="//select[@name='cc_type']")
	private static WebElement cardtype;
    @FindBy(xpath="//select[@name='cc_exp_month']")
	private static WebElement expiremonth;
    @FindBy(xpath="//select[@name='cc_exp_year']")
	private static WebElement expireyear;
    @FindBy(xpath="//input[@name='cc_cvv']")
	private static WebElement cvvnumber;
    @FindBy(xpath="//input[@name='book_now']")
	private static WebElement booknow;
		
	
	
	
	public Hotel_Book(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	public  WebElement getDriver() {
		return (WebElement) driver;
	}
	public  WebElement getFirstname() {
		return firstname;
	}
	public  WebElement getLastname() {
		return lastname;
	}
	public  WebElement getBillingaddress() {
		return billingaddress;
	}
	public  WebElement getCardnumber() {
		return cardnumber;
	}
	public  WebElement getCardtype() {
		return cardtype;
	}
	public  WebElement getExpiremonth() {
		return expiremonth;
	}
	public  WebElement getExpireyear() {
		return expireyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	


}
