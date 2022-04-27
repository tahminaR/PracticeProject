package HeloJava;

import java.util.Scanner;

public class BoosterShot {

    public static void main(String[] args) {

        Scanner boosterEligibility= new Scanner(System.in);
        System.out.println("=======Check you eligible for booster?=========");



        System.out.println("do you have your first covid vaccine?");
//syntax : dataType variableName=ScannerVariable.JaVaMethod (.nextDouble()/.nextInt() used to scan the next token of the input as DataType)
        String firstDose = boosterEligibility.nextLine();
        System.out.println("do you have your second covid vaccine??");
        String secondDose = boosterEligibility.nextLine();
        System.out.println("is that over 6 months ?");
        String timePeriod = boosterEligibility.nextLine();

        if (firstDose.equals("yes" + secondDose.equals("yes"+timePeriod.equals("yes")))){
            System.out.println("you are eligible for booster");
        }else {
            System.out.println("you are not eligible for booster");
        }
    }

}

