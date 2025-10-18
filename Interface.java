package Oops;

// --- Interface (Abstraction using Interface) ---
interface Employee {
    void work(); // Abstract method (no body)

    // Java 8+ allows default methods in interfaces
    default void showCompany() {
        System.out.println("Working at Tech Solutions Pvt. Ltd.");
    }
}

// --- Concrete Class implementing Interface ---
class Manager implements Employee {
    private String name;
    private int age;
    private double salary;
    private String gender;
    private String department;

    // --- Encapsulation: Getters and Setters ---
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }

    public void setGender(String gender) { this.gender = gender; }
    public String getGender() { return gender; }

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }

    // --- Implementing Interface Method ---
    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    public void approveLeave(String employeeName) {
        System.out.println("Manager approved leave for " + employeeName);
    }
}

// --- Main Class ---
public class Interface {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setName("Venkata Narendra Reddy");
        mgr.setAge(21);
        mgr.setSalary(85000);
        mgr.setGender("Male");
        mgr.setDepartment("Software Engineering");

        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Age: " + mgr.getAge());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Manager Gender: " + mgr.getGender());
        System.out.println("Manager Department: " + mgr.getDepartment());

        System.out.println("\n--- Interface in Action ---");
        mgr.showCompany(); // default method from interface
        mgr.work();        // method implementation from Manager
        mgr.approveLeave("sai santhosh");
    }
}
