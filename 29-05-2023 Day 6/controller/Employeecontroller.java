package com.dedalus.controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.dedalus.model.*;

public class Employeecontroller implements EmployeeInterface,Serializable {
	
	Scanner sc = new Scanner(System.in);
	
	List <Employee> emplist = new ArrayList<Employee>(); 
	public void addEmployee()
	{		
		Employee emp = new Employee();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Successfully");
		
	}
	public List<Employee> getEmplist(){
		return emplist;
	}
	
	public void viewEmployee() {
		
//		System.out.println(emplist);
		emplist.forEach(e -> System.out.println(e));
	}
	public void serialize(List<Employee> emp) throws IOException{
		try {
			
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Serialized to file dedalus.txt");
			oos.close();
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		}
	}
	public void deserialize(String filename) throws IOException{
		try {
			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Employee> emp=(List<Employee>)ois.readObject();
			
			System.out.println("Deserialized from file dedalus.txt");
			Employeecontroller deserializedEC = (Employeecontroller) ois.readObject();
			for(int i=0; i<emp.size();i++){
				System.out.println("employee no."+emp.get(i).getEmpno());
				System.out.println("employee no."+emp.get(i).getEname());
				
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		} catch (ClassNotFoundException cnf) {
			System.out.println("No EmployeeController class");
		}
	}

}