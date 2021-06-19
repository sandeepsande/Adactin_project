package comadactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	//browserlaunch
	public static WebDriver browserlaunch(String s) {
		if (s.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Baseproject\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		
		else {
			System.out.println("invalid");
		}
		return driver;
	}
	
	//get
	  public static void getit(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	//close
	   public static void closeit(WebElement element) {
       try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	   //quit
      public static void quitit(WebDriver element ) {
      try {
		element.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
      //navigate to
    public static void navigateto(String s) {
	 try {
		driver.navigate().to(s);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
    //navigate back
    public static void navigateback() {
    try {
		driver.navigate().back();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
    //navigateforward
    public static void navigatefront() {
    try {
		driver.navigate().forward();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
    // refresh
   public static void navigaterefresh() {
   try {
	driver.navigate().refresh();
} catch (Exception e) {
	e.printStackTrace();
}
   }
  //takesscreenshot
   public static void screenshot() throws IOException {
  try {
	TakesScreenshot ts = (TakesScreenshot) driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Baseproject\\screenshot");
	  FileUtils.copyFile(source,destination );
} catch (WebDriverException e) {
	e.printStackTrace();
}
 }
 //actions mouseover
  public static void actionit(WebElement element) {
  try {
	Actions ac = new Actions(driver);
	  ac.moveToElement(element).build().perform();
} catch (Exception e) {
	e.printStackTrace();
}
}
   //context click
  public static void contextclick(WebElement element) {
  try {
	Actions ac = new Actions(driver);
	  ac.contextClick(element);
} catch (Exception e) {
	e.printStackTrace();
}
}
  //click
  public static void clickit(WebElement element) {
  try {
	element.click();
} catch (Exception e) {
	e.printStackTrace();
}
}
  //sendkeys
 public static void sendit(WebElement element,String text) {
  try {
	element.sendKeys(text);
} catch (Exception e) {
	e.printStackTrace();
}
}

 //alert
  public static void acceptit() {
  try {
	Alert a = driver.switchTo().alert();
	  a.accept();
} catch (Exception e) {
	e.printStackTrace();
}
}
 //dismissit
  public static void dismissit() {
  try {
	Alert a1 = driver.switchTo().alert();
	  a1.dismiss();
} catch (Exception e) {
	e.printStackTrace();
}
}
 //frames
 public static void frames(WebElement element) {
 try {
	driver.switchTo().frame(element);
} catch (Exception e) {
	e.printStackTrace();
}
}
//windowhandles
 public static void windowhandles() {
 Set<String> allid= driver.getWindowHandles();
 System.out.println("all page title");
 for (String id : allid) {
 try {
	driver.switchTo().window(id).getTitle();
	 System.out.println("title");
} catch (Exception e) {
	e.printStackTrace();
}	
}
 }
//dropdown single
 public static void selectbyvalue(WebElement element,String value) {
 try {
	Select s = new Select(element);
	 s.selectByValue(value);
} catch (Exception e) {
	e.printStackTrace();
}
}
 public static void selectbyvisible(WebElement element,String text) {
 try {
	Select s1 = new Select(element);	 
	 s1.selectByVisibleText(text);
} catch (Exception e) {
	e.printStackTrace();
}	 
}
 public static void selectbyindex(WebElement element,int index) {
 try {
	Select s2 = new Select(element);
	 s2.selectByIndex(index);
} catch (Exception e) {
	e.printStackTrace();
}
}
 //dropdownmultiple
 public static void multiple(WebElement element) {
 try {
	Select s = new Select(element);
	 boolean multiple = s.isMultiple();	 
	 System.out.println(multiple);
} catch (Exception e) {
	e.printStackTrace();
}	 
}
 //getalloptions
 public static void getalloptions(WebElement element) {
 Select s= new Select(element);
 List<WebElement>alloptions = s.getOptions();
 for (WebElement options : alloptions) {
	try {
		System.out.println(options.getText());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
 //wait
 public static void implicit() {
 try {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
} catch (Exception e) {
	e.printStackTrace();
}
 }
  public static void explicit(WebElement element) {
  try {
	WebDriverWait wait = new  WebDriverWait(driver, 15);	
	  wait.until(ExpectedConditions.visibilityOf(element));
} catch (Exception e) {
	e.printStackTrace();
}  
 }
 //scroll
 public static void scrollup(WebElement element) {
 try {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].ScrollIntoview;",element );
} catch (Exception e) {
	e.printStackTrace();
}
}
 public static void scrolldown(WebElement element) {
 try {
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("arguments[0].ScrollIntoview;", element);
} catch (Exception e) {
	e.printStackTrace();
}
}
 public static void bottompage(WebElement element) {
 try {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.ScrollTo(0,document.body.ScrollHeight)");
} catch (Exception e) {
	e.printStackTrace();
}
} 
 //getallselected
  public static void allselected(WebElement element) {
  Select s = new Select(element);
  List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
  for (WebElement allselected : allSelectedOptions) {
  try {
	System.out.println(allselected.getText());
} catch (Exception e) {
	e.printStackTrace();
}
}
}
 //getfirstselected
 public static void firstselected(WebElement element) {
 Select s1 = new Select(element);
 WebElement firstSelectedOption = s1.getFirstSelectedOption();
 try {
	System.out.println(firstSelectedOption.getText());
} catch (Exception e) {
	e.printStackTrace();
}
}


}
