public class ExceptionsErrorHandling {


    public static void main(String[] args) {

        newMethod();


    }



    public static void newMethod() {
//        int result = 0;
//        try {
//            System.out.println("Let's see...");
//            result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }
//
//    }


        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!");
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
        } finally {
            System.out.println("This will always run.");
        }

    }


}
