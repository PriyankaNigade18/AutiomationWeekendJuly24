package com.NewScenarios;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;//assertions in restassured
/*
 * given()- prerequisite 
 * --------------------------
 * headers,cookies,path parameter,query parameters,request payload,authentication
 * 
 * when()- set the request
 * ---------------------------
 * GET,POST,PUT,DELETE,PATCH
 *  
 * then()- validate request
 * ---------------------------
 * 	status code,status message,response palyload,headers,cookies
 */
public class TestParameters {
  @Test
  public void testPath_QueryParameters() 
  {
	  /*
	   * https://api.restful-api.dev/objects?id=3&id=5&id=10

BaseURL: https://api.restful-api.dev

path parameter: /objects

Query parameter: ?id=3&id=5&id=10
	   */
	  
	  RestAssured.baseURI="https://api.restful-api.dev";
	  
	  Response res=given()
	  .pathParam("path","/objects")
	  .queryParam("id",3)
	  .queryParam("id",5)
	  .queryParam("id",10)
	  
	  //.when().get("https://api.restful-api.dev/{path}");
	  .when().get("{path}");
	  
	  //geth the log
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
