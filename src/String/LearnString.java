package String;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;

import java.util.Locale;

public class LearnString {
    //string is a sequence of character
    //String: is a class and datatype


    public static void main(String[] args) {
       // compare();


        String birthDayWish = "happy birthday to me";
        System.out.println("total length value : " + birthDayWish.length());
//        System.out.println("to make all lower case : "+birthDayWish.toLowerCase());
//        System.out.println("to make all UPPER case : "+birthDayWish.toUpperCase());
//        System.out.println("find 11th character : "+birthDayWish.charAt(11));
//        //index start from 0
//        System.out.println("start from 14 character : "+birthDayWish.substring(14));
//        System.out.println("starting from 6, ending 14 char : "+birthDayWish.substring(6,14));
//        System.out.println("find 19th character  : " + birthDayWish.charAt(19));
//        System.out.println("compare : " + birthDayWish.equalsIgnoreCase("Happy Birthday To Me"));
//        System.out.println("connecting : " + birthDayWish.concat(" & you :) "));
//
//        System.out.println("======================= Split, contain, and to string method ==============================");
//        String stID = "102-Meena";
//        int age = 33;
//        String stID1 = " boo@and@foo";
//        System.out.println(stID.toString());
//        System.out.println(stID.contains("na"));
//        //System.out.println(stID.contains("ta"));
//        //System.out.println(stID.split("@"));
//
//        System.out.println("********************* Exception Handling ***********************************");
//
//
//    //Exception Handling
//    //try catch block
//    //try{} catch(){}
//try{
//    System.out.println("Char at : " + birthDayWish.charAt(26));
//    System.out.println();
//}catch (Exception e){
//    e.printStackTrace();
//    System.out.println("String index out of bounds exception");
//}
//
//


        //=====================================================================================
       String str="how are you ?";
       String[]x=str.split(" ");

      // for (String value:x)

        //System.out.println("split value is "+value);
       // System.out.println("split value is "+ value);
        //System.out.println("split value is "+ x[0]);
       // System.out.println("split value is "+ x[1]);
//       System.out.println(str.startsWith("h"));
//       System.out.println(str.startsWith("y"));
//       System.out.println(str.startsWith("t"));
//       System.out.println(str.startsWith("w",2));

        //==================sub String=========================
        //String mySubString=str.substring(4,7);
        //System.out.println(mySubString);

        String learnTrim="  learnTrimLearnTrimLearnTrim  ";
        //System.out.println(learnTrim.trim());
//        System.out.println(str.indexOf('e'));
//        System.out.println(str.indexOf("are"));
        System.out.println(str.indexOf('a',4));





    }
//        //===================its the compare unicode table value ========================
//        public static void compare(){
//            String a="a";
//            String b="b";
//            System.out.println(a.compareTo(b));
//
//
//        }

    }


