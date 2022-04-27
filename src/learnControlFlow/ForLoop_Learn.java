package learnControlFlow;

public class ForLoop_Learn {
   //Loop: loop is allowing us to execute a statement or group of statements multiple times
   //type of loop: for loop, while loop, do..while loop, for each loop
// syntax : for( start point; condition/endpoint; increment++/ decrement-- operator  ){block of code }
    public static void main(String[] args) {

      for( int x=0; x<=5; x++){ //post increment++ operator
          System.out.println("number of post increment i value is " +x);
      }
        for( int y=6; y>=1; y--){ //post decrement-- operator
            System.out.println("number of x variable value is " +y);
           //  y--;
        }


        for( int a=0; a<=5; ++a){ //pre increment++ operator
            System.out.println("number of pre increment x variable value is " +a);
        }

        for( int b=6; b>=1; --b){ //pre decrement-- operator
            System.out.println("number of x variable value is " +b);
        }

//=================================================================================
        int a=5;
        int b= 3;
        b+=9; //3+9 =12
        b-= 17; //12-17=-5
        System.out.println(b);

//=========================================================================================

      ForLoop_Learn.doSum();
      ForLoop_Learn display=new ForLoop_Learn();
      display.display();
    }
//=============================================================================================


public static void doSum(){
        int num1 =5;
        int num2 =7;
        int total = num1+num2;
    System.out.println(" total value " +total);
}
public void display(){
    System.out.println("This is display");
}


}
