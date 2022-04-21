package com.test;

import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass{


	public static void main(String[] args) {
		Facebook f = new Facebook();
		f.browserconfigchrome();
		f.openurl("https://www.flipkart.com/");
		f.maximizewindow();
		WebElement txtuser = f.LocateById("email");
		f.inputText(txtuser,"bibin");
		WebElement txtpass = f.LocateByName("pass");
		f.inputText(txtpass,"702040");
		WebElement login = f.LocateByName("login");
		login.click();

		



	}


}


