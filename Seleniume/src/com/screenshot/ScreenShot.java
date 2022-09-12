package com.screenshot;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://letcode.in/edit");
        
        TakesScreenshot ff=(TakesScreenshot) driver;
        
        File screenshotAs = ff.getScreenshotAs(OutputType.FILE);
        
        File gg=new File("D:\\Selenium\\Seleniume\\TakesScreenShot\\stephen.png");
        
       FileUtils.copyFile(screenshotAs, gg);
        
		
	}

}
