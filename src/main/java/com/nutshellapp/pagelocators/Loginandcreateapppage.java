package com.nutshellapp.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginandcreateapppage {
public WebDriver driver;
	
	public Loginandcreateapppage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	@FindBy(linkText="Apps")
	private WebElement applink;
	
	@FindBy(id="new-app")
	private WebElement createappbtn;
	
	@FindBy(id="app_properties_name")
	private WebElement namefield;
	
	@FindBy(id="yes")
	private WebElement createbtn;
	
	@FindBy(id="setting_phone")
	private WebElement smartphone;
	
	@FindBy(id="setting_portrait")
	private WebElement portrait;
	
	@FindBy(id="setting_yes")
	private WebElement yes;
	
	@FindBy(id="confirm")
	private WebElement confirmbtn2;

	@FindBy(id="current-workflow-name")
	private WebElement homepagetitle;
	

	public WebElement getHomepagetitle() {
		return homepagetitle;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getApplink() {
		return applink;
	}

	public WebElement getCreateappbtn() {
		return createappbtn;
	}

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getSmartphone() {
		return smartphone;
	}

	public WebElement getPortrait() {
		return portrait;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getConfirmbtn2() {
		return confirmbtn2;
	}
	
	
}
