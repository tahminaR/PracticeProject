package Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        ScannerPractice.practice();

    }
    public static void practice(){

        String sentence="this little light is mine";
        Scanner sent=new Scanner(sentence);
        ArrayList<String > splitWords=new ArrayList<String >();
        while (sent.hasNext()){

            splitWords.add(sent.next());


        }
        System.out.println(splitWords);
        sent.close();
    }

}
