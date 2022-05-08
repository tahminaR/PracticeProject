package exceptionHandling;

public class ExceptionHandling_Try_Catch {
    public static void main(String[] args) {
        ////=================================================================

        //try_Catch : try {}catch(){Exception e}

        String myAddress="Deer Park, New York";
        //System.out.println(myAddress.length());
        try {
            System.out.println(myAddress.charAt(20));
            System.out.println(myAddress.charAt(20));
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("String Index Out Of Bounds Exception");
        }

// //===========================================================================================================
        String myAddress1="Deer Park, New York";
         System.out.println(myAddress1.indexOf("P"));
        System.out.println(myAddress1.indexOf("Z"));
        System.out.println(myAddress1.lastIndexOf("o"));
    }
}
