package SingleTon;

public class Single_TonLearn {
    //declare global variable ;
    //Create private default constructor () { }
    //Create public parameter constructor() { }
    //create private static object ();
    //Create public static ClassName methodName() { return  ;}

//==================================================================================================================
    int num1;
    int num2;
    int num3;

    private Single_TonLearn(){
        System.out.println("kjdfksfksh");
    }

    public Single_TonLearn(int num1) {
        this.num1 = num1;
    }

    public Single_TonLearn(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
  private static Single_TonLearn abcdObj= new Single_TonLearn();
    public static Single_TonLearn abcMethod(){
        return  abcdObj;
    }


//====================================================================================================================
//    String fName;
//    String mName;
//    String lName;
//
//    private Single_TonLearn() {
//        System.out.println("This is my default constructor");
//    }
//
//    public Single_TonLearn(String fName) {
//        this.fName = fName;
//        System.out.println("this is my single constructor");
//    }
//
//    public Single_TonLearn(String fName, String mName, String lName) {
//        this.fName = fName;
//        this.mName = mName;
//        this.lName = lName;
//        System.out.println("this is my multiple constructor");
//    }
//
//    private static Single_TonLearn getPrivateObg=new Single_TonLearn();
//
//    public static Single_TonLearn getMethod() {
//        System.out.println("Return type Method");
//        return getPrivateObg;
//    }
//=======================================================================================================================
//    String item1;
//    double price1;
//
//    private Single_TonLearn() {
//
//    }
//
//    public Single_TonLearn(String item1) {
//        this.item1 = item1;
//    }
//
//    public Single_TonLearn(String item1, double price1) {
//        this.item1 = item1;
//        this.price1 = price1;
//    }
//
//    private static Single_TonLearn callMethod = new Single_TonLearn();
//
//    public static Single_TonLearn setCallMethod() {
//        System.out.println("this is my public method ");
//        return callMethod;
//    }


    //==========================================================================================================
//    String item;
//    byte price;
//
//    private Single_TonLearn(){
//    }
//
//    public Single_TonLearn(String item) {
//        this.item = item;
//    }
//    public Single_TonLearn(String item, byte price) {
//        this.item = item;
//        this.price = price;
//    }
//    private static Single_TonLearn getST=new Single_TonLearn();
//
//    public static Single_TonLearn getMethod(){
//        return getST;
//    }
//=================================================================================================================


//String name;
//int age;

//    private Single_TonLearn(){
//    }
//
//    public Single_TonLearn(String name) {
//        this.name = name;
//    }
//
//    public Single_TonLearn(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    private static Single_TonLearn getInstance= new Single_TonLearn();
//
//    public static Single_TonLearn myMethod(){
//        System.out.println("khdfkshfiuhf");
//        return getInstance;
//
//
//    }


}
