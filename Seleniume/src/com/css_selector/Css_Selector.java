package com.css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement fin = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		fin.sendKeys("stephen");
		
		
		WebElement gg = driver.findElement(By.cssSelector(".inputtext"));
		
		gg.sendKeys("stephen");
		
//		WebElement gy = driver.findElement(By.cssSelector("input#pass"));
//		
//		gy.sendKeys("7643367");
		
		WebElement ww = driver.findElement(By.cssSelector("#pass"));
		
		ww.sendKeys("7886678");
		
//		WebElement hh = driver.findElement(By.cssSelector("button[type='submit']"));
//		
//		hh.click();
		
		WebElement gp = driver.findElement(By.cssSelector("[type='submit']"));
		
		gp.click();
		
		
		
	}
	
}
