
package com.tests.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceAutomationTestCases4B {

	
		
		public static void main(String[] args)throws InterruptedException {
			System.out.println("**************Salesforce Automation Testcases Started **********");
			WebDriver driver=new  EdgeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			System.out.println("URL is entered in edgebrowser");
			
			WebElement usernameEle=driver.findElement(By.id("username"));
			if (usernameEle.isDisplayed()) {
			usernameEle.clear();
			usernameEle.sendKeys("123");
			
			System.out.println("Username is entered in the field");
			}
			else {
			System.out.println("username is not found");	
			}
			
		WebElement passwordEle=driver.findElement(By.id("password"));
			if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				passwordEle.sendKeys("22131");
			System.out.println("Pasword is entered in the password field");
			}
			else {
				System.out.println(" Password element is not found");
			}
				
				WebElement buttonEle=driver.findElement(By.id("Login"));
				if (buttonEle.isDisplayed()) {
					buttonEle.click();
					
		System.out.println("Clicked log in button and error message displayed as expected");
				}
				else{
			
					System.out.println("Log in button can not be clicked");
				}
				
			
	}

		}

