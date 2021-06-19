Feature: Hotel Booking In Adactin Application

Scenario: 
Given User Launch The Application
When User Enter The Username In Username Field
And User Enter The Password In Password Field
Then User Click On The Login Button And It Navigates To The Search Hotel 

Scenario: 

When User select The Location
And User Select The Hotel
And User Select The Room Type
And User Select The Number Of Rooms
And User Select The CheckIn Date
And User Select The Checkout Date
And User Select The Adult Per Room
And User Select The Children Per Room
Then User Click On The Search Button And It Navigates To The Select Hotel

Scenario:

When User Select The Hotel
And Use click On The continue Button And It Navigates To The Book A Hotel

Scenario:

When User Enter The Firstname In Firstname Field
And User Enter The Lastname In Lastname Field
And User Enter The Billing Address In Billing Address Field
And User Enter The Credit Card No In Credit No Field
And User Select The Credit Card Type In Credit Type Field
And User Select The Expire Date In Select Month And Year Field
And User Enter The CVV Number In CVV Number Field
Then User Click The Book Now Button And It Navigates To The Booking Confirmation

Scenario:
When User Click On The LogOut Button And It Navigates To The LogOut Page
