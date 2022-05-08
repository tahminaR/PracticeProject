package learnControlFlow;

public class ForLoop_Nested1 {
    public static void main(String[] args) {
//getWeekDays();
        getWeeks2();

    }

   public static void getWeekDays  (){
               int weeks=3;
        int days=7;
        int i=1;


        while(i<=weeks) {
            System.out.println("week: "+i);

            for (int k=1;k<=days; k++){
                System.out.println(" -days: "+k);

            }
            i++; //this iteration is while loop iteration
        }

   }

public static void getWeeks2(){
   int weeks=3;
int days=7;


        for (int i =1; i<=weeks; i++)  {
            System.out.println("week: "+i);
            for (int k=1;k<=days; k++){
                if (k % 2 ==0){
                //if (k % 2 !=0){
                    continue;
                }
                System.out.println(" -days: "+k);
            }
        }
}



}
