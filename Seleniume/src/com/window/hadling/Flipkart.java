package com.window.hadling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  driver.get("https://www.flipkart.com/");
		  
		  WebElement gro = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		  
		  Actions ac=new Actions(driver);
		  
		  ac.contextClick(gro).build().perform();
		  
		  Robot r=new Robot();
		  
		  r.keyPress(KeyEvent.VK_PAGE_DOWN);
		  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  WebElement moblie = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		  
		  ac.contextClick(moblie).build().perform();
		  
		  r.keyPress(KeyEvent.VK_PAGE_DOWN);
		  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  WebElement fas = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		  
		  ac.contextClick(fas).build().perform();
		  
		  
		  r.keyPress(KeyEvent.VK_PAGE_DOWN);
		  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  int size = driver.getWindowHandles().size();
		  System.out.println(size);
		  
		  String windowHandle = driver.getWindowHandle();
		  
		  System.out.println(windowHandle);
		  
		  Set<String> windowHandles = driver.getWindowHandles();
		  
		  for (String string : windowHandles) {
			  
			  String title = driver.switchTo().window(string).getTitle();
			  
			  System.out.println(title);
			  
			  String a="Mobile Phones Online at Best Prices in India";

			  
			  for (String string2 : windowHandles) {
				  
				  if (driver.switchTo().window(string2).getTitle().equals(a)) {
					  break;
					
				}
				System.out.println();
	}

}
}
}