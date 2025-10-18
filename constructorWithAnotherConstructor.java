package Oops;

public class constructorWithAnotherConstructor {
	
	
	int ModelYear;
	String ModelName;
	public constructorWithAnotherConstructor(String Modelname) {
		this(2020 , Modelname);
	}
	
	public constructorWithAnotherConstructor(int modelYear,String modelName) {
		this.ModelYear = modelYear;
		this.ModelName = modelName;
		
	}
	
	public void printInfo() {
		System.out.println(ModelYear + " " + ModelName);
	}
	
	public static void main(String[] args) {
		constructorWithAnotherConstructor car1 = new constructorWithAnotherConstructor("B M W");
		constructorWithAnotherConstructor car2 = new constructorWithAnotherConstructor(1667,"farari");
		
		car1.printInfo();
		car2.printInfo();
		
	}

}
