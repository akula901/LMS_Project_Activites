package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
 //title of the second popular course and match it
	  @Test
	    public void firstinfobox() {
	        WebElement secCourse = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
	        System.out.println("secCourse Title:  " + secCourse.getText());
	        Assert.assertEquals(secCourse.getText(), "Email Marketing Strategies");
	            }
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
