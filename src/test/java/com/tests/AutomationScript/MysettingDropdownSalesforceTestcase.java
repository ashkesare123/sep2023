package com.tests.AutomationScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import  org.openqa.selenium.*;

public class MysettingDropdownSalesforceTestcase {

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
			Thread.sleep(3000);
			driver.findElement(By.id("userNavLabel")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("PersonalInfo_font")).click();
driver.findElement(By.id("LoginHistory_font")).click();
Thread.sleep(9000);
//System.out.println(driver.getTitle());

//driver.findElement(By.xpath("//*[@id=\\RelatedUserLoginHistoryList_body\"]/div/a")).click();

//JavascriptExecutor js = (JavascriptExecutor)driver;


WebElement displayandlayoutEle=
driver.findElement(By.id("DisplayAndLayout_font"));
Thread.sleep(4000);

driver.findElement(By.id("CustomizeTabs_font")).click();
Thread.sleep(4000);

WebElement dropDown=driver.findElement(By.id("p4"));
Thread.sleep(4000);
Select selectObject=new Select(dropDown);
Thread.sleep(4000);
selectObject.selectByValue("02uHu000002Rkws");
Thread.sleep(2000);

driver.findElement(By.className("selectTitle"));
Thread.sleep(4000);
Select selectObject1=new Select(dropDown);
selectObject1.selectByValue("report");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img")).click();// Add button clicked
Thread.sleep(4000);

WebElement selectedTabs=driver.findElement(By.id("duel_select_1"));
Thread.sleep(4000);
Select selectobject2=new Select(selectedTabs);
 List<WebElement> alloptions =selectobject2.getOptions();
 Thread.sleep(4000);
 
 for(WebElement option:alloptions) {
	 System.out.println(option.getText());//validation of selected tabs table by printing out
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]a")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.id("EmailSettings_font")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.id("sender_name")).sendKeys("Ashu abcd");
	 Thread.sleep(4000);
	 
	 driver.findElement(By.id("sender_email")).sendKeys("topic.volutes.0a@icloud.com");
	 Thread.sleep(4000);
	 driver.findElement(By.id("auto_bcc1")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
	 Thread.sleep(4000);
	 System.out.println(driver.getTitle());
	 driver.findElement(By.id("meSaveCompleteMessage")).getText();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("CalendarAndReminders_font")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.id("Reminders_font")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.id("testbtn")).click();
	 Thread.sleep(2000);
	 driver.switchTo().window("reminder");
	 Thread.sleep(4000);
	if (driver.findElement(By.className("tblsub trigger")).isDisplayed()) {
		System.out.println("Reminder pop window ia displayed");
	}
	else {
	System.out.println("Fail: Reminder pop up window is not displayed");	
	}
 }






	}
	}
}

