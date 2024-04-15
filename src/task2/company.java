package task2;


	import java.util.ArrayList;

import dayOne.Employee;

	public class company {
	    private String name;
	    private ArrayList<Employee> employees;

	    // Constructor
	    public company(String name) {
	        this.name = name;
	        this.employees = new ArrayList<>();
	    }

	    // Method to add an employee to the company
	    public void hireEmployee(Employee employee) {
	        employees.add(employee);
	    }

	    // Method to remove an employee from the company
	    public void fireEmployee(Employee employee) {
	        employees.remove(employee);
	    }

	    // Method to display all employees of the company
	    public void displayEmployees() {
	        System.out.println("Employees of " + name + ":");
	        for (Employee emp : employees) {
	            emp.displayDetails();
	            System.out.println("----------------------");
	        }
	    }

	    public static void main(String[] args) {
	        // Creating a company
	        company Company = new company("TechCorp");

	        // Hiring employees
	        Employee emp1 = new Employee("Prabhu", 1001, 50000);
	        Employee emp2 = new Employee("GIRI", 1002, 60000);
	        Company.hireEmployee(emp1);
	        Company.hireEmployee(emp2);

	        // Displaying employees
	        Company.displayEmployees();
	    }
	}


