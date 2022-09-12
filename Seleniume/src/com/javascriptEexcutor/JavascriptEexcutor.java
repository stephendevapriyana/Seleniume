package com.javascriptEexcutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptEexcutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor kk=(JavascriptExecutor) driver;
		
		kk.executeScript("window.scrollBy(0,5000)", " ");// this is   scrolldown
		
		kk.executeScript("window.scrollBy(0,-3000)", " ");// this is scrollup
		
		kk.executeScript("window.scrollBy(0,-2000)", " ");
		
		
		JavascriptExecutor oo=(JavascriptExecutor) driver;
		
		WebElement fe = driver.findElement(By.xpath("//a[text()='United States']"));
	
		oo.executeScript("arguments[0].scrollIntoView[true]", fe);
		
		oo.executeScript("arguments[0].click()", fe);
		
		
	}
	
}
