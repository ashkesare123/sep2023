package com.tests.AutomationScript;





		import java.util.List;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;
		public class FirebaseAppAutomationScriptwithSyso {
		

			public static void login_to_firebase() throws InterruptedException {
				System.out.println("******login_to_firebase automation script started***********");
				String expected="Student Registration Form";
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
				WebElement studentTextEle= driver.findElement(By.xpath("/html/body/div[2]/div[2]/h1"));
				String actual= studentTextEle.getText();
				System.out.println("text is extracted from student element");
				if(actual.equals(expected))
					System.out.println("testcase passed");
				else {
					System.out.println("testcase failed");
				}
				driver.close();
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

				Thread.sleep(5000);
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

				Thread.sleep(5000);
				Thread.sleep(5000);
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

			public static void radiotest() throws InterruptedException {
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/automation-practice-form");
				Thread.sleep(10000);
				WebElement maleRadioEle= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label"));
				
				if(!maleRadioEle.isSelected()) {
					System.out.println("male radio leemnt is not selected");
					maleRadioEle.click();
				}
				if(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label")).isSelected())
					System.out.println("testcase failed");
				if(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[3]/label")).isSelected())
					System.out.println("testcase failed");
				driver.close();
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
				List<WebElement> citylist= select.getOptions();
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
			
			

			public static void main(String[] args) throws InterruptedException {
				
				login_to_firebase();
				invalid_login_to_firebase1();
				invalid_login_to_firebase2();
				//radiotest();
				firebase_Select_DropDown();
				 
			}

		

	}


