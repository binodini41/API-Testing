package restassuredTestpackage;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_Getrequest {
	
	
	
	@Test
	public void getWeatherDetails(){
		
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City",equalTo("Hyderabad"))
		.header("content-encoding", "gzip");
		
		
	}
	@Test
	public void getEmployeeDetails(){
		
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("status", equalTo("success"))
		//.assertThat().body("data", equalTo("["))
		//.assertThat().body("id", equalTo("1"))
		//.assertThat().body("employee_name",equalTo("Tiger Nixon"))
		.header("content-type", "application/json;charset=utf-8");
		
	}
	
}
