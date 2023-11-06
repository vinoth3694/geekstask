package com.example.hr;

public class Employee {
	
		private String name;
	    private int id;
	    private double salary;
	    // Constructor
	    public Employee() {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }
	    
	 // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }
		public void setId(int id) {
			this.id = id;
		}

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    
	    
	    // Method to print the employee's name
	    public void printName() {
	        System.out.println("Employee Name: " + this.name);
	    }
	    
	    	// Method to print the employee's salary
	    public void printSalary() {
	        System.out.println("Employee Salary: " + this.salary);
	    }
	}


