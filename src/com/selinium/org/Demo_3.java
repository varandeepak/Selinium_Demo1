package com.selinium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\Eclips Project\\Selinium_Tutorial\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement searchtab = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		
		searchtab.sendKeys("Iphone");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		WebElement clickbox = driver.findElement(By.linkText("OnePlus"));
		Thread.sleep(2000);
		clickbox.click();
		driver.navigate().to("https://www.youtube.com/watch?v=FRn5J31eAMw");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}

}
