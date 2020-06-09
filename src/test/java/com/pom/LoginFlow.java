package com.pom;

public class LoginFlow extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		launchBrowser("https://www.flipkart.com/");
		Login l = new Login();
		enterText(l.getUserName(), "jaiganesh");
		enterText(l.getPassword(), "jai12345");
		clickEle(l.getCloseBtn());
		toGetText(l.getText());
		jsExecutorDown(l.getScrolDown());
		jsExecutorUp(l.getScrolUp());
		mouseOver(l.getMouseOver());
		currentUrl();
		clickEle(l.getSearch());
		enterText(l.getSearch(), "stickers");
		Thread.sleep(3000);
		robotClick(l.getSearch());
		title();
		currentUrl();	
	}
}
