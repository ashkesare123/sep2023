package com.tests.AutomationScript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Action;

public class SalesforceAutomationTestCases4A {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("**************Salesforce Automation Testcases Started **********");
		WebDriver driver=new  EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("URL is entered in edgebrowser");
		Thread.sleep(2000);
		WebElement partialLink=	driver.findElement(By.partialLinkText("Forgot"));
		if(partialLink.isEnabled()) {
			partialLink.click();
			System.out.println("Forgot password link is cllicked");
		}
		else
		{
			System.out.println("forgot password link is disabled");
		}
		WebElement username=driver.findElement(By.id("un"));
		if (username.isDisplayed()) {
			username.clear();
			username.sendKeys("asmt@tekarch.com");
			System.out.println("username is entered in the username field");
		} else {
			System.out.println("username element is not displayed");
		}
	
		Thread.sleep(3000);
	WebElement button=driver.findElement(By.id("continue"));
	if(button.isDisplayed()){
	button.click();
		
		System.out.println("Clicked on the continue button");
		
	} else {
	
		System.out.println("continue button can not be clicked");
		
	}
	}
}
		
			
	
		
		
		
			

	

	
		

	


