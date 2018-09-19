import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {
        int Secret = 6, numberHolder=0;
        while (numberHolder != Secret) {
            System.out.println("Enter a number 1-10");
            Scanner userInput = new Scanner(System.in);
            numberHolder = userInput.nextInt();
            userInput.nextLine();
            System.out.println("You typed " + numberHolder);

//        Random r = new Random();
//        int x = 1 + r.nextInt(10);
// System.out.println("Guess again. My random number is" + x);

        }
    }

}
