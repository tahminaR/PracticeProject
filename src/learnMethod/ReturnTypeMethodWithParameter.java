package learnMethod;

public class ReturnTypeMethodWithParameter {
//Return Type Method With Parameter. also called dynamic return type method.
    //Return Type: All type of data,void, class type and Object
    // Rules of method Naming: verb+noun/Adjective
    // method name should state with lower case

    //Syntax of Return Type Method: AccessModifier Data Type/ void/ class/ object methodName(parameter){ return;    }


    public int doSummation(int firstNumber, int secondNumber) {
        int totalSumValue = firstNumber + secondNumber;
        System.out.println("this is my total value of summation= " + totalSumValue);
        return totalSumValue;  // Return key word should be end of the method
    }

    //==================================================================================================================
    public byte doSummationByCasting(byte firstNumber, byte secondNumber, byte thirdNumber, byte forthNumber) {
        int totalValueOfSum = firstNumber + secondNumber + thirdNumber + forthNumber;
        System.out.println("Total value of summation (Casting) One way=  " + totalValueOfSum);
        return (byte) totalValueOfSum;
    }
    //==================================================================================================================
    public int doMultiplicationByCasting(int num1, int num2) {
        System.out.println("Total value of multiplication (Casting) Another way=   " + (byte) (num1 * num2));
        return num1 * num2;
    }

    //==================================================================================================================
    public int doMultiSubDivAdd(int firstNumber, int secondNumber, int thirdNumber, int forthNumber, int fifthNumber) {
        int totalMultiValue = firstNumber * secondNumber - thirdNumber / forthNumber + fifthNumber;
        System.out.println("It's Multi+Sub+Div+Add value = " + totalMultiValue);
        return totalMultiValue;
    }

    //===================================================================================================================
    public double getValueOfMultiplication(double v, double num1, double num2, double num3, double num4, double num5) {
        System.out.println("Total Output Of this Value is: " + num1 * num2 * num3 * num4 * num5);
        return num1 * num2 * num3 * num4 * num5; //we can directly put variable after return key word like this
    }
    //==================================================================================================================
    public String getYourFullName(String firstName, String middleInitial, String lastName) {
        String FullName = firstName + " " + middleInitial + " " + lastName;
        return FullName;   //sysout is in the main method
    }

    //==================================================================================================================
    public String tryDifferentWay( String studentName,double studentFee, int studentIdNumber) {
        System.out.println("student Name is: "+studentName+ "\n"+"student Fees for the course is: "+studentFee+"\n"+"student Id Number is: "+studentIdNumber);
        return studentName; //different types of data type
    }
    //=================================================================================================================
    public double doSubtraction(double firstNumber, double secondNumber) {
        double totalSubValue = firstNumber - secondNumber;
        System.out.println("this is my total value of subtraction= " + totalSubValue);
        return totalSubValue;
    }
    //==================================================================================================================
    public int doDivision(int firstNumber, int secondNumber) {
        int totalDivision = firstNumber / secondNumber;
        System.out.println("this is my total value of Division= " + totalDivision);
        return totalDivision;
    }
    //=================================================================================================================
    public boolean isTomorrowOff(boolean tomorrowIsOff) {
        System.out.println("Your Office is off tomorrow ? " + "\n" + tomorrowIsOff);
        return tomorrowIsOff;
    }
    //===============================================================================================================
    public String getYourName(String firstName, String lastName) {
        String FullName = firstName + " " + lastName;
        System.out.println("Your Full Name Is: " + FullName);
        return FullName;
    }
    //============================================================================
    public boolean isPizzaAvailable(String pizzaName, char pizzaSize, int pizzaPrice){
        if (pizzaSize=='L'){
            System.out.println("Yes, Large size pizza is available..");
        }else{
            System.out.println("Sorry, Large size pizza is not available..");
        }
        if(pizzaName=="Papa John's"){
            System.out.println("Yes, this is Papa John's..");
        }else{
            System.out.println("Sorry, this is not Papa John's..");
        }
        if(pizzaPrice==25){
            System.out.println("Yes, pizza Price is $20..");
        }else{
            System.out.println("Sorry, pizza Price is not $20..");
        }
        return pizzaSize=='L';
    }

