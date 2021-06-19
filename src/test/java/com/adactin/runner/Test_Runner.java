package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinsite.helper.File_Reader_Manager;

import comadactin.baseclass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

  @RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//adactin//feature" , glue = "com.adactin.defintion"
	,monochrome = true, 
	dryRun = false, 
	strict = false, 
	tags = ("@SmokeTest,@SanityTest,@SanityTest,@SanityTest,@SanityTest"),
	plugin = {"html:Report/HTML_Report" , 
			
	       "pretty" ,

	     "json:Report/CucumberJSON_Report.json" ,
			
	     " com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"					
	})
	 
	public class Test_Runner {
		
		public static WebDriver driver;
		
		@BeforeClass
		public static void set_up() throws Throwable {
			String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
			driver = Base_Class.browserlaunch(browser);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	    
		@AfterClass
		public static void tear_down() {
			
	   // driver.close();

		}

}
