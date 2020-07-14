package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oyo {

	public void lanuch()  {
		System.setProperty("webdriver.chrome.driver" , "D:\\Ecllipse\\Ec_test\\MayClass\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.oyorooms.com/";
		driver.get(url);
		
		
		WebElement date = driver.findElement(By.xpath("//div[contains(@class,'oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis')]"));
		date.click();
	
		List<WebElement> from = driver.findElements(By.xpath("(//table[@class='DateRangePicker__MonthDates'])[1]//td"));
		int a = from.size();
		for (int i = 0; i < a; i++) {
			String b = from.get(i).getText();
			System.out.println("dates of may : " +b);
		if (b.equalsIgnoreCase("30")) {
			from.get(i).click();
			break;
			}
		}
		
		List<WebElement> to = driver.findElements(By.xpath("(//table[@class='DateRangePicker__MonthDates'])[2]//td"));
		int c = to.size();
		for (int j = 0; j < c; j++) {
			String d = to.get(j).getText();
			System.out.println("dates of june:" +d);
		if (d.equals("5")) {
			to.get(j).click();
			break;
			}
		}
}
	
	
public static void main(String[] args)  {
	Oyo o = new Oyo();
	o.lanuch();
}
}
