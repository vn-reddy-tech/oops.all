package Oops;

public class ModifyObject {
    double x;
    double y;
    public static void main(String[] args) {
        ModifyObject myObj = new ModifyObject();
        myObj.x = 56.90;
        myObj.y = 68.90;
        
        System.out.println(Math.ceil(myObj.x + myObj.y));
    }
}
