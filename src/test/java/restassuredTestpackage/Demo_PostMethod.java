package restassuredTestpackage;

import java.util.HashMap;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo_PostMethod {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postData(){
		map.put("FirstName", Restutils.getFirstName());
		map.put("LastName", Restutils.getLastName());
		map.put("UserName", Restutils.getUserName());
		map.put("Password", Restutils.getPassword());
		map.put("Email", Restutils.getEmail());
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}

	
	@Test
	public void testEmployee(){
		
		given()
		.contentType("application/json;charset=utf-8")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201)
		.and()
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		.and()
		.body("Message", equalTo("Operation completed successfully"));
		//.and()
		//.body("timeZone", equalTo("Central Standard Time"));
		
	}
}
