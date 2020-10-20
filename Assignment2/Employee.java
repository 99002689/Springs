package com.ltts.training;

public class Employee implements Comparable<Employee>{
	public String name;
	public String city;
	public Integer empId;
	
	
	
	
	
	public Employee(String name, String city, Integer empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}



	@Override
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(employee.getName());
	}
	
	
	
	

}
