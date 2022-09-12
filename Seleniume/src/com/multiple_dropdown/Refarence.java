package com.multiple_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Refarence {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Stephen\\mani\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement find = driver.findElement(By.id("superheros"));
		
		Select sel=new Select(find);
	
		  List<WebElement> ss = sel.getOptions();
		  
		for (WebElement web : ss) {
			
			String text = web.getText();
			System.out.println(text);
			
		}
		System.out.println("+++++++++++++++++++++");
		
		// backforwed method
		for (int i = ss.size()-1; i >0; i--) {
			
			WebElement webq = ss.get(i);
			String text = webq.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
