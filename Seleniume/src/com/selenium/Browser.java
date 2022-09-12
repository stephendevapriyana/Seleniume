package com.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"D:\\java1\\Selenium_Testing\\FirefoxDriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bharathuniv.ac.in/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
