package com.nutshellapp.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screencomponentpage {
	
	
		public WebDriver driver;
			
			public Screencomponentpage(WebDriver Idriver)
			{
				this.driver= Idriver;
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath="//div[@class='toolbar_type']")
			private WebElement essentialbtn;
			
			@FindBy(id="toolbar_item_create_screen")
			private WebElement screenbtn;
			
			@FindBy(id="screen_properties_label")
			private WebElement labelbtn;
			
			@FindBy(id="behaviour-header")
			private WebElement behaviourbtn;			
			
			@FindBy(id="screen_properties_start_screen")
			private WebElement setasstartscreenbtn;
			
			@FindBy(id="styling-header")
			private WebElement stylingbtn;
			
			@FindBy(id="background_image_select")
			private WebElement backgroundimgbtn;
			
			@FindBy(id="screen_properties_img_upload")
			private WebElement uplodbtn;
		
			@FindBy(id="screen_properties_chosen_image")
			private WebElement filenamebtn;
			
			@FindBy(id="sidebar_button_apply")
			private WebElement savebtn;

			public WebElement getSavebtn() {
				return savebtn;
			}

			public WebElement getEssentialbtn() {
				return essentialbtn;
			}

			public WebElement getScreenbtn() {
				return screenbtn;
			}

			public WebElement getLabelbtn() {
				return labelbtn;
			}

			public WebElement getBehaviourbtn() {
				return behaviourbtn;
			}

			public WebElement getSetasstartscreenbtn() {
				return setasstartscreenbtn;
			}

			public WebElement getStylingbtn() {
				return stylingbtn;
			}

			public WebElement getBackgroundimgbtn() {
				return backgroundimgbtn;
			}

			public WebElement getUplodbtn() {
				return uplodbtn;
			}

			public WebElement getFilenamebtn() {
				return filenamebtn;
			}

			

}
