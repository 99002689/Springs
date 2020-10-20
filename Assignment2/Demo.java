package com.ltts.training;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {

	public static void main(String[] args) {
		Employee employee1=new Employee("vijay","mysuru",1);
		Employee employee2=new Employee("kumar","mysuru",7);
		Employee employee3=new Employee("ambrish","shimogga",3);
		Employee employee4=new Employee("suhas","ballary",4);
		Employee employee5=new Employee("sachin","bangalore",5);
		
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		for (Employee employ:employeeList){
			System.out.println(employ);
		}
		
		Collections.sort(employeeList);
		System.out.println("after sorting");
		
		for (Employee employ:employeeList){
			System.out.println(employ);
		}
		
	}

}
