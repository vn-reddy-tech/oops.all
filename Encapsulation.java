package Oops;

public class Encapsulation {
   
    private String name;
    private int age;
    private double salary;
    private String Address;
    private String Gender;


    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
    
    public String getAddress() {
    	return Address;
    }
    
    public void setAddress(String address) {
    	this.Address = address;
    }
    public String getGender() {
    	return Gender;
    }
    public void setGender(String Gender) {
    	this.Gender = Gender;
    }

    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();
        emp.setName("Venkata narendra reddy");
        emp.setAge(21);
        emp.setSalary(50000);
        emp.setAddress("peddi veedu kothapalli, rayachoty, 516268, andhra pradesh");
        emp.setGender("MALE");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee address: " + emp.getAddress());
        System.out.println("Employee Gender: " + emp.getGender());
    }
}