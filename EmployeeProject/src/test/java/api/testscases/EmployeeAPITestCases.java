package api.testscases;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.endpoints.EmployeeEndpoints;
import api.model.EmployeeResponse;
import api.utils.Constants;
import api.utils.PropertiesReader;
import io.restassured.response.Response;


public class EmployeeAPITestCases {	
	
	EmployeeEndpoints employeeEndpoints;
	
	public EmployeeAPITestCases()
	{
		employeeEndpoints = new EmployeeEndpoints(Constants.employeeBaseUrl);
	}
		

	
	@Test
	public void  CreateEmployeeAndValidate(String name, double salary, int age) throws IOException
	{
		
	   Response createResponse = employeeEndpoints.createEmployee(name, salary, age);
	   int actaulCode = createResponse.getStatusCode();
	   Assert.assertEquals(actaulCode, Constants.successStatusCode);
	   
	   EmployeeResponse employee = new ObjectMapper().readValue(createResponse.asString(), EmployeeResponse.class);
	   String actualName = employee.getName();
	   Assert.assertEquals(actualName, name);
	   
	   int id = employee.getId();
	   Response getResponse = employeeEndpoints.getEmployee(id);
	   int actaulGetCode = getResponse.getStatusCode();
	   Assert.assertEquals(actaulGetCode, Constants.successStatusCode);
	   
	   Properties  employeeData = PropertiesReader.readValues(Constants.propertiesFilePath);
	   String newName = employeeData.getProperty("name");
	   int newage = Integer.parseInt(employeeData.getProperty("age"));
	   
	   Response updateResponse = employeeEndpoints.updateEmployee(newName, newage, id);
	   int actaulupdateCode = updateResponse.getStatusCode();
	   Assert.assertEquals(actaulupdateCode, Constants.successStatusCode);
	   
	
	}
	

	
	
	
}
