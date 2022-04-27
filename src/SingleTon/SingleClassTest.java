package SingleTon;

public class SingleClassTest {
    public static void main(String[] args) {



        SingleClass newObj= new SingleClass("Tahmina","Rashid","New York");
        System.out.println("My First name is: " +newObj.fName+ "\n"+"My last name is: " +newObj.lName+ "\n"+"My address is: "+newObj.address);

    }

}
