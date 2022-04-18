package controlflow;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class IfElseIFConditionWithObj {
////this if else if condition, outside of main method calling by creating object
    public void GetPrice(){
        int Price = 55000;

        if(Price>=50000){
            System.out.println("it is not in my budget");
        }
        else if(Price>=40000 && Price<=49000){
            System.out.println("it's in my budget");
        }
        else{
            System.out.println("I do not want car now");
        }

    }

    public static void main(String[] args) {
        IfElseIFConditionWithObj carPrc=new IfElseIFConditionWithObj();
        carPrc.GetPrice();
    }

}
