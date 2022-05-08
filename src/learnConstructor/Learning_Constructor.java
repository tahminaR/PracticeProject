package learnConstructor;

public class Learning_Constructor {
    int age;

    public Learning_Constructor(){
        System.out.println("eita prothom ta");
    }
    public Learning_Constructor(int age1){
        this.age=age1;
        System.out.println("my age is "+ this.age);
    }

    public static void main(String[] args) {
        Learning_Constructor obj=new Learning_Constructor();
        Learning_Constructor obj1=new Learning_Constructor(65);


    }




}
