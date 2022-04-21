package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\babin\\eclipse\\Locator.Java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
//		WebElement element2 = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=4']"));
//		driver.switchTo().frame("login_page");
//		
//		
//		
//		
//		
//		WebElement element = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
//	    element.sendKeys("123654");
//	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
