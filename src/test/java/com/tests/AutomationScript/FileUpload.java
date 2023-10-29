package com.tests.AutomationScript;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class FileUpload extends BaseTest{
	
	public static void performImageUpload() throws AWTException, InterruptedException{
		System.out.println("******performImageUpload automation script started***********");
		String expected="Student Registration Form";
		launchBrowser("firefox");
		maximiseBrowser();
		goToUrl("https://qa-tekarch.firebaseapp.com/");
		WebElement usernameEle = driver.findElement(By.id("email_field"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"admin123@gmail.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password_field"));
		enterText(passwordEle,"admin123","password textbox");
		WebElement buttonEle=driver.findElement(By.tagName("button"));
		clickElement(buttonEle,"login button");
		WebElement fileUploadLink= driver.findElement(By.xpath("//a[text()='File Upload']"));
		waitForVisibility(fileUploadLink, 30, "file upload link");
		clickElement(fileUploadLink, "file upload link");
		WebElement clearButton= driver.findElement(By.xpath("//button[text()='Clear']"));
		waitForVisibility(clearButton, 5, "clear button");
		clickElement(clearButton, "clear button");
		Thread.sleep(10000);
		WebElement browseButton= driver.findElement(By.id("logo"));
		//clickElement(browseButton, "clear button");
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", browseButton);
		//js.executeScript("window.scrollBy(0,600);");
		 StringSelection stringSelection = new StringSelection("D:\\untitled.png");
		    Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clpbrd.setContents(stringSelection, null);
		    Thread.sleep(10000);
		Robot robot=new Robot();  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		browseButton.sendKeys("D:\\Untitled.png");
		

        

	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		performImageUpload();
	}
	
}



