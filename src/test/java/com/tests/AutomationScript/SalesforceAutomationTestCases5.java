package com.tests.AutomationScript;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceAutomationTestCases5 {

	public static void main(String[] args)throws InterruptedException {
		
	
			System.out.println("**************Salesforce Automation Testcases Started **********");
			WebDriver driver=new 
					
					EdgeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println("URL is entered in edgebrowser");
			
			WebElement usernameEle=driver.findElement(By.id("username"));
			if (usernameEle.isDisplayed()){
				usernameEle.clear();
			usernameEle.sendKeys("asmt@tekarch.com");
			
			System.out.println("Username is entered in the field");
			}
			else {
				System.out.println("Username is not found");
			}
			
		WebElement passwordEle=driver.findElement(By.id("password"));
			if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				passwordEle.sendKeys("ideapad!123");
			System.out.println("Pasword is entered in the password field");
			}
			else {
				System.out.println("Password  is not found");
			}
	WebElement buttonEle=driver.findElement(By.id("Login"));
	if(buttonEle.isEnabled()) {
		buttonEle.click();
				System.out.println("Clicked log in button , sucessfully logged in and Home page is displayed");
			}
			else{
			{
				System.out.println("Log in button is disabled and Home page is not displayed");
			}
				
	WebElement buttonEle1=driver.findElement(By.id("userNavButton"));
	if(buttonEle1.isEnabled()) {
		buttonEle1.click();
	System.out.println(" Suceesfully clicked on User Menu dropdown");
	}
	else {
		System.out.println("usermenu dropdown is disabled");
		
	}
			}
	}
}
	
		
		
	
		
			
			
			
			

	


	
	


