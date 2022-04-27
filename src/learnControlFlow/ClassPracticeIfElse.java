package learnControlFlow;

import java.util.Scanner;

public class ClassPracticeIfElse {
    static String name = " james";
    static int age = 45;

    public static void main(String[] args) {


        if (name == "James")
            System.out.println("this is Bob");
        if (name == "James") {
            System.out.println("this is james");
        }
        //================================same thing another way==========================================
        if (name.equalsIgnoreCase("James")) {  //by this code it will ignore upper or lower case
            System.out.println("this is new james");
        }
        if (age > 35) {
            System.out.println("your age is 35");
        }
        if (age <= 45) {
            System.out.println("your age is 45");
        }
        if (age > 65) {
            System.out.println("your age is 65");
        }

        System.out.println("===========================================================");

        Scanner input = new Scanner(System.in);
        String StName = input.nextLine();
        System.out.println("please enter student name");
        if (name.equals("Ahmed")) {
            System.out.println("this is Ahmed");
        }
        if (name.equals("Ahmed")) {
            System.out.println("this is Ahmed");
        }
        if (name.equals("Ahmed")) {
            System.out.println("this is Ahmed");
            input.close();
        }
        System.out.println("==================================================");

        Scanner input1 = new Scanner(System.in);
        System.out.println("please enter student age");
        int StAge = input1.nextInt();
        System.out.println("please enter student gender");
        String gender = input1.next();

        if (gender.equals("female") && StAge >= 21) {
            System.out.println("you are eligible for vote");
        } else if (gender.equals("male") && StAge >= 18) {
            System.out.println("you are eligible for vote");
        } else {
            System.out.println("you are not eligible to vote");
        }

        input1.close();


System.out.println("==================================================");

    Scanner input2=new Scanner(System.in);
        System.out.println("please enter student age");
    int StAge1=input2.nextInt();
        System.out.println("please enter student gender");
    String  gender1 = input2.next();

        if (gender.equals("female") || StAge1>=21){
        System.out.println("you are eligible for vote");
    } else if (gender.equals("male") || StAge1>=18){
        System.out.println("you are eligible for vote");
    }
        else {
        System.out.println("you are not eligible to vote");
    }

        input2.close();
}

}


