package controlflow;

import java.util.Scanner;

public class HomeWork2 {
public static void main(String[]args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your Age for voting registration");
        int age = input.nextInt();

        if (age <= 17) {
            System.out.println("You are not eligible for vote");
        } else if (age >= 18) {
            System.out.println("You are eligible for vote");
        }


        }
}







