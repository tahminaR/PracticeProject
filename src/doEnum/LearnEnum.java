package doEnum;

public class LearnEnum {

    // Enum declaration can be done outside a class or inside a class but not inside a method
    public static void main(String[] args) {
        System.out.println(Level.HIGH); //calling from Level Enum
        System.out.println(outSideOfClass.GREEN);
        System.out.println(outSideOfClass.RED);
        System.out.println(outSideOfClass.WHITE);
        System.out.println(outSideOfClass.BLUE);
        System.out.println(inSideOfClass.GALAXY);


    }
public enum inSideOfClass{
        GALAXY, iPhone,NOKIA,LG

}




}
// Enum declaration can be done outside a class or inside a class but not inside a method
// this enum is outsider of class.
enum outSideOfClass{
    RED, GREEN, BLUE, WHITE
}



