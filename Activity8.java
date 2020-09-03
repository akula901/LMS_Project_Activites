package lmsProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
WebDriverWait wait;

//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
	wait = new WebDriverWait(driver, 10);
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
 //All courses page 
	  @Test
	    public void testcase() {
	    driver.findElement(By.linkText("Contact")).click();
	    
	//give info      
	       driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Akula Jyothi");
	       driver.findElement(By.id("wpforms-8-field_1")).sendKeys("jyothi@test.com");
	       driver.findElement(By.id("wpforms-8-field_3")).sendKeys("couse related info");
	       driver.findElement(By.id("wpforms-8-field_2")).sendKeys("course fee details");
	       
	//sumbmit
	       driver.findElement(By.id("wpforms-submit-8")).submit();
	       
	//wait for text 
	       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("wpforms-confirmation-8"), "Thanks for contacting us! We will be in touch with you shortly."));
	       
	//print the text
	       String text = driver.findElement(By.id("wpforms-confirmation-8")).getText();
	       System.out.println("Text: " + text);
	            }
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
		
}
}
