package learnControlFlow;

public class DoWhile_Loop {
  //do while Loop execute at least one time first then it will check condition
  //syntax: do { code and iteration } while();

    public static void main(String[] args) {
        // if you start higher value iteration will be grater than(>)  and operator --
        int age =22;
        do {
            System.out.println(" learning do while loop operator --");
            age --;
        }while (age >18);

// if you start lower value and iteration will be less than (<)  and operator ++
        int age1 =22;
        do {
            System.out.println(" learning do while loop operator ++");
            age1 ++;
        }while (age1< 28);

        System.out.println("***********************************************************************************");
        DoWhile_Loop.wishOnBirthDay(33,"me");
DoWhile_Loop.myName();
DoWhile_Loop.check();

    }
public static void wishOnBirthDay(int age, String name){
      do {
          System.out.println(" happy Birthday to " +name +" :)");
          age--;
      } while (age> 28);

    }

    public static void myName(){
        String name="Ismat";
        do {
            System.out.println("My name is  ");
            break;
        } while (name=="tahmina");

    }
    public static void check(){
        int age1=20;
        int price1=200;
 do {
        System.out.println(" happy Birthday to fhfhfyj+" );
        age1++;
        price1++;
    } while (age1<= 25&&price1<=205);

}

}












