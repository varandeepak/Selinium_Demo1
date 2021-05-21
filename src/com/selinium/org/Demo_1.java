package com.selinium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\Desktop\\Eclips Project\\Selinium_Tutorial\\Webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/*
	 * driver.get("https://www.youtube.com/"); driver.navigate()
	 * .to("https://www.youtube.com/watch?v=eYq7WapuDLU");
	 */
	driver.navigate().to("https://www.spicejet.com/");
	WebElement dep = driver.findElement(By.xpath("//a[@class='link'][1]"));
	dep.click();
WebElement depf = driver.findElement(By.xpath("//input[@class='select_CTXT'][1]"));	
depf.click();
WebElement sel = driver.findElement(By.xpath("//a[@text='Chennai (MAA)']"));
sel.click();
WebElement arr = driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));
arr.click();
WebElement ddat = driver.findElement(By.xpath("//a[@class='ui-state-default'][6]"));
ddat.click();
	
	
	
	/*
	 * WebElement user = driver.findElement(By.id("identifierId"));
	 * user.sendKeys("varandeepak1991@gmail.com"); Thread.sleep(2000);
	 * 
	 * WebElement next = driver.findElement(By.xpath("//button[@type='button'] "));
	 * next.click();
	 * 
	 * 
	 * WebElement recovery = driver.findElement(By.name("identifier"));
	 * recovery.sendKeys("9677122100"); WebElement click1 =
	 * driver.findElement(By.xpath("//button[@jsname='LgbsSe']")); click1.click();
	 */
	 
		
	
	
	
	
	}
	
	

}
