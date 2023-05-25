package com.dedalus.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.dedalus.model.*;

public class Employeecontroller implements EmployeeInterface {
	
	Scanner sc = new Scanner(System.in);
	Employee emp;
	List result = new ArrayList<>(); 
	public void addEmployee()
	{		
		emp = new Employee();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setEname(ename);
		result.add(emp);
		System.out.println("Employee Added Successfully");
		
	}
	
	public void viewEmployee() {
		
		System.out.println(result);
	}

}