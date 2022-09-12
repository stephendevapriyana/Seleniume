package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver put =new ChromeDriver();
		
		put.get("http://www.leafground.com/pages/Link.html");
		
		put.findElement(By.linkText("Go to Home Page")).click();
		
		
	}

}
