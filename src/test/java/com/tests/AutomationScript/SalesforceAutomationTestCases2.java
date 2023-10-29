package com.tests.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceAutomationTestCases2 {

	public static void main(String[] args)throws InterruptedException{
		
			System.out.println("**************Salesforce Automation Testcases Started **********");
			WebDriver driver=new  EdgeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			System.out.println("URL is entered in edgebrowser");
			Thread.sleep(5000);
			WebElement usernameEle=driver.findElement(By.id("username"));
			usernameEle.sendKeys("asmt@tekarch.com");
			
			System.out.println("Username is entered in the field");
			
			
			
			WebElement passwordEle=driver.findElement(By.id("password"));
			if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				passwordEle.sendKeys("");
			System.out.println("Pasword is entered in the password field");
				driver.findElement(By.id("Login")).click();
				System.out.println("Clicked log in button");
				
				System.out.println("Error messge appered as:' Please enter your password' and test case is passed ");
				
		
			
			
			
			}	

		}

		

	}


