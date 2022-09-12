package com.iiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Into_Frame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement stephen = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(stephen);
		
		WebElement devapriyan = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(devapriyan);
		
		WebElement sd = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		
		sd.sendKeys("stephen devapriyan");
		
	}

}
