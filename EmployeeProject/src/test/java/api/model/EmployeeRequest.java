package api.model;

public class EmployeeRequest {

	String name;
	double salary;
	int age;
	
	public EmployeeRequest(String name,double salary,int age )
	{
		this.name = name;
		this.salary = salary;
		this.age = age;		
	}
	
	public EmployeeRequest(String name, int age )
	{
		this.name = name;	
		this.age = age;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
