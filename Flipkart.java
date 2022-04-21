package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Flipkart extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Flipkart f = new Flipkart();
		
		f.browserconfigchrome();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f.openurl("https://www.flipkart.com/");
		f.maximizewindow();
		WebElement user = f.locatebyxpath("(//input[@type='text'])[2]");
		f.inputText(user, "7708741966");
		// f.inputText(user,f.ExcelRead("C:\\Users\\babin\\eclipse\\StudentDetails\\Excel\\Bibin.xlsx",
		// "BIBIN", 2, 0));
		WebElement pass = f.locatebyxpath("(//input[@type='password'])");
		f.inputText(pass, "Password@01");
		WebElement login = f.locatebyxpath("(//button[@type='submit'])[2]");
		login.click();
		
		WebElement locatebyname = f.locatebyname("q");
		f.inputText(locatebyname, "samsung");
		
		WebElement searchlogin = f.locatebyxpath("(//button[@type='submit'])");
		searchlogin.click();

	}

}
