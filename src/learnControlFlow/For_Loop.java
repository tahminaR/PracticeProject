package learnControlFlow;

import java.sql.SQLOutput;
// syntax : for( start point; condition/endpoint; increment++/ decrement-- operator  ){block of code }
public class For_Loop {
    public static void main(String[] args) {
// if you use decrement operator, start point should be larger value.
// if start point smaller value, than condition value it will be infinity.
        for (int x=10; x>=5; x--){
           System.out.println("just a simple loop using decrement operator  " +x);
       }
           System.out.println("00*****************************************************00");

       for (int y=0; y<=5; y++){
            System.out.println("just a simple loop using Increment operator  " +y);
       }
       //================   Difference Approach =====================================================
       //================   Difference Approach =====================================================
        for (int x=10; x>=8; x-=1){
            System.out.println(" decrement By 1  " +x);
        }
        for  (int x=10; x>=6; x-=2){
            System.out.println("decrement By 2 (When you need to add or subtract more then 1 number) " +x);
        }

        for  (int x=10; x>=7; x--){
            System.out.println(" Also decrement By 2 but Difference Approach   " +x);
            x--;
        }
//===========================  for loop using Array===========================================================
String array[]={"Bob", "Jack", "Jhon"};
        for (int i=0; i < array.length; i++);
        {
            int i = 2;
            System.out.println(array[i]);
        }


    }



}
