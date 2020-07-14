package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clea {
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

	WebElement t1 = driver.findElement(By.xpath("//div[@class='monthBlock first']"));
	WebElement t2 = driver.findElement(By.xpath("//div[@class='monthBlock last']"));
	
	List<WebElement> tr1 = t1.findElements(By.tagName("tr"));
	for (int i = 0; i < tr1.size(); i++) {
		List<WebElement> td1 = tr1.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < td1.size(); j++) {
			String a = td1.get(j).getText();
			System.out.println("date : " +a);
		if (a.contentEquals("30")) {
			td1.get(j).click();
			break;
			}
		}
	}

	List<WebElement> tr2 = t2.findElements(By.tagName("tr"));
	for (int i = 0; i < tr2.size(); i++) {
		List<WebElement> td2 = tr2.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < td2.size(); j++) {
			String b= td2.get(j).getText();
			System.out.println("date  :" +b);
		if (b.contentEquals("7")) {
			td2.get(j).click();
			break;
		    }
		}
	}

}
 public static void main(String[] args) throws InterruptedException {
	Clea c = new Clea();
	c.launch();
}

	
	
}