package SingleTon;

public class SingleClass {
    //declare global variable ;
    //Create private default constructor () { }
    //Create public parameter constructor() { }
    //create private static object ();
    //Create public static ClassName methodName() { return  ;}

    // what is singleTon concept?

    String fName;
    String lName;
    String address;

    private SingleClass(){

    }

    public SingleClass(String fName) {
        this.fName = fName;
    }

    public SingleClass(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    private static SingleClass myObj= new SingleClass();

    public static SingleClass myMethod(){
        return myObj;
    }
















}
