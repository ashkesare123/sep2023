package com.tests.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class FirstScript {

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//
		driver.get("https://www.google.com");
		WebElement searchBoxEle=driver.findElement(By.name("q"));
		searchBoxEle.sendKeys("selenium");
		Thread.sleep(5000);
		WebElement button =driver.findElement(By.name("btnK"));
		button.click();
		
		System.out.println("completed");
		driver.close();
		
	}
}


