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
		public class UsermenuDropDownTestCases {

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
						Thread.sleep(5000);
						
						System.out.println("Log in button is Clicked and test case is passed ");
						Thread.sleep(3000);
						
						WebElement ele=driver.findElement(By.id("userNavLabel"));
						Thread.sleep(3000);
						ele.click();
						Thread.sleep(3000);
						
						WebElement myprofileEle=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
						
						 myprofileEle.click();
						 Thread.sleep(6000);
						// (By(//*[@id="userNav-menuItems"]/a[1]));
						
					

	WebElement editprofileEle=driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
	editprofileEle.click();
	Thread.sleep(3000);
	//good
	driver.switchTo().frame("contactInfoContentId");
	driver.findElement(By.tagName("About")).click();
						Thread.sleep(6000);					

					
	
WebElement abouttabEle	=driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
abouttabEle.click();
	Thread.sleep(6000);
	
WebElement lastnameEle	=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
lastnameEle.clear();
lastnameEle.sendKeys("Shinde");
Thread.sleep(6000);
	
WebElement savebuttonEle=driver.findElement(By.xpath("//*[@id=TabPanel]/div/div[2]/form/div/input[1]"));
savebuttonEle.click();
Thread.sleep(4000);
driver.switchTo().defaultContent();

driver.findElement(By.id("userNavLabel")).click();
Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]")).click();
if( driver.getTitle().contains("Developers console"));
System.out.println("Develpper console window is opened ");
					}else {
						
 System.out.println("Develpper console window is not opened");
 
 driver.close();
 ////*[@id="aboutTab"]/a
 


	
					}
					}
			
		
		}							
						
				
						
					
						
					
						
				
						
					
						
				
								
						
						
						
						 
						 
						
							
						
						
					
						
					
						
					
					
					
								
						
				
					
					
					
						

				

				

			




	


