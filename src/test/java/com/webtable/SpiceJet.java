package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {
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
	a.sendKeys(dep,"chen").perform();
	//WebElement to = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[2]"));
	//a.click(to).perform();
	//WebElement too = driver.findElement(By.xpath("(//input[@class='select_CTXT'])[2]"));
	//a.sendKeys("hon").perform();
	
	
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
	WebElement t1 = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	
	List<WebElement> tr1 = t1.findElements(By.tagName("tr"));
		for (int i = 0; i < tr1.size() ; i++) {
	List<WebElement> td1 = driver.findElements(By.tagName("td"));
		for (int j = 0; j < td1.size(); j++) {
			String b = td1.get(j).getText();
			//System.out.println(b);
		if (b.equals("31")) {
			td1.get(j).click();
			break;
			}
		}
	
	}
	
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
	WebElement t2 = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
	
	List<WebElement> tr2 = t2.findElements(By.tagName("tr"));
		for (int i = 0; i < tr2.size(); i++) {
	List<WebElement> td2 = tr2.get(i).findElements(By.tagName("td"));	
		for (int j = 0; j < td2.size(); j++) {
			String c = td2.get(j).getText();
			//System.out.println(c);
		if (c.equals("15")) {
			td2.get(j).click();
			break;
			}
		}
	}
}

public static void main(String[] args) throws InterruptedException {
	SpiceJet s = new SpiceJet();
	s.launch();
}
}
