package learnControlFlow;

public class DoWhileLoop {

    // while loop:  check the condition first then execute : Syntax: while loop (condition ) { code  /iteration}
    // Do while loop:  execute 1 time then check the condition : Syntax:  do { code /iteration } while (condition);
//  for Loop: ( start point; condition/endpoint; increment++/ decrement-- operator  ){block of code }


    public static void main(String[] args) {
        DoWhileLoop myObj = new DoWhileLoop();
        //myObj.myMethod();
        myObj.birthDayWish(22, "Shila");
//=================== While Loop ===================================
        int num = 7;
        while (num < 10) {
            System.out.println("this is incremental while loop");
            num++;
        }
        int num2 = 10;
        while (num > 7) {
            System.out.println("this is detrimental while loop");
            num--;
        }
        //==================Do While Loop ============================================================
        int age = 33;
        do {
            System.out.println("my age is : " + age);
            age++;
        }
        while (age < 30);
        //==========================================================================================
        boolean isTomorrowOff = true;
        do {
            DoWhileLoop.myMethod();
            //System.out.println(" Tomorrow is my day off ");
        }
        while (isTomorrowOff = false);
//==================================================================================================
        boolean doStudy = true;
        do {
            System.out.println("we are studying java :" + doStudy);
        }
        while (doStudy = false);
        //==========================================================
        while (age < 40) {
            System.out.println("my age is : " + age);
            age++;
        }

    }   //main method ended
//==================================================================================
        public static void birthDayWish ( int age, String name){
            do {
                System.out.println("happy Birthday " + name);
                age--;
            } while (age > 18);

        }
    public static void birthDayWish1 ( int age, String name){
        do {
            System.out.println("happy Birthday " + name);
            age--;
        } while (age > 18 && name.equals("Shila"));

    }
//=======================================================================================
    public static void myMethod() {
        String name = " tahmina";
        double price = 150.50;
        do {
            System.out.println("My product price: " + price);
            price++;
        }
        while (price < 140);

    }
    }
