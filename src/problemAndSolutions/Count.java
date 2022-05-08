package problemAndSolutions;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        countingWords();
        WordCount();

    }


    public static void countingWords() {
        Scanner inputSentence = new Scanner(System.in);
        System.out.println("Enter your String");
        // String str="Eid Mubarak kjh kjh kjh kjh kjh";
        String str = inputSentence.nextLine();


        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number " + count);

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));


    }

    public static void WordCount() {



            String myAddress = "Deer Park, New York";
            int count = 1;

            for (int i = 0; i <myAddress.length()-1 ; i++) {
                if ((myAddress.charAt(i)==' ') && (myAddress.charAt(i+1) !=' ')){
                    count++;
                }
                // System.out.println("count by looping "+count);
            }
            System.out.println( "total count is: "+ count);
        }


    }



