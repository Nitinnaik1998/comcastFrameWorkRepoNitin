package com.comcast.crm.JavaUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewFile {
	WebDriver driver;
	public NewFile(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver,this);
		
	}

}
