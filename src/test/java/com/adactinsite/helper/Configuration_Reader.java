package com.adactinsite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_cucumber\\src\\test\\java\\com\\adactin\\helper\\configuration.properties");	
	FileInputStream fis = new FileInputStream(f);
	 
	 p = new Properties();
	 p.load(fis);
	
	}
	public String get_Browser() {
 	String Browser = p.getProperty("browser");
 	return Browser;
	}
	
	public String get_Url() {
	String Url = p.getProperty("url");	
	return Url;	
	}	


	public String creditcardno() {
    String creditno = p.getProperty("creditcardno");
    return creditno;
	}
	
	public String cvvno() {
    String cvv = p.getProperty("cvvno");
    return cvv;
	}
		
	

}
