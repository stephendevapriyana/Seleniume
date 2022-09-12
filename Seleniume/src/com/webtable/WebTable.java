package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
//		List<WebElement> allget = driver.findElements(By.xpath("//table/tbody/tr/td"));
//		
//		for (WebElement web : allget) {
//			
//			String text = web.getText();
//			System.out.println(text);
//			
//		}
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
		
		for (WebElement web : row) {
			
			String text = web.getText();
			System.out.println(text);
			
		}
		
		List<WebElement> tc = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for (WebElement we : tc) {
			
			String text = we.getText();
			System.out.println(text);
		}
		
		List<WebElement> trtd = driver.findElements(By.xpath("//table/tbody/tr[7]/td[5]"));
		
		for (WebElement webE: trtd) {
			
			String text = webE.getText();
			System.out.println(text);
		}
		
	}

}
