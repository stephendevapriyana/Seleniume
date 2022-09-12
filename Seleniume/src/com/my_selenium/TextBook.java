package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextBook {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
	
	"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");

		WebDriver text=new ChromeDriver();
		
		text.get("http://www.leafground.com/pages/Edit.html");
		
	text.findElement(By.id("email" )).sendKeys("stephendevapriyan@gmail.com");
		
	text.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("stephen");
	String attribute = text.findElement(By.name("username")).getAttribute("value");
	System.out.println(attribute);
	text.findElement(By.name("username")).clear();
	
	
	
	}
	
	
	
	

}
