package learnControlFlow;

public class WhileLoop {

    //while Loop: Pre condition check
    //while loop is use in a situation, where we don't know how many times loop needs to be executed beforehand
    //for loop is used where we already know about the number of times loop needs to be executed
    //while loop syntax:  while (condition ) { increment ++ or decrement -- operator}

    public static void main(String[] args) {
        // if you start lower value and iteration will be less than (<)  and operator ++
        int number =1;
        while (number<4){
            System.out.println(" we are learning while loop increment ++  " +number);
            number++;
        }


        // if you start higher value iteration will be grater than(>)  and operator --
        int number1 =30;
        while (number1>25){
            System.out.println(" we are learning while loop decrement -- operator " +number1);
            number1--;
        }
    }



}
