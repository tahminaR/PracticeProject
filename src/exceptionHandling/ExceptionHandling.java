package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        //in 2 ways :entering right charAt and entering wrong charAt
        String birthdayWish = "Happy birthday to Mahir Navid";

//        try{
//            System.out.println("char at: "+birthdayWish.charAt(12));  //Note:entering right charAt value
//        }
//        catch(Exception e){
//            e.printStackTrace();

        try {
            System.out.println("char at: " + birthdayWish.charAt(32)); //Note:entering wrong charAt value
        } catch (Exception e1) {
            //e1.printStackTrace();
            System.out.println("String Index Out Of Bounds Exception");
        }
    }
}
