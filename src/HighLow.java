import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        initializeGame();

    }

    
    public static void initializeGame() {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random()*100) + 1;
        System.out.println("Please guess a number between 1 and 100: ");

        playGame(sc, randomNum);

    }


    public static void playGame(Scanner sc, int randomNum) {

        int userGuess = sc.nextInt();

        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of bounds. Please try again");
            playGame(sc, randomNum);
        } else {

            String response = checkGuess(userGuess, randomNum);
            if (response.equals("Nailed it, you guessed the correct number!")) {
                System.out.println(response);
            } else {
                System.out.println(response);
                playGame(sc, randomNum);
            }
        }

    }


    public static String checkGuess(int guess, int targetNum) {

        if (guess == targetNum) {
            return "Nailed it, you guessed the correct number!";
        } else if (guess > targetNum) {
            return "Sorry, too high, try again";
        } else if (guess < targetNum) {
            return "Sorry, too low, try again";
        }
        return "anything";
    }


}
