package com.nutshellapp.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textboxpage {
	
	public WebDriver driver;
	
	public Textboxpage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="workflow_visuals")
	private WebElement visualbtn;
	
	@FindBy(id="toolbar_item_text")
	private WebElement textbtn;

	public WebElement getVisualbtn() {
		return visualbtn;
	}

	public WebElement getTextbtn() {
		return textbtn;
	}
	

}
