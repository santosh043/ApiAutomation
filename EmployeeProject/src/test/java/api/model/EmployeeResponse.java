package api.model;

public class EmployeeResponse {

	String name;
	double salary;
	int age;
	int id;
	
	public EmployeeResponse(String name,double salary,int age, int id )
	{
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.id = id;
		
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
