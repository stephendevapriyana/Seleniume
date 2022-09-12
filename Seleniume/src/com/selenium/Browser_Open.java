package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Open {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		
		WebDriver stephen =new ChromeDriver();
		
		stephen.get("https://www.myntra.com//");
		
		
		
		stephen.manage().window().maximize();
		
		String title = stephen.getTitle();
		System.out.println(title);
		
		String currentUrl = stephen.getCurrentUrl();
		System.out.println(currentUrl);
		
		int hashCode = stephen.hashCode();
		System.out.println(hashCode);
		
		
		
		
		
		
	}

}
