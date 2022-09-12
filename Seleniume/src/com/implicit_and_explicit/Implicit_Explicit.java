package com.implicit_and_explicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement web = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		web.click();
		
		
		
		
		WebElement net = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		net.sendKeys("Stephen");
		
	
		
		
		WebElement nett = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		nett.sendKeys("Devapriyan");
		
		
		
		WebElement find = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		find.sendKeys("stephendevapriyan@gmail.com");
		
	
		
		WebElement fin = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		fin.sendKeys("stephendevapriyan@gmail.com");
		
		

		WebElement element = driver.findElement(By.xpath("//input[@data-type='password']"));
		element.sendKeys("stephendevapriyan1998");
		
		
		WebElement fin1 = driver.findElement(By.name("birthday_day"));
		
	     Select o=new Select(fin1);
	     
	     o.selectByIndex(23);
	     
	     WebElement ff = driver.findElement(By.name("birthday_month"));
	     
	     Select yo=new Select(ff);
	     
	     yo.selectByIndex(4);
	     
	     WebElement ele = driver.findElement(By.name("birthday_year"));
	     
	     
	     Select ss=new Select(ele);
	     
	     ss.selectByValue("1998");
	     
	     WebElement webb = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	     
	     webb.click();
	     
	     
	     WebElement gg = driver.findElement(By.name("websubmit"));
	     
	     gg.click();
	     
	     WebDriverWait time=new WebDriverWait(driver,50);
	     
	     time.until(ExpectedConditions.visibilityOf(gg));
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}
	

}
