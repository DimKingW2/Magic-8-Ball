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
        else if (11<=inputNumber) && (inputNumber <= 20) {
            System.out.println("Yes");
        }
        else if (21 <=inputNumber) && (inputNumber <= 30) {
            System.out.println("Blyat");
        }















    }
}
