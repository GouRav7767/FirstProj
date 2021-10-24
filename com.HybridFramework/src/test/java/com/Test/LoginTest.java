package com.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.BaseClass;



public class LoginTest extends BaseClass {
	
	@Test(description ="Check valid username & password")
	public void TC_01() {
		pu.readProperty("browser");
		loginPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		driver.close();
	}
	
	@Test(description ="Check Invalid username & valid password")
	public void TC_02() {
		pu.readProperty("browser");
		Username_LoginPage();
		String act =driver.findElement(By.id("email_error")).getText();
		Assert.assertEquals(act, "Please enter email as kiran@gmail.com");
		driver.close();
	}
	
	@Test(description ="Check valid username & invalid password")
	public void TC_03() {
		pu.readProperty("browser");
		Password_loginPage();
		String act =driver.findElement(By.id("password_error")).getText();
		Assert.assertEquals(act, "Please enter password 123456");
		driver.close();
	}
}
