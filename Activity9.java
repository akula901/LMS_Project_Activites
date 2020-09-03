package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
WebDriver driver;

//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}

	
//My Account Login
	  @Test
	    public void testcase() {
	driver.findElement(By.linkText("My Account")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
    driver.findElement(By.id("user_login")).sendKeys("root");
	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("wp-submit")).click();
	
	
 //Go to course page 
	    driver.findElement(By.linkText("All Courses")).click();
	    
	//Select course
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();
	  
	//click lesson
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")).click();
	  
	//page title
	    System.out.println("course title:  " + driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "Developing Strategy – Alchemy LMS");
	    
	//mark complete
	    driver.findElement(By.className("learndash_mark_complete_button")).click();
	  }
	      
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
