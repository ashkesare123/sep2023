package com.tests.AutomationScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;


public class SalesForceMySettingTestCase{

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
			passwordEle.sendKeys("ideapad!123");
		System.out.println("Pasword is entered in the password field");
			driver.findElement(By.id("Login")).click();
			System.out.println("Clicked log in button");
			
			System.out.println("Log in button is Clicked and test case is passed ");
			Thread.sleep(3000);
			
			WebElement ele=driver.findElement(By.id("userNavLabel"));
			Thread.sleep(3000);
			ele.click();
			Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.id("userNavLabel"));
		Thread.sleep(3000);
		ele1.click();
		Thread.sleep(3000);
//WebElement editprofileEle= driver.findElement(By.xpath("//*[@id="\chatterTab"\]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		 
		}



	
	
		
		
		
		
		
		
		
		
	
		

	}

}
