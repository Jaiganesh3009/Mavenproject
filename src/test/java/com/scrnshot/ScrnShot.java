package com.scrnshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrnShot {
	
public void launch() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\Ecllipse\\Ec_test\\MayClass\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		String url="https://www.zoomcar.com/chennai/";
		driver.get(url);
		
		WebElement search = driver.findElement(By.xpath("//a[@class='search']"));
		search.click();
		
		WebElement city = driver.findElement(By.xpath("//input[@type='text']"));
		city.sendKeys("T.NAGAR");
		Thread.sleep(3000);
		WebElement moveEle = driver.findElement(By.xpath("(//div[@class='pac-item'])[2]"));	
		a.moveToElement(moveEle).perform();
		a.click(moveEle).perform();
	
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Ecllipse\\Ec_test\\MayClass\\ScreenShots\\zoomcar.png");
		FileUtils.copyFile(source, target);
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ScrnShot z = new ScrnShot();
		z.launch();
	}

}
