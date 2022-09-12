package com.iiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_a_iframe {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		WebElement sd = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		sd.sendKeys("setephen");
		
	
		
		WebElement fsd = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		driver.switchTo().frame(fsd );
		
		WebElement find = driver.findElement(By.name("email"));
		find.sendKeys("hi");
		
		
		
		
	}
	
}
