package SingleTon;

import org.apache.commons.math3.analysis.function.Sin;

import java.sql.SQLOutput;

public class Test_Single_TonLearn {
    //Create object under main method
    // call by objName.variable
    public static void main(String[] args) {

        LearnSingleton pizzaObj=LearnSingleton.getInstance();



//====================================================================================================================
//  Single_TonLearn xyzObj =new Single_TonLearn(20,10);
//        System.out.println(xyzObj.num1+ "\n"+xyzObj.num2);


        // this is another way just directly call default constructor
        Single_TonLearn obj=Single_TonLearn.abcMethod();


 //===================================================================================================================
//        Single_TonLearn singleObg = new Single_TonLearn("tahmina","Akther","rahsid");
//        System.out.println(singleObg.fName +" \n"+ singleObg.mName+" \n"+ singleObg.lName);
//        Single_TonLearn.getMethod();

//=========================================================================================================================
//        Single_TonLearn callObj= new Single_TonLearn("ChomChom");
//        Single_TonLearn callObj1= new Single_TonLearn("ChomChom",7.99);
//
//        System.out.println(callObj.item1);
//        System.out.println(callObj1.item1 +" \n"+ callObj1.price1);
//        Single_TonLearn.setCallMethod();


        //==============================================================================================================
//        Single_TonLearn myObj=new Single_TonLearn("potato");
//        System.out.println("*************"  +myObj.item);
//        Single_TonLearn newObj=new Single_TonLearn("Apple", (byte) 15);
//        System.out.println("Item name is: "+newObj.item+"\n"+ "Item price is: "+ newObj.price);
//    }
//==================================================================================================================

//    public static void main(String[] args) {
//
//        Single_TonLearn myObject= new Single_TonLearn("tahmina");
//
//        System.out.println(myObject.name);
//        Single_TonLearn myObject1= new Single_TonLearn("tahmina",33);
//
//        Single_TonLearn myobj= Single_TonLearn.myMethod();
//======================================================================================================================
    }




}
