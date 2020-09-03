package lmsProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
//get the title and match the page title
	  @Test
	    public void testcase() {
		  System.out.println("Page Title:  " + driver.getTitle());
		   Assert.assertEquals("Alchemy LMS – An LMS Application", driver.getTitle());
	            
	  }

	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
