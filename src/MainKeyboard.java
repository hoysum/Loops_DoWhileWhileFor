import java.util.Scanner;

public class MainKeyboard {

    public static void main(String[] args) {


   /*
        for loop
         */
        for (int Count = 1; Count < 15; Count ++)
        {
        System.out.println("Enter a number");
        Scanner userInput = new Scanner(System.in);
        int numberHolder =userInput.nextInt();
        userInput.nextLine();


            double b = numberHolder * 25.4;
            System.out.println("You typed " +numberHolder );
            System.out.println(b);
        }
        System.out.println("All measurements processed");

    /*while loop
         */

        int Count = 0;
        while (Count <16)
        {
            System.out.println("Enter a number");
            Scanner userInput = new Scanner(System.in);
            int numberHolder =userInput.nextInt();
            userInput.nextLine();
            System.out.println("You typed " +numberHolder);

            double b = numberHolder*25.4;
            System.out.println(b);
            Count++;
        }
        System.out.println("All measurements processed");

        /*do while loop
         */

        int c = 0;
        do {
            System.out.println("Enter a number");
            Scanner userInput = new Scanner(System.in);
            int numberHolder =userInput.nextInt();
            userInput.nextLine();
            System.out.println("You typed " +numberHolder);

            double b = c*25.4;
                System.out.println(b);
                c++;
        }while (c<15);

        System.out.println("All measurements processed");


    }
}