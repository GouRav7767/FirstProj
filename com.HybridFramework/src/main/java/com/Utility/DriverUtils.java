package com.Utility;

import org.openqa.selenium.WebElement;

import com.Pages.BaseClass;

public class DriverUtils extends BaseClass {

	public void switchToFrameById(String id) {
		driver.switchTo().frame(id);
	}

	public void switchToFrameByIndex(int Index) {
		driver.switchTo().frame(Index);
	}

	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToWIindow(String id) {
		driver.switchTo().window(id);
	}

}
