import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Say something to Bob: ");
        String userResponse = sc.nextLine().trim();
        System.out.println(userResponse);

        if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.endsWith("?")) {
            System.out.println("Sure");
        } else if (userResponse.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }



    }

}
