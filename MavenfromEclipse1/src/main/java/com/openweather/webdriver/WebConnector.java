package com.openweather.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.reports.ExtentManager;

public class WebConnector {

	WebDriver driver;
	Properties prop;
	public ExtentReports rep;
	public ExtentTest scenario;
	public WebConnector() throws IOException {
		//All locators and application URL to be read from properties file
		if(prop==null) {
			
			try {
				prop = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
	}

	public void openBrowser(String browserName) {
		
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Plugin\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public void navigate(String urlKey) {
		driver.get(prop.getProperty(urlKey));
	}
	
	public void click(String objectKey) {
		driver.findElement(By.xpath(prop.getProperty(objectKey))).click();
	}
		
	public void type(String objectKey, String data) {
		driver.findElement(By.xpath(prop.getProperty(objectKey))).sendKeys(data);
	}

	
	
	public boolean isElementPresent(String locatorKey) {
	List<WebElement> e =driver.findElements(By.xpath(prop.getProperty(locatorKey)));
	
	
	
	if(e.size()==0)
		return false;
				
		else {
			return true;
		}
	}

	public void fieldPresent(String locatorName) {
		boolean result = isElementPresent(locatorName);
		
		if(result==true) {
			System.out.println("Expected data " +locatorName+" is found and test case is pass");
		}
		else
			System.out.println("Expected data is not found and hence this case is failed");
	}
	
	public void quit() {
		if(rep!=null)
			rep.flush();
		if(driver !=null)
			driver.quit();
	}
	
	public void initReports(String scenarioName) {
		rep = ExtentManager.getInstance(System.getProperty("user.dir")+"\\Plugin");
		scenario = rep.createTest(scenarioName);
		scenario.log(Status.INFO, "Starting " +scenarioName);
	}
	
	public void infoLog(String msg) {
		scenario.log(Status.INFO, msg);
	}

	public void totalLinks(String locatorKey) {
		List<WebElement> e =driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		
		int finalsize = e.size();
		System.out.println(finalsize);
		if(finalsize == Integer.parseInt(prop.getProperty("totalLinks"))){
			System.out.println("Test Case is pass");
		}
		else
			System.out.println("Test case is failed");
	}
	}
	

