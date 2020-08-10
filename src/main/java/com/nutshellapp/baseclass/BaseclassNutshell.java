package com.nutshellapp.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassNutshell {
	
	public static WebDriver driver;

	public static WebDriver launchBrowser(String Browsername) throws Exception {
		try {
			if (Browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resource\\drivers\\chromedriver84.exe");
				driver = new ChromeDriver();
			} else if(Browsername.equalsIgnoreCase("firefox"))
			   {
                System.setProperty("webdriver.gecko.driver",
                   System.getProperty("user.dir") + "\\src\\test\\resource\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
               }else {
				throw new Exception("enter valid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static void dropDownWithoutOption(WebElement element, String Value) throws Exception {
		 {
		 try {
		Select dropdown = new Select(element);
		 dropdown.selectByVisibleText(Value);
		} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
		}
		 }
		  }

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static boolean elementisEnabled(WebElement enableelement) throws Exception {
		try {
			boolean enabled = enableelement.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void waitforElementvisible(WebElement visibleelement) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(visibleelement));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	 
	public static boolean elementisDisplayed(WebElement displayelement) throws Exception {
		try {
			boolean displayed = displayelement.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}	 

	public static void sendvaluestoElement(WebElement element, String Values) throws Exception {
		try {
			waitforElementvisible(element);
			if (elementisDisplayed(element) && elementisEnabled(element)) {
				element.clear();
				element.sendKeys(Values);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickonElement(WebElement element) throws Exception {
		try {
			waitforElementvisible(element);
			if (elementisDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

}

