import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"a", "b", "c"};
    public static String[] nouns = {"x", "y", "z"};


    public static String getWord(String[] choices) {

        Random random = new Random();
        int randomNum = random.nextInt(choices.length);
        return choices[randomNum];

    }


    public static void main(String[] args) {
        System.out.println("Here is your random generated server name: ");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }


}
