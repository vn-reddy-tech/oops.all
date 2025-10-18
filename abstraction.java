package Oops;


public class abstraction {
	

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
	   this.name = name;
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
}
   
   class Manager extends abstraction{
	   private String department;
	   
	   public void setDept(String department) {
		   this.department = department;
	   }
	   
	   public String getDept() {
		   return department;
	   }
	  public void work() {
		  System.out.println(getName() + " is managing the " + department + " Department");
	  }
	  
	  public void approveLeave(String Employeename) {
		  System.out.println("Manager approve the leave to " + Employeename);
	  }
	  
	  
	   
   }
   
   public static void main(String[] args) {
	abstraction outer = new abstraction();
	abstraction.Manager mgr= outer.new Manager();
	mgr.setName("Venkata narendra reddy");
	mgr.setAge(21);
	mgr.setSalary(36763.09);
	mgr.setDept("Mern-Stack");
	mgr.setGender("Male");
	
	System.out.println("Manger name: " + mgr.getName());
	System.out.println("Manager age: " + mgr.getAge());
	System.out.println("Manager salary: " + mgr.getSalary());
	System.out.println("Manager Department: " + mgr.getDept());
	System.out.println("Manager Gender: " + mgr.getGender());
	
	System.out.println("\n");
	mgr.work();
	
	mgr.approveLeave("puttu pavan kumer");
}
   
   
   
   
   

}

