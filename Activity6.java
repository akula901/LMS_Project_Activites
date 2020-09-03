package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
 //My account page 
	  @Test
	    public void testcase() {
	    driver.findElement(By.linkText("My Account")).click();
	    
	//read the title and match       
	        System.out.println("newpage Title:  " + driver.getTitle());
	        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
	        
	//login and enter credentials
	        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
	        driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
	  }
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
