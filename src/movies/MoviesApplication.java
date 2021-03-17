package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);

        }


    }


    private static boolean executeUserChoice(int choice) {

        boolean continueRunning = true;

        switch (choice) {

            case 0:
                continueRunning = false;
                break;
            case 1:
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                System.out.println("\n");
                viewMoviesByCat("animated");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewMoviesByCat("drama");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewMoviesByCat("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewMoviesByCat("scifi");
                System.out.println("\n");
                break;

        }

        return continueRunning;

    }

    private static void viewMoviesByCat(String category) {

        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }

    }

    private static String returnMenuDisplay() {

        String choices = "What would you like do do?\n" +
                "0 - exit\n" +
        "1 - view all movies\n" +
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category\n";

        return choices;
    }

    private static int promptUserForChoice() {

        Input input = new Input();

        System.out.println("Enter your choice: ");

        return input.getInt(0, 5);

    }


}
