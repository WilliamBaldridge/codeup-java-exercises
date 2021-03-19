package animals;

import animals.canine.Canine;
import animals.canine.Dog;
import animals.canine.Wolf;
import animals.feline.Feline;
import animals.feline.HouseCat;
import animals.feline.Lynx;

import java.util.Scanner;

public class AnimalTools {

    public static void getAnimalDetails() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 'dog', 'wolf', 'cat', or 'lynx' to know its details: ");

        String input = scanner.nextLine().toLowerCase();

//        Canine canine = null;
//
//        Feline feline = null;

        Animal animal = null;


        switch (input) {
            case "dog" -> animal = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                    "German Shepherd Dog", "Black and Tan");
            case "wolf" -> animal = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                    "Northwestern Wolf", false, "North America");
            case "lynx" -> animal = new Lynx("Medium", "Eurasian Lynx", "Feliformia Felidae Felinae", "Rawr", false, "Europe, Central Asia, and Siberian forests");
            case "cat" -> animal = new HouseCat("Meow", "Small", "Feliformia Felidae Felinae", "Maine Coon", "Various, White, Black/Smoke, Brown tabby, Orange tabby");
            default -> {
            }
        }

//        canine.printDetails();
//        feline.printDetails();
//        assert animal != null;
        animal.printDetails();

        System.out.println("Would you like more details on an animal? (yes/y)");

        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            getAnimalDetails();
        }

    }

}
