package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yframet {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement as = driver.findElement(By.id("Click"));
		as.click();
	}

}
