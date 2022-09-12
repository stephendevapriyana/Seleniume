package com.implicit_and_explicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mani {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Seleniume\\Driverr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		 WebElement mani = driver.findElement(By.name("q"));
		 
		 mani.sendKeys("new tach");
		 
		 WebDriverWait we=new WebDriverWait(driver,60);
		 
		 we.until(ExpectedConditions.visibilityOf(mani));
		
		
		
	}

}
