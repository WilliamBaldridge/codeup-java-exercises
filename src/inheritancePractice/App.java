package inheritancePractice;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a car, bicycle, or motorcycle");

        String vehicleChoice = scanner.nextLine().toLowerCase();

        Vehicle vehicle;

        switch (vehicleChoice) {
            case "car":
                vehicle = new Car("425hp", "Automatic", "Red",
                        4, "Corvette", "Coupe Sports Car");
                break;
            case "motorcycle":
                vehicle = new Motorcycle("Hogbar", 2,
                        "Hog Motorcycle", true, "180hp",
                        "Black", "Harley Longbar");
                break;
            case "bicycle":
                vehicle = new Bicycle("T-bar", 2,
                        "Trek Fixie", "Fixed Gear Bicycle", "Blue", true);
                break;
            default:
                vehicle = null;

        }

        vehicle.typeOfVehicle();
        vehicle.popsWheelie();
        vehicle.describe();




    }
}
