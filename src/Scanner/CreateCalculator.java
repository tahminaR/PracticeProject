package Scanner;

import java.util.Scanner;


public class CreateCalculator {
    // public static void main(String[] args) {

    void thisIsCalculator() {
        Scanner funWithCalculator = new Scanner(System.in);
        System.out.println("=======This Is My Calculator==========");
        System.out.println(">>>>>>>Let's do Addition first<<<<<<<");


        System.out.println("Enter your first number-->");
//syntax : dataType variableName=ScannerVariable.JaVaMethod (.nextDouble()/.nextInt() used to scan the next token of the input as DataType)
        double firstNumber4Adding = funWithCalculator.nextDouble();
        System.out.println("Enter your next number-->");
        double secondNumber4Adding = funWithCalculator.nextDouble();
        double totalAdditionOfTwoNumber = firstNumber4Adding + secondNumber4Adding;
        System.out.println("Our Total Addition is = " + totalAdditionOfTwoNumber);
        System.out.println("               ");

        //=========increasing===AND===decreasing==Order========================================

        System.out.println(">>>>>>>Now Let's do Subtraction<<<<<<<");
        System.out.println("Enter your first number-->");
        int firstNumber = funWithCalculator.nextInt();
        System.out.println("Enter second number-->");
        int secondNumber = funWithCalculator.nextInt();
        System.out.println("Enter third number-->");
        int thirdNumber = funWithCalculator.nextInt();
//    int subtractionOfTwoNumber = firstNumber4Sub - secondNumber4Sub;
//    System.out.println("Our Subtraction value is = " + subtractionOfTwoNumber);
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing order");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
        System.out.println("---------------------------------------------");
        //=============================================================================
        System.out.println(">>>>>>>Now Let's do Multiplication<<<<<<<");
        System.out.println("Enter your first number-->");
        byte firstNumber4Multi = funWithCalculator.nextByte();
        System.out.println("Enter next number-->");
        byte secondNumber4Multi = funWithCalculator.nextByte();
        int totalValueOfMultiplication = firstNumber4Multi * secondNumber4Multi;
        System.out.println("Our Multiplication value is = " + totalValueOfMultiplication);
        System.out.println("               ");
        //===============================================================================
        System.out.println(">>>>>>>Finally Let's do Division<<<<<<<");
        System.out.println("Enter your first number-->");
        int firstNumber4Division = funWithCalculator.nextInt();
        System.out.println("Enter next number-->");
        int secondNumber4Division = funWithCalculator.nextInt();
        int totalValueOfDivision = firstNumber4Division / secondNumber4Division;
        System.out.println("Our Division value is = " + totalValueOfDivision);
        System.out.println("               ");
        System.out.println("========== Great!! Our calculation is done :)  ============");


        funWithCalculator.close();
    }

    public static void main(String[] args) {
        CreateCalculator cal = new CreateCalculator();
        cal.thisIsCalculator();


    }

}





