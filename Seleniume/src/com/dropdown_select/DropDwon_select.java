package com.dropdown_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwon_select {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement ff = driver.findElement(By.id("dropdown1"));
		
		Select sd=new Select(ff);
		
		sd.selectByIndex(1);
		
	}

}
