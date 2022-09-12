package com.iiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Singel_frame {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		find.sendKeys("stephen devapriyan israel");
		
		driver.switchTo().defaultContent();
		
		WebElement open = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
       open.click();
       WebElement switchh = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
       driver.switchTo().frame(switchh);
//       WebElement put = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
//       driver.switchTo().frame(put);
       driver.switchTo().frame(0);
       WebElement fiinal = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
       fiinal.sendKeys("hi");
		
		
		
	}

}
