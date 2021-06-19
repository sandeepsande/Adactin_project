package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Login {
	
	

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@name='login']")
	private WebElement signin;
	
	public User_Login(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	
	
	

}
