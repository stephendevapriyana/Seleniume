package com.interactwithautocomplete;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Seleniume\\ChromeDriver\\chromedriver.exe");
      
     WebDriver driver=new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.get("http://www.leafground.com/pages/autoComplete.html");
     
     WebElement gd = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
     
     gd.sendKeys("s");
     
     
     List<WebElement> ht = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
     
        for (WebElement web : ht) {
        	
        	if (web.getText().equals("Web Services")) {
        		
        		web.click();
        		System.out.println("selected"+web.getText());
        		break;
				
			}
			
		}
		
	}
     
     
      
      
	}
	

