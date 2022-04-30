package learnControlFlow;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class DoPatternByLoop {


    public static void Square(int rowNum){
        for (int x=12; x>=rowNum; x--){
            for (int y=12; y>=4; y--){

                System.out.print("/*"+"/");
            }
            System.out.println();
        }

    }
    //doing another pattern
    public static void Triangle(int tPtrn){
        for (int a=0; a<=tPtrn; a++){
            for(int b=0; b<=a; b++){
                System.out.print("&"+ " ");
            }
            System.out.println(); //(this line is creating next line for pattern)
        }

    }


    public static void printCirclePattern(double rawNum,int calNum){

        //double rawNum;
        for (int i=0; i <=2*calNum; i++){

            for (int k=0; k<=2* calNum; k++){
                rawNum=Math.sqrt((i-calNum)*(i-calNum)+(k-calNum)*(k-calNum));
            if (rawNum>calNum-0.5 && rawNum<calNum+ 0.5){
                    System.out.println("*");
                }else
                    System.out.println(" ");

            }
            System.out.println("\n");
        }
    }










   public static void main(String[] args) {
   //  DoPatternByLoop.Square(5);
     //   DoPatternByLoop.Triangle(7);
        DoPatternByLoop.printCirclePattern(4.0,0);
   }






}