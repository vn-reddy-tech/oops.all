package Oops;

public class polymorphism {
private String name;
private int age;
private double salary;
private String gender;


public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}


public void setAge(int age) {
	this.age = age;
}

public int getAge() {
	return age;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public double getSalary() {
	return salary;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getGender() {
	return gender;
}

public void work() {
	System.out.println(name + "is working on HEXAWARE!");
}

class Manager extends polymorphism {
	
	private String department;
	
	public void setDept(String department) {
		this.department = department;
	}
	
	public String getDept() {
		return department;
	}
	
	public void work() {
		System.out.println(getName() + " is managing " + department + " Department");
	}
	
	public void approveLeave(String employeeName) {
		System.out.println("Manager approve the leave to " + employeeName);
	}
	
	
}

public static void main(String[] args) {
	polymorphism outer = new polymorphism();
	polymorphism.Manager mgr = outer.new Manager();
	mgr.setName("Venkata narendra reddy");
	mgr.setAge(21);
	mgr.setSalary(83000.89);
	mgr.setGender("Male");
	mgr.setDept("MERN-Stack development");
	
	System.out.println("Manager Name: " + mgr.getName());
	System.out.println("Manager age: " + mgr.getAge());
	System.out.println("Manager Salary: " + mgr.getSalary());
	System.out.println("Manager Gender: " + mgr.getGender());
	System.out.println("Manager department: " + mgr.getDept());
	
	System.out.println("\n");
	polymorphism emp;
	emp = mgr;
	emp.work();
	
	
	mgr.approveLeave("Krishna kumari");




}

}

