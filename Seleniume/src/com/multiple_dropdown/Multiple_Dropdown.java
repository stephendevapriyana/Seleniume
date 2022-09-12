package com.multiple_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("superheros"));
		
		Select sel=new Select(drop);
		
		boolean multiple = sel.isMultiple();
		System.out.println(multiple);
		
		
		List<WebElement> stephen = sel.getOptions();
		
		for (WebElement all : stephen) {
			
			
			
			
	
			String text = all.getText();
			
			System.out.println(text);
		}
		System.out.println("-----find the size----");
		
		int size = stephen.size();
		System.out.println(size);
		
		for (int i = 0; i <=stephen.size(); i++) {
			
			if(i==19 || i==4 ||i==8 || i==5) {
				
				sel.selectByIndex(i);
				
			}
		}
			List<WebElement> fully = sel.getAllSelectedOptions();
			
			for(WebElement allsel : fully) {
				
				String text = allsel.getText();
				System.out.println(text);
			}
		System.out.println("firstsel==========");
			WebElement firstsel = sel.getFirstSelectedOption();
			
			String text = firstsel.getText();
			System.out.println(text);
			
			
		}
		
	

}

