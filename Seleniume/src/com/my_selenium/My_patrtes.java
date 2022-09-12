package com.my_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_patrtes {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\java1\\Selenium_Testing\\ChromeDriver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement ss = driver.findElement(By.xpath(" //a[contains(text(),'Create New')]"));
		
		ss.click();
		
		Thread.sleep(3000);
		WebElement web = driver.findElement(By.xpath("//input[contains(@name,'first')]"));
		
		web.sendKeys("stephen");
		
		Thread.sleep(3000);
		WebElement sd = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		sd.sendKeys("devapriyan");
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		element.sendKeys("stephendevaprian@gmail.com");
		
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmatio')]"));
		
		we.sendKeys("stephendevaprian@gmail.com");
		
		
		Thread.sleep(3000);
		
		WebElement see = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		see.sendKeys("stephen1233456789");
		Thread.sleep(3000);
		WebElement td = driver.findElement(By.name("birthday_day"));
		
		Select dp=new Select(td);
		
		dp.selectByValue("24");
		Thread.sleep(3000);
		WebElement tr = driver.findElement(By.id("month"));
		
		Select sq=new Select(tr);
		sq.selectByIndex(4);
		
		Thread.sleep(3000);
		WebElement sf = driver.findElement(By.id("year"));
		
		Select hp=new Select(sf);
		
		hp.selectByValue("1998");
		Thread.sleep(3000);
		WebElement sa = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		sa.click();
		
		Thread.sleep(3000);
		WebElement so = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
		
		so.click();

}
}