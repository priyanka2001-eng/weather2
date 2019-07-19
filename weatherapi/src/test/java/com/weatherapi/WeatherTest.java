package com.weatherapi;



import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class WeatherTest {
	
	@Test
	//GET REQUEST
	public void weatherDetail() {
	RestAssured.baseURI = "http://api.openweathermap.org";
	
	int res = given().param("q", "London,uk").param("APPID", "860ca0341af22f260608e6387aaf43c7").
	when().get("/data/2.5/weather").
	then().assertThat().statusCode(200).and().extract().statusCode();
	
	if(res == 200) {
		System.out.println("Test case is passed");
	}
		else
			System.out.println("Test case is failed");
	}
}
