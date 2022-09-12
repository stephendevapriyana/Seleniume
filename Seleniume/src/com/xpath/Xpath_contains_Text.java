package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_Text {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement sd = driver.findElement(By.xpath("//a[contains(text(),'Create New ')]"));
		
		sd.click();
	}

}
