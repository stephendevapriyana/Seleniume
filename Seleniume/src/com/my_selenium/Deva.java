package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deva {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement click = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		click.click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement loop = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		loop.sendKeys("stephen");
	}

}
