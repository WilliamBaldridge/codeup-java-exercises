import java.util.Scanner;
import java.util.stream.IntStream;

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

//        for (long i = 2; i < 1_000_000; i *= i) {
//            System.out.println(i);
//        }


        // 2. **** Fizz Buzz ****

//        for (int i = 1; i < 100; i += 1) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 100; i += 1) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 3 == 0
//                        ? (i % 5 == 0 ? "FizzBuzz" : "Fizz")
//                        : (i % 5 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);


        // 3.

        Scanner sc = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to? ");
//
//        double userInput = sc.nextInt();
//
//        System.out.println("\nHere is your table!\n");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (double i = 1; i <= userInput; i += 1) {
//            double squared = i * i;
//            double cubed = i * i * i;
//            System.out.printf("%-6d | %-7d | %d \n", i, squared, cubed);
//
//            if (i == userInput) {
//                System.out.println("Would you like to continue? ");
//                String userContinue = sc.next();
//                if (userContinue.equalsIgnoreCase("yes")) {
//                    System.out.print("How many more rows? ");
//                    double extendedTable = sc.nextInt();
//                    System.out.println();
//                    userInput += extendedTable;
//                }
//            }
//        }


        // 4.

//        System.out.println("Enter your despicable grade: ");
//
//        int userGrade = sc.nextInt();

//        switch (userGrade / 10) {
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

//        String userInput;
//
//        do {
//            System.out.print("Would you like to see your letter grade? ");
//            userInput = sc.next();
//            if (userInput.equalsIgnoreCase("no")) {
//                System.out.println("Have a good day");
//            } else {
//                System.out.print("Enter your grade: ");
//                int userGrade = sc.nextInt();
//                if (userGrade >= 88) {
//                    System.out.println("You got an A");
//                } else if (userGrade >= 80){
//                    System.out.println("You got a B");
//                } else if (userGrade >= 67){
//                    System.out.println("You got a C");
//                } else if (userGrade >= 60){
//                    System.out.println("You got a D");
//                } else if (userGrade <= 59){
//                    System.out.println("You got an F");
//                }
//            }
//        } while (userInput.equalsIgnoreCase("yes"));


//        # Java Control Structures and Loops Bonuses
//
//### Simple Chat Bot
//
//        Be creative in communicating with your
//        user different options and for given scenerios. Create at least three phases of the chat, for example...
//
//        "How are you?" (AI says)
//			           |                              |
//        good                        bad (user types)
//
//        "Awesome! Are you super happy?" 	    "Will cake make you better?"
//
//        yes          no                     yes             no
//
//        Keep the chat options relatively simple and plan it out clearly before coding it.


//        System.out.println("How are you?");
//        String userResponse = sc.next();
//
//        if (userResponse.equalsIgnoreCase("good")) {
//            System.out.println("Awesome! Are you super happy?");
//            userResponse = sc.next();
//        }


//### Hangman Game
//
//        - prompt a player 1 to enter a word for player 2 to guess
//        - track the number of guesses by player 2
//                - display to the user the partially completed word as they guess letters correctly
//        - string methods from the next lesson will be helpful for this bonus


    }

}
