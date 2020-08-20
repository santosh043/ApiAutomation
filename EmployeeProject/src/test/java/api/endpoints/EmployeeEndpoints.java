package api.endpoints;

import java.util.List;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import api.model.EmployeeRequest;
import api.model.EmployeeResponse;
import api.routes.Route;
import api.utils.Constants;
import api.utils.PropertiesReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.fasterxml.jackson.databind.*;


public class EmployeeEndpoints {

	RequestSpecification request;
	
	public EmployeeEndpoints(String basUri)
	{		
		RestAssured.baseURI= basUri;
		request = RestAssured.given();
		request.header("Content-Type","application/json");
		request.header("Accept","application/json");		
	}
	
	public Response createEmployee(String name, double salary, int age) 
	{		
		EmployeeRequest employeeRequest = new EmployeeRequest(name, salary, age);	
	    Response response = request.body(employeeRequest).post(Route.addEmployee());		
	    return  response;	
	}
	
		
	
	  public Response getEmployee(int id) 
	  {
	  	  
	  Response response = request.get(Route.getEmployee()+"{"+id+"}");	  
	  return response;
	  
	  }	  

	  public Response updateEmployee(String name, int age, int id)  
	  {
		  EmployeeRequest employeeRequest = new EmployeeRequest(name, age);	  
	      Response response = request.body(employeeRequest).put(Route.updateEmployee()+"{"+id+"}");	  
	     return response;
	  
	  }
		
}
