package learnControlFlow;

import java.util.Scanner;

///Note: switch case Syntax: switch (condition)
// { case CaseName/caseNumber: VariableName=Value; break; default:VariableName=Value;break}

public class SwitchCase {
  public static void main(String[] args) {
//    SwitchCase.fevBooks();
//    SwitchCase.knowYourFevFood();
    learnChildSwitch();


  }

  public static void knowYourFevFood() {

    // Note:switch case method without scanner
    // Note: you always need two variable in switch case method.
    // switch variable must be different from case variable.

    //Note: switch case Syntax: switch (condition)
    // { case CaseName/caseNumber: VariableName=Value; break; default:VariableName=Value;break}


    String foodName;
    int foodSerialNumber = 3;

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


  public static void fevBooks() {
    System.out.println("==========================With Scanner===========================================");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your favorite book number ");

    int bookNumber = input.nextInt();

    String bookName;       // Syntax of SwitchCases statement:
    // switch(){ case1: break;
    // default: break}
    switch (bookNumber) {
      case 1:
        bookName = "Durbin";
        break;
      case 2:
        bookName = "Chokher Bali";
        break;
      case 3:
        bookName = "Na Hanyate";
      case 4:
        bookName = "La Nuit Bengali";
        break;

      case 5:
        bookName = "Debdash";
        break;
      case 6:
        bookName = "Bohubrihi";
        break;
      case 7:
        bookName = "Debi";
        break;
      default:
        bookName = "Book not found"; //this line is needed
        break;
    }
    System.out.println("My favorite book name- " + bookName);

  }

  public static void learnChildSwitch() {
    System.out.println("=========================With Child Switch Case===============================");

    //switch (condition){ case CaseName/caseNumber: VariableName=Value; break; default:VariableName=Value;break}

    Scanner inputValue=new Scanner(System.in);
    System.out.println("enter your favorite book name ");
    int favBook=inputValue.nextInt();
    System.out.println("enter your favorite chapter");
    String favChapter=inputValue.next();
    System.out.println("enter your favorite character");
    String favCharacter=inputValue.next();

    String bookName;
    String chapterNumber;
    String favChar;

    switch (favBook){
      case 1:
        bookName="Durbin";

        switch (favChapter){
          case "ch5":
            chapterNumber="Chapter 5";
            break;
          case "ch8":
            chapterNumber="Chapter 8";
            break;
          case "ch3":
            chapterNumber="Chapter 3";
            break;
          default:
            chapterNumber=" This chapter is not my feb one";
            break;
        }
        System.out.println("In "+bookName+" book, "+"My most favorite chapter is= "+chapterNumber);

        break;
      case 2:
        //switch (condition){ case CaseName/caseNumber: VariableName=Value; break; default:VariableName=Value;break}
        bookName="Debi";
        switch (favCharacter){
          case "charName1":
            favChar="Mircha";
            break;
          case "charName2":
            favChar="Moitri Debi";
            break;
          case "charName3":
            favChar="Drubo";
            break;
          default:
            favChar="This Character is not my fev one";
            break;
        }
        System.out.println("In "+bookName+" book, "+"My most favorite Character is= "+favChar);


        break;
      case 3:
        bookName="Chokher Bali";
        break;
      case 4:
        bookName="La Nuit Bengali";
        break;
      case 5:
        bookName="Na Hanyate";
        break;

      default:
        bookName="your fab book serial number not found";
        break;
    }
    System.out.println("And my favorite book is : "+bookName);







  }

}


