package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
		boolean selected = radio.isSelected();
		System.out.println(selected);
		
		WebElement button = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		
		boolean selected2 = button.isSelected();
		System.out.println(selected2);
	
		WebElement findElement = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		findElement.click();
		
		
		
	}

}
