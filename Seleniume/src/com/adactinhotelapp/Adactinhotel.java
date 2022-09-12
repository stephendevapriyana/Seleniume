package com.adactinhotelapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("stephendeva");
		
		driver.findElement(By.id("password")).sendKeys("stephen@123");
		
	    driver.findElement(By.name("login")).click();
	    
	    WebElement ff = driver.findElement(By.id("location"));
	    
	    Select d=new Select(ff);
	    
	    d.selectByIndex(2);
	    
	    WebElement jj = driver.findElement(By.id("hotels"));
	    
	    Select a=new Select(jj);
	    
	    a.selectByValue("Hotel Hervey");
	    
	    WebElement aa = driver.findElement(By.id("room_type"));
	    
	    Select h=new Select(aa);
	    
	    h.selectByValue("Standard");
	    
	    
	    WebElement qq = driver.findElement(By.id("room_nos"));
	    
	    Select bb=new Select(qq);
	    
	    
	    
	    bb.selectByValue("2");
	    
	    WebElement aq = driver.findElement(By.id("adult_room"));
	    
	    Select f=new Select(aq);
	    
	    f.selectByVisibleText("2 - Two");
	    
	    WebElement kk = driver.findElement(By.id("child_room"));
	    
	    Select ww=new Select(kk);
	    
	    ww.selectByValue("2");
	    
	    driver.findElement(By.id("Submit")).click();
	    
	    driver.findElement(By.id("radiobutton_0")).click();
	    
	    driver.findElement(By.id("continue")).click();
	    
	    driver.findElement(By.id("first_name")).sendKeys("stephendeva");
	    
	    driver.findElement(By.id("last_name")).sendKeys("abraham");
	    
	    driver.findElement(By.id("address")).sendKeys("no 70 nethaji nager urappakm");
	    
	    driver.findElement(By.id("cc_num")).sendKeys("9876543219876543");
	    
	    WebElement ss = driver.findElement(By.id("cc_type"));
	    
	    Select tt=new Select(ss);
	    
	    tt.selectByValue("VISA");
	    
	    WebElement ddd = driver.findElement(By.id("cc_exp_month"));
	    
	    Select jjl=new Select(ddd);
	    
	    jjl.selectByValue("12");
	    
	    WebElement pp = driver.findElement(By.id("cc_exp_year"));
	    
	    Select mm=new Select(pp);
	    
	    mm.selectByValue("2022");
	    
	    driver.findElement(By.id("cc_cvv")).sendKeys("298");
	    
	    driver.findElement(By.id("book_now")).click();
	    
	    driver.findElement(By.id("my_itinerary")).click();
	    
	    
	    
	    
		
	}

}
