package com.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.BaseClass;

public class Dashboard_Test extends BaseClass {
	
	ArrayList<String> actCourse;
	ArrayList<String> expCourse;
	
	@Test
	public void Courses_Offered() {
		pu.readProperty("browser");
		loginPage();
		 actCourse = new ArrayList<String>();
		 List<WebElement> list = driver.findElements(By.xpath("//h3"));
		    
		 for(WebElement course : list) {
		    	String text = course.getText();
		    	actCourse.add(text);
		}
		 expCourse = new ArrayList<String>();
			expCourse.add("Selenium");
			expCourse.add("Java / J2EE");
			expCourse.add("Python");
			expCourse.add("Php");
			
			Assert.assertEquals(actCourse, expCourse);

	}
	@Test
	public void User_added() {
		dashboardUser();
		Alert at = driver.switchTo().alert();
		String Text = at.getText();
		Assert.assertEquals(Text, "User Added Successfully. You can not see added user");
	}
}
