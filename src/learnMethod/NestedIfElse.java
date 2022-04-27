package learnMethod;

public class NestedIfElse {
    public static void main(String[] args) {

        int IQScore = 113;
        if (IQScore >= 85 && IQScore <= 114) {
            System.out.println("Your IQ is average");
            if (IQScore >= 115 && IQScore <= 129) {
                System.out.println("Your IQ is above average");
            } else {
                System.out.println("Your IQ is Moderate");
            }
            if (IQScore >= 145 && IQScore <= 160) {
                System.out.println("You are Einstein");
            } else {
                System.out.println("You are - Tahmina");
            }

            //this is parent else.
        } else {
            System.out.println("your IQ is Below average");


        }

    }
}


















    

