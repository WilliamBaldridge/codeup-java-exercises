import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {

        String name = "William";
        System.out.println(tryGetSalutation(name));

        printGreeting();
    }


// ============== Method Definitions ===============

// *** Access Modifiers ***

    public static void printSalutation(String name) {
        System.out.println(tryGetSalutation(name));
    }

    public static String tryGetSalutation(String name) {

        if ((name == null) || (name.equals(""))) {
            return "No name provided";
        } else {
            return getSalutation(name, "Why, hello ");
        }
    }

    public static String getSalutation(String name, String greeting) {

        return greeting + name.toUpperCase(Locale.ROOT);
    }

// *** Static vs Instance ***

    public static int doTheMathStatic() {
        return 1 + 2;
    }

    public int doTheMathInstance() {
        return 1 + 2;
    }

// *** Returning vs Void ***

    public static String getGreeting() {
        return "Hai!";
    }

    public static void printGreeting() {
        System.out.println(getGreeting());
    }



// *** Parameters ***


// ============ Mini Exercise #1 =============

    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */

    Scanner sc = new Scanner(System.in);




// ============== Method Overloading ===============

// ============ Mini Exercise #2 =============

// ============== Recursion ===============

// ============== Responsible Method Use ===============





}