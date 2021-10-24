package com.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.Utility.ActionUtils;
import com.Utility.PropertiesUtils;
import com.Utility.WaitUtils;

public class BaseClass {

	public PropertiesUtils pu = null;
	public WaitUtils wu = null;
	public WebDriver driver = null;
	public ActionUtils au;

	@BeforeMethod
	public void setUp() {
		pu = new PropertiesUtils();
		wu = new WaitUtils();
		

		if (pu.readProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", pu.readProperty("chroemDriverfilePath"));
			driver = new ChromeDriver();
		}
		if (pu.readProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", pu.readProperty("geckoDriverfilePath"));
			driver = new FirefoxDriver();
		}
		driver.get(pu.readProperty("BaseUrl"));
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
	}

	public void loginPage() {
		au=new ActionUtils();
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("uname"));
		au.typeIn(driver.findElement(By.id("password")), pu.readProperty("upass"));
		au.click(driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")));
	}
	
	public void Username_LoginPage() {
		au=new ActionUtils();
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("uname1"));
		au.typeIn(driver.findElement(By.id("password")), pu.readProperty("upass"));
		au.click(driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")));
	}
	
	public void Password_loginPage() {
		au=new ActionUtils();
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("uname"));
		au.typeIn(driver.findElement(By.id("password")), pu.readProperty("upass1"));
		au.click(driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")));
	}
	
	public void dashboardUser() {
		loginPage();
		au.click(driver.findElement(By.xpath("//span[text()='Users']")));
		au.click(driver.findElement(By.xpath("//button[text()='Add User']")));
		au.typeIn(driver.findElement(By.id("username")), pu.readProperty("Username"));
		au.typeIn(driver.findElement(By.id("mobile")), pu.readProperty("Mobile"));
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("uname"));
		au.typeIn(driver.findElement(By.id("course")), pu.readProperty("Courses"));
		au.click(driver.findElement(By.xpath("//input[@id='Male']")));
		au.typeIn(driver.findElement(By.xpath("//label[text()='State']")), pu.readProperty("State"));
		au.typeIn(driver.findElement(By.id("password")), pu.readProperty("Mobile"));
		au.typeIn(driver.findElement(By.xpath("//label[text()='Friend Mobile']")), pu.readProperty("Mobile"));
	}
	
	
}

