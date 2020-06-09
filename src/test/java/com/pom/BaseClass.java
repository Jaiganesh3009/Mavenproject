package com.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver;
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Ec_test\\MayClass\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		}
	public static void enterText(WebElement ele,String value) {
		ele.sendKeys(value);
		}
	public static void clickEle(WebElement ele) {
		ele.click();
	}

	public static void toGetText(WebElement ele) {	
		System.out.println(ele.getText());
	}
	
	public static void jsExecutorUp(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",ele) ;
		System.out.println(ele.getText());
	}
	public static void jsExecutorDown(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele) ;
		System.out.println(ele.getText());
	}
	public static void mouseOver(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public static void robotClick(WebElement ele) throws Exception {
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	public static void title() {
		String t = driver.getTitle();
		System.out.println("Title : " +t);
	}

	public static void currentUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println("Current URL : " +Url);
	}

}
