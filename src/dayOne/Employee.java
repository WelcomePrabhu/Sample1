package dayOne;

public class Employee {
	
	    private String name;
	    private int id;
	    private double salary;

	   
	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	
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

	 
	    public void displayDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: Rs" + salary);
	    }

	    public static void main(String[] args) {
	       
	        Employee emp1 = new Employee("prabhu", 1001, 50000);

	     
	        emp1.displayDetails();
	    }
	}


