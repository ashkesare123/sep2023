package com.tests.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceAutomationTestCases3 {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new  EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("URL is entered in edgebrowser");
		
		WebElement usernameEle=driver.findElement(By.id("username"));
		usernameEle.sendKeys("asmt@tekarch.com");
		
		
		System.out.println("Username is entered in the field");
		
		
		
		WebElement passwordEle=driver.findElement(By.id("password"));
		if(passwordEle.isDisplayed()) {
			passwordEle.clear();
			passwordEle.sendKeys("ideapad!123");
		System.out.println("Pasword is entered in the password field");
		driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.id("Login")).click(); 
			
			System.out.println("Clicked log in button and checked the Remember me checkbox");
			
			System.out.println("Sucessfully logged in salesforce application and home page is displayed");
			
	
		
		
		
		}	

	}



	}


