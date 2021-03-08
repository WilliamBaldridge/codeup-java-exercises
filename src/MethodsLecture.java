import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {

//        String name = "William";
//        System.out.println(tryGetSalutation(name));

//        printGreeting();


//        printMultiplication(2, 4);
//        multiplyUserInput();

//        printNames();

        int start = 1;
        int end = 100;
        System.out.println(Arrays.toString(fizzBuzz(start, end)));

        System.out.println(sum(10));


    }

// ============== Method Definitions ===============

// *** Access Modifiers ***

//    public static void printSalutation(String name) {
//        System.out.println(tryGetSalutation(name));
//    }
//
//    public static String tryGetSalutation(String name) {
//
//        if ((name == null) || (name.equals(""))) {
//            return "No name provided";
//        } else {
//            return getSalutation(name, "Why, hello ");
//        }
//    }
//
//    public static String getSalutation(String name, String greeting) {
//
//        return greeting + name.toUpperCase(Locale.ROOT);
//    }
//
//// *** Static vs Instance ***
//
//    public static int doTheMathStatic() {
//        return 1 + 2;
//    }
//
//    public int doTheMathInstance() {
//        return 1 + 2;
//    }

// *** Returning vs Void ***

//    public static String getGreeting() {
//        return "Hai!";
//    }
//
//    public static void printGreeting() {
//        System.out.println(getGreeting());
//    }


// *** Parameters ***


// ============ Mini Exercise #1 =============

    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */


//    public static int multiplication(int x, int y) {
//        return x * y;
//    }
//
//    public static void printMultiplication(int num1, int num2) {
//        System.out.printf("The product of x and y is %s\n", multiplication(num1, num2));
//    }
//
//    public static void multiplyUserInput() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter x value: ");
//        int userX = sc.nextInt();
//        System.out.println("Enter y value: ");
//        int userY = sc.nextInt();
//
//        printMultiplication(userX, userY);
//    }

// ============== Method Overloading ===============

//    public static int doMath() {
//        return 1 + 1;
//    }
//
//    public static int doMath(int num1) {
//        return num1 + (1 + 1);
//    }
//
//    public static int doMath(int num1, int num2) {
//        return num1 + num2 + doMath();
//    }



// ============ Mini Exercise #2 =============

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

//    public static void listNames() {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter names: ");
//        String userNames = sc.nextLine();
//        System.out.printf(", %s", userNames);
//    }
//
//    public static void listNames(String name1) {
//        System.out.printf("this is not working %s, and %s", name1);
//    }
//
//    public static void listNames(String name1, String name2) {
//        System.out.printf("%s, and %s", name1, name2);
//    }


//    public static void printNames(String name) {
//        System.out.printf("Hello, %s, and\n", name);
//    }
//
//    public static void printNames(String name1, String name2) {
//        System.out.printf("Hello, %s and %s\n", name1, name2);
//    }
//
//    public static void printNames(String name1, String name2, String name3) {
//        System.out.printf("Hello, %s, %s, and %s\n", name1, name2, name3);
//    }
//
//    public static void printNames() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter names: ");
//        String userNames = sc.nextLine();
//        String name1 = "";
//        String name2 = "";
//        String name3 = "";
//        printNames(name1);
//        printNames(name1, name2);
//        printNames(name1, name2, name3);
//        printNames(userNames, name2, name3);
//    }



// ============== Recursion ===============

    private static String[] recurFizzBuzz(String[] result, int index,
                                          int start, int end) {
        if (index > result.length) {
            return result;
        }
        if (index % 15 == 0) {
            result[index - 1] = "FizzBuzz";
        } else if (index % 3 == 0) {
            result[index - 1] = "Fizz";
        } else if (index % 5 == 0) {
            result[index - 1] = "Buzz";
        } else {
            result[index - 1] = Integer.toString(index);
        }
        return recurFizzBuzz(result, index + 1, start, end);
    }

    public static String[] fizzBuzz(int start, int end) {
        return recurFizzBuzz(new String[1 + end - start], start, start, end);
    }


    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }




// ============== Responsible Method Use ===============


}

