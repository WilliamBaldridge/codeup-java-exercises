import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // 1.

//        int i = 5;

//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        double i = 2;
//
//        do  {
//
//            System.out.println( (int) i );
//            i *= i;
//        } while (i < 1000000);


//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i < 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (double i = 2; i < 1000000; i *= i) {
//            System.out.println( (int) i );
//        }


        // 2. **** Fizz Buzz ****

//        for (int i = 1; i < 100; i += 1) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 100; i += 1) {
//            if (i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3.

        Scanner sc = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");

        double userInput = sc.nextInt();

        System.out.println("\nHere is your table!\n");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (double i = 1; i <= userInput; i += 1) {
            double squared = i * i;
            double cubed = i * i * i;
            System.out.printf("%.0f      | %.0f       | %.0f\n", i, squared, cubed);

            if (i == userInput) {
                System.out.println("Would you like to continue? ");
                String userContinue = sc.next();
                if (userContinue.equalsIgnoreCase("yes")) {
                    System.out.print("How many more rows? ");
                    double extendedTable = sc.nextInt();
                    System.out.println();
                    userInput += extendedTable;
                }
            }
        }






//        System.out.println("Would you like to continue? ");
//
//        userContinue = sc.next();



        // 4.

//        System.out.println("Enter your despicable grade: ");
//
//        int userGrade = sc.nextInt();
//
//        switch (userGrade/10) {
//            case 9:
//                System.out.println("You got an A, job well done chap!");
//                break;
//            case 8:
//                System.out.println("You got a B, not too shabby...");
//                break;
//            case 7:
//                System.out.println("You got a C, better luck next time...");
//                break;
//            case 6:
//                System.out.println("You got a D, cuttin it a bit close are we?");
//                break;
//            default:
//                System.out.println("You got an F, you poor mate... :(");
//                break;
//        }


    }

}
