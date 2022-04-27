package learnMethod;

public class NonReturnTypeMethod {
//NON-Return Type Method With Parameter and Without Parameter
//Syntax: AccessModifier returnType methodName(){   }
// NON- Return type method we always use "Void" key word And we don't use return key word


    //=============================Non Return Type Method Without Parameter ===============================
    public void doSum1() {
        int firstNumber = 12;
        int secondNumber = 30;
        int totalSumValueIs = firstNumber + secondNumber;
        System.out.println("Total value of addition two numbers is = "+totalSumValueIs);
    }
    //==================================================================================================================
    public void doSummation1() {
        byte firstNumber1 = 10;
        byte secondNumber2 = 30;
        byte thirdNumber3 = 40;
        byte forthNumber4 = 50;
        int totalValueOfSum = firstNumber1 + secondNumber2 + thirdNumber3 + forthNumber4;
        System.out.println("Total value of summation= " + totalValueOfSum);
    }
    //==================================================================================================================
    public void doMultiply1() {
        int num = 12;
        int numb = 30;
        byte total = (byte) (num * numb);
        System.out.println("Value of Multiply "+total);
    }
    //==================================================================================================================
    public void doSubtraction1() {
        double firstNumber = 55555.5000;
        double secondNumber = 33333.5000;
        double totalSubValue = firstNumber - secondNumber;
        System.out.println("this is my total value of subtraction= " + totalSubValue);
    }
    //==================================================================================================================
    public void doDivision1() {
        int firstNumber = 100 ;
        int secondNumber = 25;
        int totalDivision= firstNumber/secondNumber;
        System.out.println("this is my total value of Division= " + totalDivision);
    }
    //==================================================================================================================
    public void getYourName1() {
        String firstName= "Will";
        String lastName= "Smith";
        String FullName= firstName+" "+lastName ;
        System.out.println("Your Full Name Is= " + FullName);
    }
    //==================================================================================================================
    public void tomorrowIsOff1() {
        boolean tomorrowIsOff=true;
        System.out.println("Office is off tomorrow ? "+"\n" +tomorrowIsOff);

    }
    //=====================Non Return Type Method With Parameter ===============================
//=====================Non Return Type Method With Parameter ===============================
//=====================Non Return Type Method With Parameter ===============================
    public void doSummationParameter(int firstNumber,int secondNumber,int thirdNumber,int forthNumber) {
        int totalSumValue = firstNumber + secondNumber;
        System.out.println("this is my total value of summation= " + totalSumValue);
    }
    //=================================================================================================================
    public void doSubtractionParameter(double firstNumber,double secondNumber) {
        double totalSubValue = firstNumber - secondNumber;
        System.out.println("this is my total value of subtraction= " + totalSubValue);
    }
    //==================================================================================================================
    public void doMultiplicationSubtractionDivisionAddition(int firstNumber,int secondNumber,int thirdNumber,int forthNumber,int fifthNumber ) {
        int totalMultiValue= firstNumber*secondNumber-thirdNumber/forthNumber+fifthNumber;
        System.out.println("It's Multi+Sub+Div+Add value = " + totalMultiValue);

    }
    //==================================================================================================================
    public void doDivisionParameter(int firstNumber,int secondNumber ) {
        int totalDivision= firstNumber/secondNumber;
        System.out.println("this is my total value of Division= " + totalDivision);

    }
    //==================================================================================================================
    public void getYourNameInParameter(String firstName,String lastName) {
        String FullName= firstName+" "+lastName ;
        System.out.println("Your Full Name Is: " + FullName);
    }
    //==================================================================================================================
    public void tomorrowOfficeOffParameter(boolean tomorrowIsOff) {
        System.out.println("Your Office is off tomorrow ? "+"\n" +tomorrowIsOff);

    }
//=========================================Main Method =================================================================
    public static void main(String[] args) {
        NonReturnTypeMethod nonReturnTypeMethod=new NonReturnTypeMethod(); // after className make space then ctrl+Hit space, it will suggest variable name
        nonReturnTypeMethod.doSum1();
        nonReturnTypeMethod.doSummation1();
        nonReturnTypeMethod.doMultiply1();
        nonReturnTypeMethod.doSubtraction1();
        nonReturnTypeMethod.doDivision1();
        nonReturnTypeMethod.getYourName1();
        nonReturnTypeMethod.tomorrowIsOff1();
        //======================================================= With Parameter =======================================
        nonReturnTypeMethod.doSummationParameter(300,500,100,200);
        nonReturnTypeMethod.doSubtractionParameter(500000,200000);
        nonReturnTypeMethod.doMultiplicationSubtractionDivisionAddition(300,6666,98765,2345,6543);
        nonReturnTypeMethod.doDivisionParameter(999,333);
        nonReturnTypeMethod.getYourNameInParameter("Jennifer","Lawrence");
        nonReturnTypeMethod.tomorrowOfficeOffParameter(true);


    }






















/////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //non-return type means it's a void type
//    //syntax:  AccessModifier returnType methodName(){ }
//
//    public void nonReturnMethod(){
//        System.out.println("This is our Non Return Type Method ");
//
//    }
////=================================Non Return Type with out parameterize==============================================
//public void doSub() {
//    int num1 = 65;
//    int num2 = 55;
//    int totalSub = num1 - num2;
//    System.out.println("Non return type method value is=  " + totalSub);
//}
////==================================Non Return Type with parameterize==================================================
//public void doSum(int number1, int number2) {
//
//    int total = number1 + number2;
//    System.out.println("this is Non Return Type method with parameterize= "+total);
//
//}
//
//
//
//    public static void main(String[] args) {
//        NonReturnTypeMethod nonNonReturnObject=new NonReturnTypeMethod();
//        nonNonReturnObject.nonReturnMethod();
//        nonNonReturnObject.doSub();
//        nonNonReturnObject.doSum(20,30);
//
//
//    }


}
