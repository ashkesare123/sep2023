package com.tests.AutomationScript;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


	public class GoolelinkScript{
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			
			
			
			driver.findElement(By.partialLinkText("es")).click();
			
			String expectedTitle="Google for Small Business - Resources to get your small business online";
			
			
			 String actualTitle =driver.getTitle();
			 if(expectedTitle.equals(actualTitle)) {
				 System.out.println("testcase passed");
			 }
			 else {
				 System.out.println("testcase failed");
			
			 }
			 driver.close();
			 
		}	 

	
		

	}


