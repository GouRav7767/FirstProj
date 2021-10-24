package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectionUtils {

	public void selectByText(String text, WebElement element) {
		Select se = new Select(element);
		se.selectByVisibleText(text);
	}

}
