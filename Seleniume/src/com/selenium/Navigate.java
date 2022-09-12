package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", 
			 "D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
	 
	
	      WebDriver deva=new ChromeDriver();
	      
	      deva.get("https://web.whatsapp.com/");
	      
	      deva.navigate().to("https://www.facebook.com/");
	      
	      deva.navigate().to("https://www.instagram.com/");
	      
	      deva.navigate().to("https://twitter.com/");
	      
	      deva.navigate().back();
	      
	      deva.navigate().forward();
	      
	      deva.navigate().refresh();
	      
	      
	      
	      deva.close();
	      
	      deva.quit();
	 
	}

}
