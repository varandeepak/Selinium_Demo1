package com.selinium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Eclips Project\\Selinium_Tutorial\\Webdriver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
    driver.navigate().to("https://www.youtube.com");	
	WebElement id = driver.findElement(By.id("search"));
	Thread.sleep(2000);
	id.sendKeys("tamil songs");
	
	
	
	
	
	
	
	
}
	
	
	
}