    //===============================Main Method===========================================
    public static void main(String[] args) {
        ReturnTypeMethodWithParameter parameterObj = new ReturnTypeMethodWithParameter();
        parameterObj.doSummation(500, 200);
        parameterObj.doSummation(5000, 2001);
        parameterObj.doSummationByCasting((byte) 5, (byte) 10, (byte) 15, (byte) 25);
        parameterObj.doMultiplicationByCasting(20, 30);
        parameterObj.doSubtraction(200, 150);
        parameterObj.doMultiSubDivAdd(100, 150, 900, 300, 100);
        parameterObj.doDivision(1000, 5);
        parameterObj.getYourName("Will", "Smith");
        parameterObj.getYourName("Angelina", "Jolie");
        parameterObj.getYourName("Jennifer", "Lawrence");
        parameterObj.getYourName("Tom ", "Cruise");
        parameterObj.getYourName("Leonardo", "Dicaprio");
        parameterObj.isTomorrowOff(true);
        parameterObj.isTomorrowOff(false);
        parameterObj.getValueOfMultiplication(10.00, 10.20, 20.00, 55.10, 24.20, 34.00);
        parameterObj.tryDifferentWay("Abir Rashid",5000.00,54321);
//                         // we also can print this way!!!
        System.out.println(parameterObj.getYourFullName("Tahmina", "A", "Rashid"));

        System.out.println(parameterObj.isPizzaAvailable("Papa John's",'L',20));
        int example = parameterObj.doSummation(30, 50);
        int totalValueOfTwoVariableTogether = example + parameterObj.doDivision(1000, 5);  //This way also we can add to variable together
        System.out.println("after adding two variable result, new result is : "+totalValueOfTwoVariableTogether);


    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //return method with parameter
//    //Syntax of Return type method with parameter
//    // AccessModifier dataType/class/object methodName( parameter){ return;}
//    public String getStudentInfo(String name) {
//        //String stName="Mahir";
//        System.out.println(" student name is: " + name);
//        return name;
//    }
//
//    //==============================================================================================
//    public double doSummation(double num1, double num2) {
//        //System.out.println(num1+num2);
//        return num1 + num2;
//    }
//
//    //===============================================================================================
//    public int doSummation1(int num3, int num4, int num5, int num6) {
//        //System.out.println(num1+num2);
//        int total = num3 + num4 + num5 + num6;
//        return total;
//    }
//
//    //==============================================================================================
//    public int getMulti(int num1, int num2, int num3) {
//        return num1 * num2 * num3;
//    }
//
//    //====================================================================================================
//    public boolean isPizzaAvaible(String pizzaName, char size, int price) {
//        char pizzaSize = size;
//        double pizzaPrice = price;
//
//        if (pizzaSize == 'L') {
//            System.out.println("yes L size "+pizzaName + " pizza is available");
//        } else {
//            System.out.println(pizzaSize+" size "+pizzaName+ " pizza is not available");
//        }
//        return pizzaSize == 'L';
//    }
//
//    //=================================================================================================
//    public static void main(String[] args) {
//        ReturnTypeMethodWithParameter myObj = new ReturnTypeMethodWithParameter();
//        myObj.getStudentInfo("Mahir Sahrier Navid");// argument passing inside method
//        // myObj.doSummation(100.00,500.50); //we can do either this way
//        System.out.println(" Summation Value is= " + myObj.doSummation(100.00, 500.50));// or this way too
//        System.out.println("My New summation Is = " + myObj.doSummation1(50, 60, 70, 80));
//
//        int num5 = 200;
//        int num6 = num5 + myObj.getMulti(10, 20, 10);
//        System.out.println("num6 value is= " + num6);
//        System.out.println("===========================================================================");
//
//        //myObj.isPizzaAvaible("margarita",'L',20);
//        myObj.isPizzaAvaible("margarita",'S',20);
//
//        //===================================================================================================
//
//    }


}
