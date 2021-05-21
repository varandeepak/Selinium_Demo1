package com.selinium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\Eclips Project\\Selinium_Tutorial\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		user.sendKeys("9677122100");
		WebElement password = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		password.sendKeys("divyadeepak");
		driver.findElement(By.name("login")).click();
		WebElement myprofile = driver.findElement(By.linkText("Deepak Sam"));
		myprofile.click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss_2");
		Thread.sleep(2000);
		driver.navigate().back();

		String t = driver.getTitle();
		String d = "Facebook";

		driver.close();
		if (t.equalsIgnoreCase(d)) {
			System.out.println("Test Pass");

		} else {
			System.out.println("Test Fail");
		}

	}

}
