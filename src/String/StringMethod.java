package String;

public class StringMethod {

    public static void main(String[] args) {
               String string1="My@name@is@shila@!!!";
        String replaceString=string1.replaceAll("@"," ");
        System.out.println(replaceString);

        //==========================Formating String ================================= its like concatenation

        String strn= " thamina";

        String fromateString=String.format("My name is : %S",strn);
        //String fromateString1=String.format("My name is : %s",strn);
        System.out.println(fromateString);

        //========================== Is Empty ???? ==========================================================

        String firstWord="deer park, ny";
        String secondWord="";  // in between double cote cannot have any space either

        System.out.println(firstWord.isEmpty());
        System.out.println(secondWord.isEmpty());



        //================================================================= contain =========================================
        String name= " tahmina Rashid";

        try {
            System.out.println(name.contains("Pa"));
        }catch (Exception e){
            // e.printStackTrace();
        }

  //=================================================Split by using For Each =============================================


String  birthCountry="My0birth0place0is0bangladesh";

String[]demoArray=birthCountry.split("0",5);
for (String a:demoArray){
    System.out.print(" " +a);
}

//=============================anOther way==========================================================
            String name1= "babor:shibly:mahbub:mahmud:sharif:kazi";
            String [] splitName=name1.split(":");
            for (String newVariable:splitName) {
                System.out.print(" "+newVariable);
            }


        }





        }




