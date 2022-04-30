package String;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;

import java.util.Locale;

public class LearnString {
    //string is a sequence of character
    //String: is a class and datatype


    public static void main(String[] args) {
        String birthDayWish = "happy birthday to me";
//        System.out.println("length value : "+birthDayWish.length());
//        System.out.println("length value : "+birthDayWish.toLowerCase());
//        System.out.println("length value : "+birthDayWish.toUpperCase());
//        System.out.println("length value : "+birthDayWish.charAt(11));
//        //index start from 0
//        System.out.println("length value : "+birthDayWish.substring(14));
//        System.out.println("length value : "+birthDayWish.substring(6,14));
//        System.out.println("length value : " + birthDayWish.charAt(19));
//        System.out.println("compare : " + birthDayWish.equalsIgnoreCase("Happy Birthday To Me"));
//        System.out.println("compare : " + birthDayWish.concat(" & my self"));
//
//        System.out.println("======================= Split, contain, and to string method ==============================");
//        String stID = "102-Meena";
//        int age = 33;
//        String stID1 = " boo@and@foo";
//        System.out.println(stID.toString());
//        System.out.println(stID.contains("na"));
//        //System.out.println(stID.contains("ta"));
//        //System.out.println(stID.split("@"));

        System.out.println("********************* Exception Handling ***********************************");


    //Exception Handling
    //try catch block
    //try{} catch(){}
try{
    System.out.println("Char at : " + birthDayWish.charAt(26));
    System.out.println();
}catch (Exception e){
    e.printStackTrace();
    System.out.println("String index out of bounds exception");
}


    }

}
