package com.tests.automationSalesforce;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void driverSetup() throws InterruptedException
	{
	
	driver=new EdgeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	}
	public static void scrolldown() throws InterruptedException  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	}
	
	public static void selectUserMenu() throws InterruptedException
	{
		clickMenu();
		
		List<WebElement> pdropdowns = driver.findElements(By.xpath("//*[@id=\"userNav-menuItems\"]/a"));
	   
		List<String> expected_items = Arrays.asList("My Profile","My Settings",
				"Developer Console","Switch to Lightning Experience","Logout");
		for (WebElement wp: pdropdowns)
	    
	    {
	    	Assert.assertTrue(expected_items.contains(wp.getText())); 
	    }
	}
	

	public static void logout() throws InterruptedException
	{
		//test case 7.1
		selectUserMenu();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title=\"Logout\"]")).click();

	}
	public static void login() throws InterruptedException
	{
		driverSetup();
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("asmt@tekarch.com");
	  
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("ideapad!123");
	  
		WebElement login=driver.findElement(By.xpath("//*[@id='Login']"));
		login.click();

	}
	public static void clickMenu()
	{
		WebElement name=driver.findElement(By.id("userNavLabel"));
		name.click();
		
	}
	public static void click(String element)
	{
		driver.findElement(By.xpath(element)).click();
	}
	public static String getText(String element)
	{
		return driver.findElement(By.xpath(element)).getText();
	}

   public static void sendKeys(String element, String keyname)
   {
	   driver.findElement(By.xpath(element)).clear();
	   driver.findElement(By.xpath(element)).sendKeys(keyname);
   }
   public static void waiting() throws InterruptedException
   {
	   Thread.sleep(3000);
   }
   public static void popup()
   {
   Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"tryLexDialogX\"]")).size() > 0;
	if (isPresent == true) 
			{
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();}
			}
   
	
		
public static void closeBrowser() throws  InterruptedException
{
driver.close();
}
   }

		
			
   


	


