package com.example.hrtest;


	import com.example.hr.Employee;

	public class EmployeeTest {
		public static void main(String[] args) {
	        // Creating an instance of the Employee class
	        Employee employee = new Employee();
	        
	     // Set the employee's name, ID, and salary
	        employee.setName("Punna Niteesh Kumar");
	        employee.setId(500035);
	        employee.setSalary(60000.0);

	        // Call the methods to print the employee's name and salary
	        employee.printName();
	        employee.printSalary();

		}
	}

}
