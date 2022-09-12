package com.iiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Try {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		
		
		driver.switchTo().frame(0);
		
		WebElement put = driver.findElement(By.id("Click"));
		put.click();
		
		driver.switchTo().defaultContent();
		
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement hi = driver.findElement(By.id("Click1"));
		hi.click();
		
		
		
		
	}

}
