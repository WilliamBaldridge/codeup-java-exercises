package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {

        return scanner.nextLine();

    }

    public boolean yesNo() {

        String input = scanner.next();
//        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }

        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));

    }


    public int getInt(int min, int max) {

        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.printf("Number is outside the range, enter a number between %d and %d%n", min, max);
            return getInt(min, max);
        }

    }

    public int getInt() {

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Wrong input, enter an integer");
            scanner.nextLine();
            return getInt();
        }

    }

    public double getDouble(double min, double max) {

        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.printf("Number is outside the range, enter a number between %d and %d%n", min, max);
            return getDouble(min, max);
        }

    }

    public double getDouble() {

        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Wrong input, enter a number");
            scanner.nextLine();
            return getDouble();
        }

    }


    public static void main(String[] args) {

        Input input = new Input();

//        System.out.println("Enter a string");
//        String userInput = input.getString();
//        System.out.println(userInput);

//        System.out.println("Would you like to continue?");
//        boolean continuation = input.yesNo();
//        if (continuation) {
//            System.out.println("Continuing");
//        } else {
//            System.out.println("Exiting");
//        }

//        System.out.println("Please enter an integer");
//        int userInt = input.getInt();
//        System.out.println("Your integer is: " + userInt);

//        System.out.println("Enter a number between 1 and 10");
//        int userInt = input.getInt(1, 10);
//        System.out.println("Your integer is: " + userInt);

        System.out.println("Enter a number between 1 and 10");
        double userDouble = input.getDouble(1.1, 10.5);
        System.out.println("Your number is: " + userDouble);



    }

}
