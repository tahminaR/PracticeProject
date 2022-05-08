package learnControlFlow;

import java.util.Scanner;

public class LearnControlFlow {
    static int number = 5;

    //control flow will help us to make the decision and give the direction to move foreword
    //Rules: is the condition is true then "if block of code" will execute
    //Rules: is the condition is false then "if block of code" will not execute
    //Rules: is the condition is false then "else block" will execute
    // = is called assignment operator
    // == is called equal operator
    //syntax: if (condition){ }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        if (number == num) {
            System.out.println("this condition is true");
        }else{
            System.out.println("this condition is false, executing else block");
        }


    }
}