package com.Tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement fin = driver.findElement(By.cssSelector("#age"));
		
		String attribute = fin.getAttribute("title");
		
		System.out.println(attribute);
		
	}	
	

}
