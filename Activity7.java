package lmsProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
    
//Navigate to page
	@BeforeTest
	public void beforeMethod() {
	driver = new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/lms/");
	}
	
 //All courses page 
	  @Test
	    public void testcase() {
	    driver.findElement(By.linkText("All Courses")).click();
	    
	//No of Courses
	  List<WebElement> courses = driver.findElements(By.tagName("h3"));
	  System.out.println("NoofCourses: " + courses.size());
	  for(WebElement course: courses) {
		  System.out.println("Course:  " + course.getText());
		  }
}
	  
//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();		
}
}
