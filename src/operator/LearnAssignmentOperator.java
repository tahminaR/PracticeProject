package operator;

public class LearnAssignmentOperator {


    String name="Abir";

    public static void main(String[] args) {
        LearnAssignmentOperator obj= new LearnAssignmentOperator();
        System.out.println(obj.name);
        System.out.println("=====================================================");
        obj.name="Navid"; // reassign value
        System.out.println(obj.name);
        System.out.println("=====================================================");
        obj.name="Mamoni";
        System.out.println(obj.name);
    }
}
