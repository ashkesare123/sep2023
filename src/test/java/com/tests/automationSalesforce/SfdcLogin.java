package com.tests.automationSalesforce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SfdcLogin extends BaseTest{


	
	@Test(enabled=false)
	public static void loginErrorMessageTc1() throws InterruptedException
	{
		driverSetup();
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("asmt@tekarch.com");
	  
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys(" ");
		Thread.sleep(5000);
	  
		WebElement login=driver.findElement(By.xpath("//*[@id='Login']"));
		login.click();
		
		Thread.sleep(5000);
		String expectedErrorMessage=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		String actualErrorMessage="Please enter your password.";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		
		
	}
	@Test(enabled=false)
	public static void loginSaleforce() throws InterruptedException
	{
		login();
		Thread.sleep(5000);

		String actual_name=driver.findElement(By.id("userNavLabel")).getText();
		Thread.sleep(4000);
		
		Assert.assertEquals(actual_name, "Ashu abcd");	
		Thread.sleep(6000);
	}
	@Test(enabled=false)
	public static void checkRememberMe() throws InterruptedException
	{
		driverSetup();
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("asmt@tekarch.com");
	  
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("ideapad!123");
	  
		WebElement rememberMe=driver.findElement(By.xpath("//*[@id=\"rememberUn\"]"));
		rememberMe.click();
		Thread.sleep(5000);
		
		WebElement login=driver.findElement(By.xpath("//*[@id='Login']"));
		login.click();
		Thread.sleep(5000);
		
		//clickMenu();
		 logout();
		//driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
		Thread.sleep(3000);
		
		driverSetup();
		String actualUserName=driver.findElement(By.xpath("//*[@id=\"idcard-identity\"]")).getText();
		String expectedUserName="asmt@tekarch.com";
		Assert.assertEquals(expectedUserName, actualUserName);
		Thread.sleep(5000);
		
	}
	@Test(enabled=false)
	public static void forgotPassword() throws InterruptedException
	{
		driverSetup();
		Thread.sleep(4000);
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		uname.clear();
		uname.sendKeys("asmt@tekarch.com");

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
		Thread.sleep(6000);
		
		WebElement uname1=driver.findElement(By.xpath("//*[@id=\"un\"]"));
	
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		String actualMessage=driver.findElement(By.xpath("//*[@id=\"header\"]")).getText();
		String expectedMessage="Check Your Email";
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(5000);
		
		
	}
	@Test(enabled=false)
	public static void wrongCredentials() throws InterruptedException 
	{
		driverSetup();
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("123");
	  
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(" 22131");
	  
		WebElement login=driver.findElement(By.xpath("//*[@id='Login']"));
		login.click();
		Thread.sleep(5000);
		String actualErrorName=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		Thread.sleep(5000);
		String expectedUserName="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(expectedUserName, actualErrorName);
		Thread.sleep(4000);
	}
		
		@AfterTest
		public static void closeBrowser() {
		
		
	}
	}
	
	

