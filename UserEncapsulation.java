package Oops;


import java.util.Scanner;


public class UserEncapsulation {
    private String Username;
    private String Password;
    
    public UserEncapsulation(String Username, String Password) {
    	this.Password = Password;
    	this.Username = Username;
    }
    
    public String getUsername() {
    	return Username;
    }
    
    public void setPassword(String newPassword) {
    	if(newPassword.length() >= 8) {
    		this.Password = newPassword;
    	}
    	else {
    		System.out.println("Password is Too Short");
    	}
    }
    public void DisplayUser() {
    	System.out.println("Username: " + Username);
    	System.out.println("Password: " + Password);
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Username: ");
		String Username = sc.nextLine();
		
		System.out.println("Password: ");
		String Password = sc.nextLine();
		
		UserEncapsulation ue = new UserEncapsulation(Username, Password);
		
		ue.DisplayUser();
		
		sc.close();
	}
}



