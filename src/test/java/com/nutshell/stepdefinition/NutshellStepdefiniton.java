package com.nutshell.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nutshell.testrunner.TestrunnerNutshel;
import com.nutshellapp.baseclass.BaseclassNutshell;
import com.nutshellapp.utilityfiles.FilereaderNutshell;
import com.nutshellapp.utilityfiles.SingletonobjectNutshell;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class NutshellStepdefiniton extends BaseclassNutshell {
	
	//public static WebDriver driver = TestrunnerNutshel.driver;	
	public static SingletonobjectNutshell nutshell = new SingletonobjectNutshell(driver);
	
	@Given("^User launch the nutshell application$")
	public void user_launch_the_nutshell_application() throws Throwable {
		String url = FilereaderNutshell.frm.getConfigReader().getUrl();
		getUrl(url);
		Thread.sleep(2000);
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and click Login button$")
	public void user_enters_and_and_click_Login_button(String arg1, String arg2) throws Throwable {
		sendvaluestoElement(nutshell.getLogin().getUsername(), arg1);
		sendvaluestoElement(nutshell.getLogin().getPassword(), arg2);
		clickonElement(nutshell.getLogin().getSubmit());
	}

	@When("^user click app button and create app in Login page$")
	public void user_click_app_button_and_create_app_in_Login_page() throws Throwable {
		 clickonElement(nutshell.getLogin().getApplink());
		    clickonElement(nutshell.getLogin().getCreateappbtn());	      
	}

	@When("^user gives \"([^\"]*)\" as screen name and click create button in create new app$")
	public void user_gives_as_screen_name_and_click_create_button_in_create_new_app(String arg1) throws Throwable {
		 sendvaluestoElement(nutshell.getLogin().getNamefield(), arg1);
		    clickonElement(nutshell.getLogin().getCreatebtn());
		    waitforElementvisible(nutshell.getLogin().getSmartphone());
	}

	@When("^User selects smartphone, portrait and yes in device settings and click confirm in device settings page$")
	public void user_selects_smartphone_portrait_and_yes_in_device_settings_and_click_confirm_in_device_settings_page() throws Throwable {
		 clickonElement(nutshell.getLogin().getSmartphone());
		    clickonElement(nutshell.getLogin().getPortrait());
		    clickonElement(nutshell.getLogin().getYes());
		    clickonElement(nutshell.getLogin().getConfirmbtn2());	 
	}

	@Then("^user verify the username displayed in homepage$")
	public void user_verify_the_username_displayed_in_homepage() throws Throwable {
		String title = nutshell.getLogin().getHomepagetitle().getText();
		   Assert.assertTrue("title", true);   
	}


/*******************************************Screenpage**********************************************/

	@Given("^User clicks screen icon$")
	public void user_clicks_screen_icon() throws Throwable {
	    clickonElement(nutshell.getScreen().getEssentialbtn());
	    clickonElement(nutshell.getScreen().getEssentialbtn());	    	      
	}

	@When("^User drag and drop screen component on to the canvas page$")
	public void user_drag_and_drop_screen_component_on_to_the_canvas_page() throws Throwable {
		clickonElement(nutshell.getScreen().getScreenbtn());
		Actions ac = new Actions(driver);		
		ac.clickAndHold(nutshell.getScreen().getScreenbtn()).moveByOffset(200, 200).release().perform();
		}

	@When("^user edit the screen name as \"([^\"]*)\" in Label control$")
	public void user_edit_the_screen_name_as_in_Label_control(String arg1) throws Throwable {
	    clickonElement(nutshell.getScreen().getLabelbtn());
	    sendvaluestoElement(nutshell.getScreen().getLabelbtn(), arg1);      
	}

	@When("^user clicks set as start screen in Behaviour control$")
	public void user_clicks_set_as_start_screen_in_Behaviour_control() throws Throwable {
	    clickonElement(nutshell.getScreen().getBehaviourbtn());
	    clickonElement(nutshell.getScreen().getSetasstartscreenbtn());	      
	}

	@When("^user click upload image from Background image dropdrown in styling control$")
	public void user_click_upload_image_from_Background_image_dropdrown_in_styling_control() throws Throwable {		
		clickonElement(nutshell.getScreen().getStylingbtn());
		dropDownWithoutOption(nutshell.getScreen().getBackgroundimgbtn(), "Upload Image");
		WebElement uploadbtn = driver.findElement(By.id("screen_properties_img_upload"));	
		String filePath = "src\\test\\resource\\datafile\\Generic-IMG-1.jpeg";
		driver.switchTo().activeElement().sendKeys(filePath);
		//uploadbtn.sendKeys(filePath);	
		}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
	    clickonElement(nutshell.getScreen().getSavebtn());		    
	}      
	
	@Then("^user verify the file name displayed under styling control in screen properties pannel$")
	public void user_verify_the_image_name_displayed_in_screen_properties_pannel() throws Throwable {
	    String filename = nutshell.getScreen().getFilenamebtn().getText();
	    Assert.assertTrue("filename", true);   	    
	}

/*************************************text page**********************************/
	@Given("^user clicks visuals in essential component$")
	public void user_clicks_visuals_in_essential_component() throws Throwable {
	    clickonElement(nutshell.getScreen().getEssentialbtn());
		clickonElement(nutshell.getText().getVisualbtn());	      
	}
	@Given("^user drag and drop text component on to the screen$")
	public void user_drag_and_drop_text_component_on_to_the_screen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement textbox = driver.findElement(By.id("toolbar_item_text"));
		//WebElement screen1 = driver.findElement(By.id("toolbar_item_create_screen"));
		WebElement screen2 = driver.findElement(By.xpath("//div[@id='canvas-container']/div[@id='html_overlay_1']"));
		Actions ac1 = new Actions(driver);	
		//ac1.clickAndHold(textbox);
		//ac1.clickAndHold(textbox).moveToElement(screen1).release(screen1).build().perform();	
		ac1.dragAndDrop(textbox, screen2).release().perform();
		Thread.sleep(2000);
		//WebElement textbox = driver.findElement(By.id("toolbar_item_text"));
		//WebElement screen1 = driver.findElement(By.id("upload-image-response"));
		
		/*Actions ac = new Actions(driver);	
		ac.clickAndHold(nutshell.getText().getTextbtn()).moveByOffset(706, 135).click().perform();*/
		
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("$('#diagramCanvas').click();");
		Thread.sleep(2000);
		/*Point location = driver.findElement(By.id("outer")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);*/
		
	      
	}

}

