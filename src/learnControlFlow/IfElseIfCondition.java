package learnControlFlow;

public class IfElseIfCondition {
    //if the condition is true then if block of code will execute
    //if the condition is false then if block of code will not execute
    //syntax of if: If (condition){   }
    //syntax of else: else{   }
//======================================================
// public static void main(String[] args) {
//int score= 50;
//if (condition){}
//else if (condition){}
//else if (condition){}
//else {}
//======================================================

    public static void main(String[] args) {
        int score= 50;

        if (score >= 95) {
            System.out.println("you are A+ student");
            if (score<= 75) {
                System.out.println("you are B+ student");
                if (score<= 65) {
                }
                System.out.println("you are C+ Student");
                }
            } else {
                System.out.println("you are feltu student");
            }
         {

        }

        System.out.println ("*******Another If Else If Condition********");

        byte age =55;

        if (age>=65){
            System.out.println( "you are eligible for retirement");
        }
        else if (age==65){
            System.out.println( "you are NOT eligible for retirement YET");
        }
        else if(age==55){
            System.out.println("10 more years to run");
        }
        else{
            System.out.println("just started, keep going");
        }





    }




}
