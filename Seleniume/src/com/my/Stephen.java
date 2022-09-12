package com.my;

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

public class Stephen {
	
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Seleniume\\Driverr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		
		Actions at=new Actions(driver);
		
		at.contextClick(f1).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		
		
		at.contextClick(dd).build().perform();
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement er = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		
		at.contextClick(er).build().perform();
		
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
		}
		
}
}