package com.mouses;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Bored_And_Mouse {

	
	public static  void main(String[] args) throws AWTException   {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement fi = driver.findElement(By.xpath("//a[text()='Images']"));
		
		Actions act=new Actions(driver);
		
//		act.click(fi).build().perform();
		
//		act.doubleClick(fi).build().perform();
		
//		act.moveToElement(fi).build().perform();
		
		act.contextClick(fi).build().perform();
		
		Robot r=new Robot();
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		 
		 
		
		
		
	}
	
}

