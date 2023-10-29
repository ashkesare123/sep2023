package com.tests.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DevelpoerConsoleSalesForceTestCase {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.id("username")).sendKeys("asmt@tekarch.com");
		Thread.sleep(500);
		
		driver.findElement(By.id("password")).sendKeys("ideapad!123");
		Thread.sleep(500);
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(500);
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3] ")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
