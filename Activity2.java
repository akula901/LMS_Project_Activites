package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
//heading of webpage an match the string
	  @Test
	    public void header() {
	        WebElement header = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
	        System.out.println("header Title:  " + header.getText());
	        Assert.assertEquals(header.getText(), "Learn from Industry Experts");
	            }
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
