import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args){
        //Defining variables
        Scanner keyboard;
        String  question;
        int inputNumber;

        //gathering information
        keyboard = new Scanner(System.in);
        System.out.println("What is your question for this magic machine?");
        question = keyboard.nextLine();
        System.out.println("Now for this to work pick a number between 1-100.");
        inputNumber = keyboard.nextInt();

        //Gets your future
        if (inputNumber <= 10) {
            System.out.println("NO!");
        }
        else if ((11 <= inputNumber) && (inputNumber <= 20)) {
            System.out.println("Yes");
        }
        else if ((21 <= inputNumber) && (inputNumber <= 30)) {
            System.out.println("Good idea");
        }
        else if ((31 <= inputNumber) && (inputNumber <= 40)) {
            System.out.println("Bad idea");
        }
        else if ((41 <= inputNumber) && (inputNumber <= 50)) {
            System.out.println("Outlook looks great.");
        }
        else if ((51 <= inputNumber) && (inputNumber <= 60)) {
            System.out.println("Outlook looks bad.");
        }
        else if ((61 <= inputNumber) && (inputNumber <= 70)) {
            System.out.println("Do it");
        }
        else if ((71 <= inputNumber) && (inputNumber <= 80)) {
            System.out.println("Do not do it.");
        }
        else if ((80 <= inputNumber) && (inputNumber <= 90)) {
            System.out.println("It will end out well.");
        }
        else if ((90 <= inputNumber) && (inputNumber <= 100)) {
            System.out.println("It will end out horribly");
        }















    }
}
