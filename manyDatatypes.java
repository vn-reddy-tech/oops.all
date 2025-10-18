package Oops;

public class manyDatatypes {
    int modelYear;
    String modelName;
    double modelfee;
    public manyDatatypes(int Year, String Name, double Cfee) {
        modelYear = Year;
        modelName = Name;
        modelfee = Cfee;
    }
    public static void main(String[] args) {
        manyDatatypes myD = new manyDatatypes(2021, "Dhanalakshmi college of Engineering", 139000.78);
        manyDatatypes myD1 = new manyDatatypes(2022, "sai ram", 132000.78);
        manyDatatypes myD2 = new manyDatatypes(1990, "sri vivikanandha college", 78909.0);
        manyDatatypes myD3 = new manyDatatypes(1890, "model engineering college", 78000.9);


        System.out.println(myD.modelYear + " " + myD.modelName + " " + myD.modelfee);
        System.out.println(myD1.modelYear + " " + myD1.modelName + " " + myD1.modelfee);
        System.out.println(myD2.modelYear + " " + myD2.modelName + " " + myD2.modelfee);
        System.out.println(myD3.modelYear + " " + myD3.modelName + " " + myD3.modelfee);

    }
    
}
