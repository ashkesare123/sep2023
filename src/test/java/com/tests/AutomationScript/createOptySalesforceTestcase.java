package com.tests.AutomationScript;
import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.util.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;

public class createOptySalesforceTestcase  {

	public static void main(String[] args) throws InterruptedException {
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
		
	driver.findElement(By.className("allTabsArrow"));
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[13]/td[2]/a")).click();
	           
	Thread.sleep(5000);
	
	
	
	
		 
	
		
		
		
		
		

	}

}
