package learnMethod;

public class ReturnWithOutParameter {

    public static void main(String[] args) {
        ReturnWithOutParameter object=new ReturnWithOutParameter();
//        System.out.println("my total sum is: "+object.doSum());
//        ReturnWithOutParameter.doSub();
//        ReturnWithOutParameter.isPizzaAvailable();
        ReturnWithOutParameter.paraMethod(10,20);
ReturnWithOutParameter.returnMethod(50,20);
ReturnWithOutParameter.returnMethod1("Tahmina","Rashid", "33");
ReturnWithOutParameter.doWhile();
    }


//    public int doSum(){
//
//        int number1 =32;
//        int number2 =32;
//        int number3 =32;
//        int totalSum  =number1+number2+number3;
//        System.out.println(totalSum);
//        return totalSum;
//    }
//
//public static void doSub(){
//        int age =33;
//        if ( age==33){
//            System.out.println("my age is forever: "+age);
//        } else {
//            System.out.println("my age is not : "+age);
//        }
//
//}
//public static void isPizzaAvailable(){
//        boolean pizzaAvailable=true;
//        if ( pizzaAvailable=false){
//            System.out.println(" pizza is available");
//        }else{
//            System.out.println("pizza is not available");
//        }

//}
public static void paraMethod(int abc, int def) {
    int total=abc+def;
    System.out.println("my total value is: "+ total);


}
public static int returnMethod(int number1, int number2){
        int total= number1+number2;
    System.out.println("my number "+total);
      return  total;
}


    public static String  returnMethod1(String  fName, String  lName, String age){
       //String myInfo=fName+lName;
        System.out.println("my first name "+fName+" \n"+ "my last name "+lName +"\n"+ "my age is: "+ age);
        return fName;
    }


public static boolean doWhile() {
    boolean cakeIsAvailable = true;
    do {
        System.out.println("cake Is Available");
    } while (cakeIsAvailable == false);

    String cakeName="Vanilla";
    do {
        System.out.println("I like Vanilla ");
    }while (cakeName=="Chocolate");
    return cakeIsAvailable;







}




}
