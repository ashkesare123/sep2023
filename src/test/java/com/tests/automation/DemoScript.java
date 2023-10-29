package com.tests.automation;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class DemoScript {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);
		
		WebElement usernameEle=driver.findElement(By.id("email_field"));
		usernameEle.clear();
		usernameEle.sendKeys("admin123@gmail.com");
		
		WebElement passwordEle=driver.findElement(By.id("password_field"));
		passwordEle.clear();
		passwordEle.sendKeys("admin123");
		Thread.sleep(5000);
		WebElement buttonEle=driver.findElement(By.partialLinkText("Login"));
		Thread.sleep(2000);
		buttonEle.click();
		
				
	
		
		
		
	
	}

}
