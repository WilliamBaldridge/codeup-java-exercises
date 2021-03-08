import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addition(2, 3));
//        System.out.println(subtraction(2, 3));
//        System.out.println(multiplication(2, 100));
//        System.out.println(division(2, 3));
//        System.out.println(modulus(2, 3));

//        getInteger(1, 10);

        printFactorial();
//        System.out.println(fact(0));

    }


    // 1

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(double x, double y) {
//        return x * y;
        return (int) (x / (1 / y));
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }


    // 2



    public static long getInteger() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number between 1 and 10: ");
        long userInput = sc.nextInt();

        return fact(userInput);
    }



//        if (userInput < min || userInput > max) {
//            System.out.println("Try again, please...");
//            getInteger(min, max);
//        } else {
//            System.out.println(userInput);
//        }
//        return userInput;
//    }


    public static long fact(long userInput) {
        if (userInput <= 1)
            return 1;
        else
            return userInput * fact(userInput - 1);
    }

    public static void printFactorial() {
        System.out.println(getInteger());
    }





}
