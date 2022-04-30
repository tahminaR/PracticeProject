package SingleTon;

import java.sql.SQLOutput;

public class SingleClassShort {
//    private SingleClassShort(){
//        System.out.println(" This little light is mine");
//
//    }
//    private static SingleClassShort objectName=new SingleClassShort();
//
 //   public static SingleClassShort methodName(){
//        return objectName;
//    }
//=======================================================================================================

    private SingleClassShort() {
        System.out.println("This is our time to live our lives");

    }
     private static SingleClassShort abcd=new SingleClassShort();

    public static SingleClassShort aabbcc(){
        return abcd;
    }










}
