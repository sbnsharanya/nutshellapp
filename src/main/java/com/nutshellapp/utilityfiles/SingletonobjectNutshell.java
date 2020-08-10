package com.nutshellapp.utilityfiles;

import org.openqa.selenium.WebDriver;

import com.nutshellapp.pagelocators.Loginandcreateapppage;
import com.nutshellapp.pagelocators.Screencomponentpage;
import com.nutshellapp.pagelocators.Textboxpage;




public class SingletonobjectNutshell {
public WebDriver driver;
	
	public SingletonobjectNutshell(WebDriver Idriver)
	{
		this.driver=Idriver;
			}
	
	private Loginandcreateapppage login;
	private Screencomponentpage screen;
    private Textboxpage text;

	public Loginandcreateapppage getLogin() {
		if(login==null)
		{
			login=new Loginandcreateapppage(driver);
		}
		return login;
	}
		
	public Screencomponentpage getScreen() {
		if(screen==null)
		{
			screen=new Screencomponentpage(driver);
		}
		return screen;
	}
	public Textboxpage getText() {
		if(text==null)
		{
			text=new Textboxpage(driver);
		}
		return text;
	}  
    
	

}
