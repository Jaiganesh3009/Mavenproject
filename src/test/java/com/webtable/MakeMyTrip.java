package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
public void launch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\Ecllipse\\Ec_test\\MavenEmployee\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		String url = "https://www.makemytrip.com/flights/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("landingContainer")).click();
		
		WebElement from = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox')]"));
		from.click();
		WebElement fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromcity.sendKeys("Chennai");
		Thread.sleep(5000);
		WebElement slctfrom = driver.findElement(By.xpath("//li[@data-section-index='0']"));
		slctfrom.click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("Delhi");
		Thread.sleep(5000);
		WebElement slctto = driver.findElement(By.xpath("//label[@for='departure']"));
		slctto.click();
		Thread.sleep(3000);
		
		List<WebElement> dat = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]"));
		
		for (int i = 0; i < dat.size(); i++) {
			String b = dat.get(i).getText();
			System.out.println(b);
		if(b.equals("30")) {
			dat.get(i).click();
			break;
		}
	}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(@class,'lbl_input latoBold')])[4]")).click();
		List<WebElement> rtn = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[2]"));
		for (int i = 0; i < rtn.size(); i++) {
			String c =rtn.get(i).getText(); 
			System.out.println(c);
			if (c.equals("15")) {
				rtn.get(i).click();
				break;
				
			} 
		
		}
		
		
		
}
public static void main(String[] args) throws InterruptedException {
	MakeMyTrip m = new MakeMyTrip();
	m.launch();
}
}
