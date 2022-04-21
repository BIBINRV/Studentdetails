package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public void browserconfigchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void openurl(String url) {
		driver.get(url);
	}
	public void maximizewindow() {
		driver.manage().window().maximize();


	}
		public WebElement LocateById(String id) {
			WebElement findElement = driver.findElement(By.id(id));
			return findElement;
		}
	
		public WebElement LocateByName(String name) {
			WebElement findElement = driver.findElement(By.name(name));
			return findElement;
	
		}
		public void inputText(WebElement element,String value) {
	      element.sendKeys(value);	
		}
	     public void click(WebElement element) {
	    	 element.click();
	    	 

		}
	
	
}

























