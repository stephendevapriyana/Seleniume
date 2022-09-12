package com.alert;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		simple.click();
		
		Alert al=driver.switchTo().alert();
		
		al.accept();
	
		
		
		
		
		
		
		
		
		
	}

}
