package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spice {
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "D:\\Ecllipse\\Ec_test\\MayClass\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		Thread.sleep(3000);
		WebElement depart = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[1]"));
		a.click(depart).perform();
		WebElement dep = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[1]"));
		a.sendKeys(dep,"chenn").perform();
		
		WebElement to = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[2]"));
		a.click(to).perform();
		WebElement too = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[2]"));
		a.sendKeys(too,"hon").perform();
		
		
	}
public static void main(String[] args) throws InterruptedException {
	Spice s= new Spice();
	s.launch();
}


}

