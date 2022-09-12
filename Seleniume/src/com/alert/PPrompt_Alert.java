package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PPrompt_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", 
			  "D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  
	  WebElement prompt = driver.findElement(By.xpath("(//a[contains(@data-toggle,'tab')] )[3]"));
		prompt.click();
		
		Thread.sleep(3000);
		WebElement prompt2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		prompt2.click();
		Thread.sleep(3000);
		Alert prompt3=driver.switchTo().alert();
		
		prompt3.sendKeys("stephen is Mossad agent_");
		
		prompt3.accept();
	  
	}

}
