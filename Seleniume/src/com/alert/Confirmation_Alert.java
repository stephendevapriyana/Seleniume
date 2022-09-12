package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
       WebElement conf = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & ')] "));
		
		conf.click();
		Thread.sleep(3000);
		WebElement mation = driver.findElement(By.xpath("//button[contains(@onclick,'confirmbox()')] "));
		
		mation.click();
		
		Alert cl=driver.switchTo().alert();
		
		cl.dismiss();
		
		
		
	}

}
