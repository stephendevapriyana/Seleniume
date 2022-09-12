package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver=new  ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement fd = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		fd.click();
		
		
		
		
	}
	
	

}
