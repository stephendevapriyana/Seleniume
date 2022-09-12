package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		
		
		Select  sel=new Select(findElement);
		
		sel.selectByIndex(2);
		sel.selectByValue("4");
	sel.selectByVisibleText("UFT/QTP");
		
		// we can use to give sendkeys 
		findElement.sendKeys("Selenium");
		
		List<WebElement> options = sel.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
//		for (int i = 0; i <options.size(); i++) {
//			
//			System.out.println(options.get(i));
			
		
		
		
	}

}
