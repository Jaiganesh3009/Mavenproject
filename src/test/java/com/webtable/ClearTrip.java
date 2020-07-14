package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public void launch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" , "D:\\Ecllipse\\Ec_test\\MayClass\\drivers\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	String url = "https://www.cleartrip.com/";
	driver.get(url);
	Thread.sleep(3000);
	WebElement trip = driver.findElement(By.xpath("//input[@id='RoundTrip']"));
	trip.click();
	WebElement from = driver.findElement(By.xpath("//input[@etitle='From']"));
	from.click();
	from.sendKeys("Chennai");

	WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
	to.click();
	to.sendKeys("Delhi");
	
	
	WebElement date = driver.findElement(By.xpath("//input[@title='Depart date']"));
	date.click();
	
	List<WebElement> frmdates = driver.findElements(By.xpath("//div[@class='monthBlock first']//td"));
	int frmall = frmdates.size();
	for (int i = 0; i < frmall; i++) {
		String a = frmdates.get(i).getText();
		System.out.println("date : " +a);
	if (a.equals("28")) {
		frmdates.get(i).click();
		break;
		}}
	List<WebElement> todates = driver.findElements(By.xpath("//div[@class='monthBlock last']//td"));
	int toall = todates.size();								 
	for (int j = 0; j < toall; j++) {
		String b = todates.get(j).getText();
		if (b.equals("18")) {
		todates.get(j).click();
		break;
		
		}
	}
	
	}
	
	
	
//	Thread.sleep(3000);
//	WebElement adult = driver.findElement(By.id("Adults"));
//	Select c =  new Select(adult);
//	c.selectByVisibleText("8");
//	
//	WebElement child = driver.findElement(By.id("Childs"));
//	Select d =  new Select(child);
//	d.selectByVisibleText("4");
//	
//	WebElement infant = driver.findElement(By.id("Infants"));
//	Select e =  new Select(infant);
//	e.selectByVisibleText("2");
//	
//	}


	public static void main(String[] args) throws InterruptedException {
		ClearTrip c = new ClearTrip();
		c.launch();
	}
}