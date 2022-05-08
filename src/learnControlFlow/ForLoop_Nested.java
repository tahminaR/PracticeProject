package learnControlFlow;

public class ForLoop_Nested {

    public static void main(String[] args) {
//int weeks=3;
//int days=7;
//        for (int i =1; i<=weeks; i++)  {
//            System.out.println("week: "+i);
//
//            for (int k=1;k<=days; k++){
//                System.out.println(" -days: "+k);
//            }
//        }



        //===============================another way using Break=================================


        int weeks=3;
        int days=7;
        for (int i =1; i<=weeks; i++)  {
            System.out.println("week: "+i);

            for (int k=1;k<=days; k++){

                if (i==3){  //saying when i= 3 give break. it will not execute.
                    break;
                }
                System.out.println(" -days: "+k);

            }
        }
    }


}
