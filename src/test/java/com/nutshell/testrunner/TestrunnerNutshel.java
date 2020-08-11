package com.nutshell.testrunner;

import java.io.File;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;


import com.cucumber.listener.Reporter;
import com.nutshellapp.baseclass.BaseclassNutshell;
import com.nutshellapp.utilityfiles.FilereaderNutshell;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\test\\java\\com\\nutshell\\featurefile\\Login.feature",
            glue =   {"com.nutshell.stepdefinition"},
            plugin = { "pretty","json:src\\test\\resource\\Nutshellreports\\reports.json",
                      "html:src\\test\\resource\\Nutshellreports",
                      "junit:src\\test\\resource\\Nutshellreports\\reports.xml"},
            strict=true,	            
            monochrome=true,
            dryRun=false
            )
	
	public class TestrunnerNutshel extends BaseclassNutshell{
		
		/*public static WebDriver driver;*/

		@BeforeClass
		public static void SetupIntialization() throws Exception 
		{
			String browsername = FilereaderNutshell.frm.getConfigReader().getBrowsername();
			driver = launchBrowser(browsername);
		}
		@AfterClass
		public static void quit() throws IOException {
			//driver.quit();
						
			
		}
				
}
