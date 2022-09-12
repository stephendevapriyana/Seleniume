package com.selenium;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		// //tagname[text()='full text]
		WebElement web = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		web.click();
		
		Thread.sleep(3000);
		
		//tagaame[@attrbutename='attributevalue'
		WebElement net = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		net.sendKeys("Stephen");
		
		Thread.sleep(3000);
		
		//tagaame[@attrbutename='attributevalue'
		WebElement nett = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		nett.sendKeys("Devapriyan");
		
		Thread.sleep(3000);

		//tagaame[@attrbutename='attributevalue'
		WebElement find = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		find.sendKeys("stephendevapriyan@gmail.com");
		
		Thread.sleep(3000);
		//tagaame[@attrbutename='attributevalue']
		WebElement fin = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		fin.sendKeys("stephendevapriyan@gmail.com");
		
		Thread.sleep(3000);
//         //tagaame[@attrbutename='attributevalue']
		WebElement element = driver.findElement(By.xpath("//input[@data-type='password']"));
		element.sendKeys("stephendevapriyan1998");
		
		
		// this can not take x path only id name etc...
		WebElement send = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select select=new Select(send);
			select.selectByIndex(23);
//				select.selectByValue("24");
			
			
				
				WebElement pass = driver.findElement(By.name("birthday_month"));
				Thread.sleep(3000);
				Select click=new Select(pass);
				
				click.selectByIndex(4);
//                click.selectByValue("5");
//                click.selectByVisibleText("may");
                
               				
				
				
				WebElement Throw = driver.findElement(By.id("year"));		
				Thread.sleep(3000);
			Select put=new  Select(Throw);
//				put.selectByIndex(1997);
				put.selectByValue("1998");
			
			Thread.sleep(3000);
			
			// (//tagaame[@attrbutename='attributevalue'])[]
			WebElement tach = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			
			tach.click();
			
			Thread.sleep(3000);
			
			// //tagname[text()='full text]
			WebElement cmd = driver.findElement(By.xpath("//button[text()='Sign Up']"));
			
			cmd.click();
			
			
				
				
				
				
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
