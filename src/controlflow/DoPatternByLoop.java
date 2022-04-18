package controlflow;

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

   public static void main(String[] args) {
      DoPatternByLoop.Square(5);
        DoPatternByLoop.Triangle(7);
   }






}