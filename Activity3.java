package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
 //title of firstinfobox and match it
	  @Test
	    public void firstinfobox() {
	        WebElement firstinfobox = driver.findElement(By.cssSelector("h3.uagb-ifb-title"));
	        System.out.println("firstinfobox Title:  " + firstinfobox.getText());
	        Assert.assertEquals(firstinfobox.getText(), "Actionable Training");
	            }
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
