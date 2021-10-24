package com.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Pages.BaseClass;

public class ActionUtils extends BaseClass {
	
	public void typeIn(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		element.click();
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}
	
	public void moveAndClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	
	public WebElement getElement(String locname, String locvalue) {
		
		if(locvalue.equals("xpath"))
			return driver.findElement(By.xpath(locvalue));
		if(locvalue.equals("id"))
			return driver.findElement(By.id(locvalue));
		
		return null;
	}
}
