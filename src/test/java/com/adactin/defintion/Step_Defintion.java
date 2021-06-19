package com.adactin.defintion;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;
import com.adactinsite.helper.File_Reader_Manager;
import com.adactinsite.helper.Project_Object_Manager;

import comadactin.baseclass.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
            public class Step_Defintion extends Base_Class {
			public static WebDriver driver = Test_Runner.driver;
			public static Project_Object_Manager pom = new  Project_Object_Manager(driver);
			//public static User_Login log = new  User_Login(driver);
			//public  static Hotel_search search = new Hotel_search(driver);
			//public static Hotel_Select select = new Hotel_Select(driver);
			//public static Hotel_Book Booknow = new Hotel_Book(driver);
			//public static Booked_itinerary booked = new  Booked_itinerary(driver);
			
				@Given("^User Launch The Application$")
				public void user_Launch_The_Application() throws Throwable {
				String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
				getit(url);
				getit("https://adactinhotelapp.com/HotelAppBuild2/");
			    
				}   

				//@When("^User Enter The Username In Username Field$")
				//public void user_Enter_The_Username_In_Username_Field() throws Throwable {
			   // sendit(log.getUsername(), "Sandeepsoundar2113");  
			    //sendit(pom.get_Instance_Login().getUsername(), "Sandeep211398");	
				//}

				//@When("^User Enter The Password In Password Field$")
				//public void user_Enter_The_Password_In_Password_Field() throws Throwable {
				//sendit(log.getPassword(), "YSM6I3");  
	            //sendit(pom.get_Instance_Login().getPassword(),"Sand@#$2198");
				//}
				

	             @When("^User Enter The \"([^\"]*)\" In Username Field$")
	             public void user_Enter_The_In_Username_Field(String Username) throws Throwable { 
	             sendit(pom.get_Instance_Login().getUsername(), Username);
	    
	             }

	              @When("^User Enter The \"([^\"]*)\" In Password Field$")
	           public void user_Enter_The_In_Password_Field(String Password) throws Throwable {
	             sendit(pom.get_Instance_Login().getPassword(), Password);
	             }
				
				
				@Then("^User click On The Login Button And It Navigates To Search Hotel$")
				public void user_click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel() throws Throwable {
				//clickit(log.getSignin()); 
				clickit(pom.get_Instance_Login().getSignin());
				}
				
				

	           @When("^User Select The Location$")
	          public void user_Select_The_Location() throws Throwable {
		     // selectbyvalue(search.getLocation(),"Melbourne"); 
	        	selectbyvalue(pom.get_Instance_SearchHotel().getLocation(), "Melbourne");
	          }

	         @When("^User Select The Hotel$")
	         public void user_Select_The_Hotel() throws Throwable {
	         //selectbyvalue(search.getHotels(), "Hotel Sunshine");
	           selectbyvalue(pom.get_Instance_SearchHotel().getHotels(), "Hotel Sunshine");
	         }

	         @When("^User Select The Room Type$")
	         public void user_Select_The_Room_Type() throws Throwable {
	        // selectbyvisible(search.getRoomtype(), "Deluxe");	
	          selectbyvisible(pom.get_Instance_SearchHotel().getRoomtype(), "Deluxe");
	    	 }

	        @When("^User Select The Number OF Rooms$")
	        public void user_Select_The_Number_OF_Rooms() throws Throwable {
	        // selectbyvalue(search.getNoofrooms(), "3");
	        selectbyvalue(pom.get_Instance_SearchHotel().getNoofrooms(), "3");
	         }

	         @When("^User Select The CheckIn Date$")
	         public void user_Select_The_CheckIn_Date() throws Throwable {
	        //sendit(search.getCheckin(), "14/06/99");
	        sendit(pom.get_Instance_SearchHotel().getCheckin(), "14/06/99");
	        }

	        @When("^User Select The Checkout Date$")
	       public void user_Select_The_Checkout_Date() throws Throwable {
	        //sendit(search.getCheckout(), "21/08/99");
	        sendit(pom.get_Instance_SearchHotel().getCheckout(), "21/08/99");
	        }

	        @When("^User Select The Adult Per Room$")
	        public void user_Select_The_Adult_Per_Room() throws Throwable {
	        //selectbyvalue(search.getAdultsperroom(), "3");
	        selectbyvalue(pom.get_Instance_SearchHotel().getAdultsperroom(), "3");
	       }

	      @When("^User Select The Children Per Room$")
	      public void user_Select_The_Children_Per_Room() throws Throwable {
	       //selectbyvalue(search.getChildrenperroom(), "2");
	    	  selectbyvalue(pom.get_Instance_SearchHotel().getChildrenperroom(), "2");
	      }

	      @Then("^User Click On The Search Button And It Navigates To Select Hotel$")
	      public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
		  //clickit(search.getSearch());
	       clickit(pom.get_Instance_SearchHotel().getSearch());
		  }
	      

	       @Given("^User Choose The Hotel$")
	       public void user_Choose_The_Hotel() throws Throwable {
	       //clickit(select.getSelecthotel());
	    	clickit(pom.get_Instance_SelectHotel().getSelecthotel());
	       }

	      @Then("^User click On The Continue Button It Navigates To Book A Hotel$")
	      public void user_click_On_The_Continue_Button_It_Navigates_To_Book_A_Hotel() throws Throwable {
	       //clickit(select.getContinuesubmit());
	    	 clickit(pom.get_Instance_SelectHotel().getContinuesubmit());
	       }
	      
	           
	      @When("^User Enter The First Name In Firstname Field$")
	      public void user_Enter_The_First_Name_In_Firstname_Field() throws Throwable {
	       //sendit(Booknow.getFirstname(), "sandeep"); 
	    	 sendit(pom.get_instance_HotelBook().getFirstname(), "sandeep");
	      }

	      @When("^User Enter The Last Name In Lastname Field$")
	      public void user_Enter_The_Last_Name_In_Lastname_Field() throws Throwable {
	      // sendit(Booknow.getLastname(), "sandy");
	      sendit(pom.get_instance_HotelBook().getLastname(), "sandy");
	      }

	      @When("^User Enter The Billing Address In Billing Address Field$")
	      public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	      // sendit(Booknow.getBillingaddress(), "1308 stalin nagar kattupakkam ch-98");
	     sendit(pom.get_instance_HotelBook().getBillingaddress(), "1308 stalin nagar kattupakkam ch-98");
	      }

	      @When("^User Enter The Credit Card Number In creditnumber Field$")
	      public void user_Enter_The_Credit_Card_Number_In_creditnumber_Field() throws Throwable {
	     // String creditcardno = File_Reader_Manager.getInstance().getInstanceCR().creditcardno();
	     // sendit(Booknow.getCardnumber(), creditcardno );
	      // sendit(Booknow.getCardnumber(), "1234567891234567"); 
	    	sendit(pom.get_instance_HotelBook().getCardnumber(), "1234567891234567");
	      }

	      @When("^User Select The Credit Card Type$")
	      public void user_Select_The_Credit_Card_Type() throws Throwable {
	      //selectbyvisible(Booknow.getCardtype(), "Master Card");
	     sendit(pom.get_instance_HotelBook().getCardtype(), "Master Card");
	      }

	      @When("^User Select The Expire Month$")
	      public void user_Select_The_Expire_Month() throws Throwable {
	      // selectbyvisible(Booknow.getExpiremonth(), "March");
	      selectbyvisible(pom.get_instance_HotelBook().getExpiremonth(), "March");
	      }

	      @When("^User select The Expire year$")
	      public void user_select_The_Expire_year() throws Throwable {
	       //selectbyvisible(Booknow.getExpireyear(), "2014");
	     selectbyvisible(pom.get_instance_HotelBook().getExpireyear(), "2014");
	      }

	      @When("^User Enter the CVV Number In Cvvnumber Field$")
	      public void user_Enter_the_CVV_Number_In_Cvvnumber_Field() throws Throwable {
	     // String cvvno = File_Reader_Manager.getInstance().getInstanceCR().cvvno();
	      //sendit(Booknow.getCvvnumber(), cvvno);
	      // sendit(Booknow.getCvvnumber(), "1234"); 
	    	sendit(pom.get_instance_HotelBook().getCvvnumber(), "2113");
	      }

	      @Then("^User Click On The Book Now Button And It Navigates To Booking Confirmation$")
	      public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation() throws Throwable {
	      // clickit(Booknow.getBooknow());  
	      clickit(pom.get_instance_HotelBook().getBooknow());
	      }
	      
	     
	      @Then("^User Click On The logout Button And It Navigates to Loggedout Page$")
	      public void user_Click_On_The_logout_Button_And_It_Navigates_to_Loggedout_Page() throws Throwable {
	     // clickit(booked.getLogout());
	    	 clickit(pom.get_Instance_Itinerary().getLogout());
	      } 
	      
	      
}
