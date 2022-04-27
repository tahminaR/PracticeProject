package learnConstructor;

public class PracticeConstructor {

    String name;
    int salary;

    public PracticeConstructor() {
    }

    public PracticeConstructor(String name) {
        this.name = name;
        System.out.println("my name is: "+name);
    }

    public PracticeConstructor(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("my name is: "+name+ "my salary is : "+ salary);
    }


    public static void main(String[] args) {
        PracticeConstructor myObj= new PracticeConstructor();
        PracticeConstructor myObj1= new PracticeConstructor("Tahmina");
        PracticeConstructor myObj2 =new PracticeConstructor("tahmina",8000);
    }

}
