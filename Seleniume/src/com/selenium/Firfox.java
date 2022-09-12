package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firfox {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver	", 
				"D:\\java1\\Selenium_Testing\\GeckoDriver\\geckodriver.exe");
		
		WebDriver deva = new FirefoxDriver();
		
		deva.get("https://www.amazon.in/");
		
		
		
		
		      
		
	}

}
