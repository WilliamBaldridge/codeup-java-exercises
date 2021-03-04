import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f\n", pi);

//        System.out.format();

        // write code to display like : The value of pi is approximately 3.14.


        System.out.print("\nPlease enter a number between -2147483648 and 2147483647: ");
        int userInt = sc.nextInt();
        System.out.print(userInt);

        System.out.print("\nEnter 3 words: ");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.print("\nEnter a sentence: ");
        sc.nextLine();
        String sentence = sc.nextLine();
        System.out.println(sentence);


        System.out.print("\nEnter the length: ");
        String lengthInput = sc.nextLine();
        System.out.print("Enter the width: ");
        String widthInput = sc.nextLine();

//        int length = Integer.parseInt(lengthInput);
//        System.out.println(length);

        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);
        System.out.println("The area is: " + (length * width) + "");
        System.out.println("The perimeter is: " + (length * 2 + width * 2) + "");








    }

}
