package Oops;

public class staticVSpublic {
static void myStatic() {
	System.out.println("Hitman");
}
public void myPublic() {
	System.out.println("rohit");
}

public static void main(String[] args) {
	myStatic();
	myStatic();
	myStatic();
	myStatic();
	myStatic();
	myStatic();

	
	staticVSpublic myObj = new staticVSpublic();
	myObj.myPublic();
	myObj.myPublic();
	myObj.myPublic();
	myObj.myPublic();
	myObj.myPublic();
	myObj.myPublic();
	myObj.myPublic();

}
}
