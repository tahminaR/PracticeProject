package learnControlFlow;
    import java.util.Scanner;
    public class IfElseIfConditionScanner {

        public static void main(String[] args) {
            IfElseIfConditionScanner learnIfElseIf = new IfElseIfConditionScanner();
            learnIfElseIf.doRetirementCalculation();
        }
        public void doRetirementCalculation() {
            // Age for Retirement Calculation
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Age to get the Retirement Calculation");
            int age = input.nextInt();

            if (age >= 18 && age <= 40) {
                System.out.println("Your age is less than 40");
            } else if (age >= 40 && age <= 50) {
                System.out.println("Your age is more than 40");
            } else if (age >= 51 && age <= 65) {
                System.out.println("Your age is more than 50");

            } else {
                System.out.println("It's your Retirement Time");
            }

        }
    }




