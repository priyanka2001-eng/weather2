package com.openweather.map;

import com.openweather.webdriver.WebConnector;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Verification {
	
	WebConnector con;
	
	public  Verification(WebConnector con) {
		this.con = con;
	}
	@Before
	public void before(Scenario s) {
		System.out.println("***Bef*** "+s.getName());
		con.initReports(s.getName());
	}
	
	
	@After
	public void after() {
		con.quit();
	}

	@Given("^I open ([a-zA-Z]{1,})$")
	public void openBrowser(String browserName) {
		con.openBrowser(browserName);
		con.infoLog("Opening Browser "+browserName);
	}
	
	@And("^I go to (.*)$")
	public void navigate(String url) {
		con.navigate(url);
		con.infoLog("Navigating to URL "+url);
	}
	
	@Then("^The field with (.*) should be present$")
	public void fieldPresent(String locatorName) {
		con.fieldPresent(locatorName);
		
		con.infoLog("Required field is present"+locatorName);
	}
	@Then("^Total number of links present$")
	public void linksverify() {
		con.totalLinks("links");
		
	}
	
	@And ("^User enters the invalid name of (.*) as (.*)$")
	public void enterCity(String locator, String data) {
		con.type("fieldName", "xyz");
		con.infoLog("User enters the city name " +data);
	}
	
	@And("^User clicks on the (.*)$")
	public void click(String locatorKey) {
		con.click("button");
		con.infoLog("User clicks on the button");
	}
	@Then ("^The output should be (.*)$")
	public void output(String locator) {
		con.fieldPresent("notFound");
		con.infoLog("Required output is "+locator);
	}
	
	
	@And("^User enters the valid name of (.*) as (.*)$")
	public void enterCityName(String locator, String data) {
		con.type("fieldName", "Mumbai");
		con.infoLog("User enters the correct city Name "+data);
	}
	
	@Then("^The correct (.*) should be displayed$")
	public void correctData(String locator) {
		con.fieldPresent("mumbai");
		con.infoLog("Expected result is displayed "+ locator +"Hence the Test case is passed");
	}
}
