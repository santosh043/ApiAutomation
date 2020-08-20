package api.routes;

public class Route {
	
	 private static final String LIBRARY = "/api/v1";
	 
	 public static String addEmployee()
	 {
	 return LIBRARY+"/create";
		 
	 }
	 public static String getEmployee()
	 {
	 return LIBRARY+"/employee/";
		 
	 }
	 
	 public static String updateEmployee()
	 {
	 return LIBRARY+"/update/";
		 
	 }
	
	

}
