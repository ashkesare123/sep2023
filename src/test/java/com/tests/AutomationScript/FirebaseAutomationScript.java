package com.tests.AutomationScript;


import java.awt.AWTException;
		import java.time.Duration;
		import java.util.ArrayList;
		import java.util.List;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.ElementNotInteractableException;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.FluentWait;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class FirebaseAutomationScript extends BaseTest {
			
			

			public static void login_to_firebase() throws InterruptedException {
				System.out.println("******login_to_firebase automation script started***********");
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
				WebElement studentTextEle= driver.findElement(By.xpath("/html/body/div[2]/div[2]/h1"));
				waitForVisibility(studentTextEle, 5, "student header text");
				String actual=getTextFromElement(studentTextEle,"student header text");
				if(actual.equals(expected))
					System.out.println("Pass:login_to_firebase testcase passed");
				else {
					System.out.println("Fail:login_to_firebase testcase failed");
				}
				closeBrowser();
				System.out.println("******login_to_firebase automation script ended***********");
			}
			
			
			public static void invalid_login_to_firebase1() throws InterruptedException {
				System.out.println("******invalid_login_to_firebase1 automation script started***********");
				String expected="Error : The email address is badly formatted.";
				System.out.println("expected data to be validates is=="+expected);
				WebDriver driver = new FirefoxDriver();
				driver.get("https://qa-tekarch.firebaseapp.com/");
				System.out.println("url is entered");
				Thread.sleep(5000);
				WebElement usernameEle = driver.findElement(By.id("email_field"));
				if (usernameEle.isDisplayed()) {
					usernameEle.clear();
					System.out.println("username field is cleared");
				} else {
					System.out.println("username element is not displayed");
				}
				WebElement passwordEle = driver.findElement(By.id("password_field"));
				if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				System.out.println("password field is cleared");
				}
				else {
					System.out.println("password element is not displayed");
				}
				WebElement buttonEle=driver.findElement(By.tagName("button"));
				if(buttonEle.isEnabled()) {
				buttonEle.click();
				System.out.println("button is clicked");
				}
				else {
					System.out.println("button element is not enabled");
				}

				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.alertIsPresent());
				
				Alert loginerrorAlert= driver.switchTo().alert();
				String actual= loginerrorAlert.getText();
				System.out.println("text is extracted from alert box is=="+actual);
				loginerrorAlert.accept();
				
				if(actual.equals(expected))
					System.out.println("testcase passed");
				else {
					System.out.println("actual data is not matching expected data so testcase failed");
				}
				driver.close();
				System.out.println("******invalid_login_to_firebase1 automation script ended***********");
			}
			
		public static void invalid_login_to_firebase2() throws InterruptedException {
				
				System.out.println("******invalid_login_to_firebase2 automation script started***********");
				String expected="Error : The password is invalid or the user does not have a password.";
				System.out.println("expected data to be validates is=="+expected);
				WebDriver driver = new FirefoxDriver();
				driver.get("https://qa-tekarch.firebaseapp.com/");
				System.out.println("url is entered");
				Thread.sleep(5000);
				WebElement usernameEle = driver.findElement(By.id("email_field"));
				if (usernameEle.isDisplayed()) {
					usernameEle.clear();
					usernameEle.sendKeys("admin123@gmail.com");
					System.out.println("username is entered in the username field");
				} else {
					System.out.println("username element is not displayed");
				}

				WebElement passwordEle = driver.findElement(By.id("password_field"));
				if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				System.out.println("password field is cleared");
				}
				else {
					System.out.println("password element is not displayed");
				}
				
				WebElement buttonEle=driver.findElement(By.tagName("button"));
				if(buttonEle.isEnabled()) {
				buttonEle.click();
				System.out.println("button is clicked");
				}
				else {
					System.out.println("button element is not enabled");
				}

				
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.alertIsPresent());
				
				Alert loginerrorAlert= driver.switchTo().alert();
				
				String actual= loginerrorAlert.getText();
				loginerrorAlert.accept();
				
				if(actual.equals(expected))
					System.out.println("testcase passed");
				else {
					System.out.println("testcase failed");
				}
				
				driver.close();
				System.out.println("******invalid_login_to_firebase2 automation script ended***********");
			}

			
			
			public static void firebase_Select_DropDown() throws InterruptedException {
				System.out.println("******firebase_Select_DropDown automation script started***********");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://qa-tekarch.firebaseapp.com/");
				System.out.println("url is entered");
				Thread.sleep(5000);
				WebElement usernameEle = driver.findElement(By.id("email_field"));
				if (usernameEle.isDisplayed()) {
					usernameEle.clear();
					usernameEle.sendKeys("admin123@gmail.com");
					System.out.println("username is entered in the username field");
				} else {
					System.out.println("username element is not displayed");
				}

				WebElement passwordEle = driver.findElement(By.id("password_field"));
				if(passwordEle.isDisplayed()) {
				passwordEle.clear();
				passwordEle.sendKeys("admin123");
				System.out.println("password is entered in the password field");
				}
				else {
					System.out.println("password element is not displayed");
				}
				
				WebElement buttonEle=driver.findElement(By.tagName("button"));
				if(buttonEle.isEnabled()) {
				buttonEle.click();
				System.out.println("button is clicked");
				}
				else {
					System.out.println("button element is not enabled");
				}
				Thread.sleep(5000);
				WebElement cityDropDownEle= driver.findElement(By.xpath("//*[@id=\"city\"]"));
				if(cityDropDownEle.isDisplayed()) {
					System.out.println("city select drop down is displayed");
				Select select=new Select(cityDropDownEle);
				select.selectByIndex(3);
				//select.deselectByValue("goa");
				ArrayList<WebElement> citylist=(ArrayList<WebElement>) select.getOptions();
				
				
				for(WebElement ele:citylist) {
					System.out.println(ele.getText());
				}
				}
				else {
					System.out.println("city select drop down is not visible");
				}
				
				driver.close();
				System.out.println("******firebase_Select_DropDown automation script ended***********");
				
			}
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
			

			public static void main(String[] args) throws InterruptedException {
				
				login_to_firebase();
				//invalid_login_to_firebase1();
				//invalid_login_to_firebase2();
				//firebase_Select_DropDown();
				//performImageUpload();
				 
			}

		
	}


