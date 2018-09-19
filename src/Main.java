public class Main {

    public static void main(String[] args) {
        /*
        exercise
         */
        for (int a = 0; a < 101; a += 2) {
            System.out.println(a);
        }

   /*
        for loop
         */
        for (int a = 0; a < 15; a++) {
            double b = a * 25.4;
            System.out.println(b);
        }
        System.out.println("All measurements processed");

    /*while loop
         */

        int a = 0;
        while (a <15)
        {
            double b = a*25.4;
            System.out.println(b);
            a++;
        }
        System.out.println("All measurements processed");

        /*do while loop
         */

        int c = 0;
        do {
            double b = c*25.4;
                System.out.println(b);
                c++;
        }while (c<15);

        System.out.println("All measurements processed");


    }
}