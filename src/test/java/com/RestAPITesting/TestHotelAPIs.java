package com.RestAPITesting;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;//assertions in restassured

import java.util.HashMap;
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

public class TestHotelAPIs 
{
	/*
	 * post : 
	 * 1.using hashmap
	 * 2.using pojo=Plain old java object
	 */
  @Test
  public void createTokenUsingHashMap()
  {
	  //Request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("username","admin");
	  map.put("password","password123");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(map)
	  
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  System.out.println(res.asPrettyString());
	  String token=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+token);
	  
	  
  }
  
  
  @Test
  public void createTokenUsingPojo()
  {
	  //payload
	  AuthenticationPojo pojo=new AuthenticationPojo();
	  pojo.setUsername("admin");
	  pojo.setPassword("password123");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(pojo)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  System.out.println(res.asPrettyString());
	  String token=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+token);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
