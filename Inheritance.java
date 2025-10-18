package Oops;


public class Inheritance {
    private String name;
    private int age ;
    private double salary;
    private String gender;
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName(){
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
    public double setSalary() {
    	return salary;
    }
    public void setGender(String gender) {
    	this.gender = gender;
    }
    public String setGender() {
    	return gender;
    }
    
    
    class manager extends Inheritance {
    	private String department;
    	
    	public void setDepartment(String department) {
    		this.department = department;
    	}
    	
    	public String getDepartment() {
    		return department;
    	}
    	
    	    	    }
    public void approveLeave(String EmployeeName) {
    	System.out.println("Manager approve the leave for " + EmployeeName);

    }

    

    public static void main(String[] args) {
        Inheritance outer = new Inheritance();
        Inheritance.manager mgr = outer.new manager();
        mgr.setName("Venkata Narendra Reddy");
        mgr.setAge(21);
        mgr.setSalary(85000);
        mgr.setGender("Male");
        mgr.setDepartment("Software Engineering");

        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Age: " + mgr.getAge());
        System.out.println("Manager Salary: " + mgr.setSalary());
        System.out.println("Manager Gender: " + mgr.setGender());
        System.out.println("Manager Department: " + mgr.getDepartment());
        
        
        System.out.println("\n");

        mgr.approveLeave("Rohit Sharma");
    }
    
}

   

