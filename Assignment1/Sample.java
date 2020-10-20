package com.ltts.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.ltts.model.Employee;

public class Sample {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList();
		
		Employee employee1=new Employee("vijay","mysuru",10000.0);
		employeeList.add(employee1);
		Employee employee2=new Employee("kumar","mysuru",10000.0);
		Employee employee3=new Employee("ambrish","shivamogga",10000.0);
		Employee employee4=new Employee("suhas","ballary",10000.0);
		Employee employee5=new Employee("sachin","bangalore",10000.0);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		//or employeeList.add(new Emplooyee("vijay","mysuru",10000.0))
		System.out.println(employeeList);
		
		System.out.println("using iterator");
		
		Iterator<Employee> iterator =employeeList.iterator();
		
		while(iterator.hasNext()){
			Employee emp=iterator.next();
			System.out.println(emp);
			
		}
		
		System.out.println("using for loop");
		
		for(Employee employ:employeeList)
			System.out.println(employ);
		
		System.out.println("printing reverse order");
		
		ListIterator<Employee> listiter=employeeList.listIterator(employeeList.size());
		
		while(listiter.hasPrevious()){
			Employee employee=listiter.previous();
			System.out.println(employee);
		}
	}

}
