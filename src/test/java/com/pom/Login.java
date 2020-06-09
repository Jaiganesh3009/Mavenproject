package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	
	public Login() {
	PageFactory.initElements(driver,this);
}

	@CacheLookup
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement userName;
    @FindBy(xpath="//input[@type='password']")
    public WebElement password;
    @FindBy(xpath="(//button[@type='submit'])[2]")
    public WebElement loginButton;
	@FindBy(xpath="//button[text()='✕']")
	public WebElement closeBtn;
	@FindBy(xpath="//span[contains(text(),'Elec')]")
	public WebElement text;
	@FindBy(xpath="//h2[text()='Grocery/Supermart']")
	public WebElement scrolDown;
	@FindBy(xpath="//span[text()='Offer Zone']")
	public WebElement scrolUp;
	@FindBy(xpath="//span[text()='Home & Furniture']")
	public WebElement mouseOver;
	@FindBy(name="q")
	public WebElement search;
	
	public WebElement getUserName() {
		return userName;}
	public WebElement getPassword() {
		return password;}
	public WebElement getLoginButton() {
		return loginButton;}
	public WebElement getCloseBtn() {
		return closeBtn;}
	public WebElement getText() {
		return text;}
	public WebElement getScrolDown() {
		return scrolDown;}
	public WebElement getScrolUp() {
		return scrolUp;}
	public WebElement getMouseOver() {
		return mouseOver;}
	public WebElement getSearch() {
		return search;}
}
