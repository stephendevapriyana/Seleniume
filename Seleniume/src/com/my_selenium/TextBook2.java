package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBook2 {
	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
			
			"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");

		WebDriver text=new ChromeDriver();
		
		text.get("http://www.leafground.com/pages/Edit.html");
		
	WebElement emailbox =text.findElement(By.id("email" ));
	emailbox.sendKeys("stephendevapriyan24@gmail.com");
		
	WebElement append =text.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	append.sendKeys("stephen");
	
	WebElement gettextbox=text.findElement(By.name("username"));
	String attribute = gettextbox.getAttribute("value");
	System.out.println(attribute);
	
	
	WebElement clear=text.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clear.clear();
	
	WebElement Disbel=text.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean enabled = Disbel.isEnabled();
	System.out.println(enabled);
	
	
}
}
