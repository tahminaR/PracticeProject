package learnControlFlow;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {
        Scanner inputCase = new Scanner(System.in);
        System.out.println("enter your season ");
        int seasons = inputCase.nextInt();

        String seasonName;
        switch (seasons) {
            case 1:
                seasonName = "Summer";
                break;
            case 2:
                seasonName = "winter";
                break;
            case 3:
                seasonName = "spring";
                break;
            case 4:
                seasonName = "fall";
                break;
            default:
                seasonName = "no season";
                break;
        }
        System.out.println("now is  " + seasonName);

    }

}
//these are the topics is very important for our day-to-day job
//if else, if else if, for loop, switch, constructor, methods