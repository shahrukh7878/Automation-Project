package com.nucleus.qa.base;

//import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import org.json.simple.JSONObject;



public class Api {

	 public static void main(String[] args) throws Exception {
		 
		 API_01();
		 
	 }

		public static void API_01() throws Exception
		
		{
			String sRequest = "https://myfunding.ncf-sandbox.com/deleteCompanyData/09448371";
			Response response = given()
					.contentType("application/json")
					.accept("application/json")
					//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
					//.header("Authorization",sTokenkey)
					//.body(userDetails)
					.when()
					.get(sRequest)
					.then()
					//.statusCode(200)
					//.contentType("application/json")
					.extract()
					.response();
			int iResponseCode = response.getStatusCode();
			System.out.println(response.getStatusCode());
			System.out.println("-------------"+response.asString());
			System.out.println("-------------"+response.getBody().asString());
			/////////int iResponseCode = response.getStatusCode();
			System.out.println("-------------"+iResponseCode);
			System.out.println("-------------"+response.getStatusLine());
			System.out.println("-------------"+response.getHeader("content-type"));
			System.out.println("-------------"+response.getTime()+" Seconds");
			
			}

}
	 


	

			 
		
		
		
		
		

