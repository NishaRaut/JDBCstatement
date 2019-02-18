package com.bridgelabz.controler;

import java.util.Scanner;

import com.bridgelabz.jdbc.model.Employee;
import com.bridgelabz.jdbc.services.EmployeeImplem;

public class Controller{
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter the employee id:");
		int id = sc.nextInt();
		emp.setEmpId(id);
		System.out.println("Enter the employee name:");
		String name = sc1.nextLine();
		emp.setEmpName(name);
		System.out.println("Enter the employee address:");
		String address=sc1.nextLine();
		emp.setEmpAddress(address);
		System.out.println("Enter the employee technology:");
		String technology=sc1.nextLine();
		emp.setEmpTechnology(technology);
		EmployeeImplem employee = new EmployeeImplem();
		employee.createEmployee(emp);
	}
}
