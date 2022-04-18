package controlflow;

import java.util.Scanner;

                                   //Note:switch case method with scanner
public class SwitchCase {
    public static void main(String[] args) {
//      Scanner input = new Scanner(System.in);
//      System.out.println("Enter your favorite book number ");
//
//      int bookNumber = input.nextInt();
//      String bookName;       // Syntax of SwitchCases statement:
//      // switch(){ case1: break;
//      // default: break}
//      switch (bookNumber) {
//        case 1:
//          bookName = "Durbin";
//          break;
//        case 2:
//          bookName = "Chokher Bali";
//          break;
//        case 3:
//          bookName = "Na Hanyate";
//        case 4:
//          bookName = "La Nuit Bengali";
//          break;
//
//        case 5:
//          bookName = "Debdash";
//          break;
//        case 6:
//          bookName = "Bohubrihi";
//          break;
//        case 7:
//          bookName = "Debi";
//          break;
//        default:
//          bookName = "Book not found"; //this line needed
//          break;
//      }
//      System.out.println("My favorite book name- " + bookName);


                                    // Note:switch case method without scanner

                                   // Note: you always need two variable in switch case method.
                                                         // switch variable must be different from case variable.

      String foodName;
      int foodSerialNumber = 3;

                                    //Note: switch case Syntax: switch (condition){ }

      switch (foodSerialNumber) {
        case 1:
          foodName = "pizza";
          break;

        case 2:
          foodName = "chicken nugget";
          break;

        case 3:
          foodName = "cake";
          break;

        case 4:
          foodName = "ice cream";
          break;

        case 5:
          foodName = "candy";
          break;

        case 6:
          foodName = "coffee";
          break;

        default:
          foodName = "is invalid";
          System.out.println("sorry we don't have that food here");
          break;


      }
      System.out.println("yes we will get your order ready: " + foodName);
    }

  }




