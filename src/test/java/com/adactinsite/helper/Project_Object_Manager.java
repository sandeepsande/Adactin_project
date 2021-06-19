package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Booked_itinerary;
import com.adactin.pom.Hotel_Book;
import com.adactin.pom.Hotel_Select;
import com.adactin.pom.Hotel_search;
import com.adactin.pom.User_Login;

public class Project_Object_Manager {
	
	public WebDriver driver; 
	private User_Login login;
	private Hotel_search search;
	private Hotel_Select select;
	private Hotel_Book book;
	private Booked_itinerary confirm;
	public Project_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
	}
	
	
	public User_Login get_Instance_Login() {
	login = new User_Login(driver);
	return login;
	}
	
	public  Hotel_search get_Instance_SearchHotel() {
	search = new Hotel_search(driver);	
	return search;
	}
	
	public Hotel_Select get_Instance_SelectHotel() {
    select = new Hotel_Select(driver);
	return select;	
	}
	
	public Hotel_Book get_instance_HotelBook() {
	book = new  Hotel_Book(driver);
	return book;
	}
	
	public Booked_itinerary get_Instance_Itinerary() {
    confirm = new  Booked_itinerary(driver);
    return confirm;
	}
	

}
