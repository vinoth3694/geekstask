package OopsTask10;

public class Employee {

		// the Employee class has private instance variables id, name, and salary
private int id;
private String name;
private double salary;
		
public Employee(int id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary;
}

public int getId() {
return id;
}

public String getName() {
return name;
}

public double getSalary() {
return salary;
}
	
public void raiseSalary(double percent) {
double raiseAmount = salary * percent / 100;
salary += raiseAmount;
}

Employee employee = new Employee(1, "Shakthi Vinoth", 5000.0);
System.out.println("Original Salary: " + employee.getSalary());

employee.raiseSalary(10); 
System.out.println("Updated Salary: " + employee.getSalary());
}


