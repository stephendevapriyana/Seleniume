package com.input_me;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Stephen\\mani\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		WebElement fg = driver.findElement(By.xpath("//input[@type='text']"));
		
		fg.sendKeys("Stephen Devapriyan");
		
		WebElement fi = driver.findElement(By.id("join"));
		
		fi.sendKeys("ssss",Keys.TAB);
		
		WebElement g = driver.findElement(By.id("getMe"));
		
		String attribute = g.getAttribute("value");
		System.out.println(attribute);
		
		WebElement go = driver.findElement(By.xpath("//input[contains(@value,'Koushik')]"));
		
		go.clear();
		
		WebElement ee = driver.findElement(By.id("noEdit"));
		Thread.sleep(3000);
		boolean enabled = ee.isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
