package com.drag_drop;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Thread.sleep(4000);
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000);

		Actions act=new Actions(driver);
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
//		
		
		
		
		
		
		
	}

}
