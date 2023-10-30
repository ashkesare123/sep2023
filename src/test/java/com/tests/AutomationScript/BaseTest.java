package com.tests.AutomationScript;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;


 class BaseTest {
	protected static WebDriver driver=null;
	static WebDriverWait wait=null;
	
	public static void launchBrowser(String browserName) {
		switch(browserName) {
		case "firefox":driver=new FirefoxDriver();
						System.out.println("firefox browser launched");
						break;
		case "chrome":driver=new ChromeDriver();
						System.out.println("chrome browser launched");
						break;
		default: System.out.println("you have not entrered the correct browser");
		
			
		}
	}
	
	public static void goToUrl(String url) {
		driver.get(url);
		System.out.println(url+ "is entered");
	}
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
 
 
	
	public static String getPageTitle() {
		return driver.getTitle();
		
	}
		
		
		
		
		
		
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+"button is clicked");
			}
			else {
				System.out.println("button element is not enabled");
			}
	}
	
	public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time))
		.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(ElementNotInteractableException.class);
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(objectName+" is waited for visibility using fluent wait");
	}
	
	public static void waitForVisibility(WebElement ele,int time,String objectNam) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	

public static void waitUntilElementToBeClicked(By locator,String objname) {
	System.out.println("waiting for webelement"+objname+ " to be clickable");
	wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(locator));
}

public static void WaitUntilPresenceofElementLocatedBy(By locator,String objname) {
	System.out.println("waiting for web element"+objname+"for its visibility");
	wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	
	
}
public static void waitUntilPageLoad() {
	System.out.println("waiting until pageloads with 30 sec maximum time");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
}










public static void waitForAlertPresent(int time) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
	wait.until(ExpectedConditions.alertIsPresent());

}

public static void switchToWindowOpened(String mainWindowHandle) {
	Set<String> allwindowHandles=driver.getWindowHandles();
	for(String handle: allwindowHandles) {
	if(!mainWindowHandle.equalsIgnoreCase(handle));
	driver.switchTo().window(handle);}
}
	public static void dismissalert() throws InterruptedException{
		Alert alert=switchToAlert();
		alert.dismiss();
		System.out.println("Alert dismissed");
		
	}
	private static Alert switchToAlert() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void moveToElementAction(WebElement ele,String objectName) {
		Actions action =new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("Cursor is moved to Web Element"+objectName);
	
	}
	public static void ContextClickAction(WebElement ele,String objName) {
		Actions action =new Actions(driver);
		action.contextClick().build().perform();
		System.out.println("Right click is performed on webElement");
		
	}

	public static void selectByTextData(WebElement element ,String text,String objName) {
		Select selectCity =new Select(element);
		selectCity.selectByVisibleText(text);
		System.out.println(objName  + "selected" + text);
		
		
	}
	
	public static void selectByIndexData(WebElement element, int index, String ObjName) {
		waitForVisibility(element,5,ObjName);
		Select selectCity=new Select(element);
		selectCity.selectByIndex(index);
		System.out.println(ObjName  + "selected with index=" +index);
		
	}
	public static void selectByValueData(WebElement element ,String text,String objName) {
		Select selectCity=new Select(element);
		selectCity.selectByValue(text);
		System.out.println(objName + "selected ");
	}
	
	
	
	
	public static String selectFromListUsingText(List<WebElement>list,String text) {
		WebElement element=null;
		for (WebElement i :list) {
			if (i.getText().equalsIgnoreCase(text)) {
				System.out.println("Seleced=" +i.getText());
				element=i;
				break;
				return element ;
			
		
		
		
		
			
		}
	
 
	public static void	refreshPage()	{
		driver.navigate().refresh();
	}
		}			
			
		
	
	
	
	
	
	




