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

public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Best Sellers'][1]"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(a).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement b = driver.findElement(By.xpath("//a[text()='Mobiles'][1]"));
		
		act.contextClick(b).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement c = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		
		act.clickAndHold(c).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		int size = driver.getWindowHandles().size();
		
		System.out.println(size);
		
		String string = driver.getWindowHandle();
		System.out.println(string);
		
		
       Set<String> allw = driver.getWindowHandles();
		
		for (String sting : allw) {
			
			String title = driver.switchTo().window(sting).getTitle();
			
			System.out.println(title);
			
			String f ="Help - Amazon Customer Service";
			
			for (String string2 : allw) {
				
				if (driver.switchTo().window(string2).getTitle().equals(f)) {
					
					break;
				}
				System.out.println();
			}

		
		
		}
		
		
	}

}
