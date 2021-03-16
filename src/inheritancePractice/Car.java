package inheritancePractice;

public class Car extends Vehicle {

    private final String horsepower;
    private final String transmissionType;


    public Car(String horsepower,
               String transmissionType,
               String color,
               int numberOfWheels,
               String model, String vehicleType){

        super(numberOfWheels, color, vehicleType, model);
        this.horsepower = horsepower;
        this.transmissionType = transmissionType;

    }

    public void describe(){
        System.out.println("*******************************");
        System.out.printf("Model: %s\nColor: %s\nHorsepower: %s\nNumber of Wheels: %s\nTransmission: %s\n",
                this.model, this.color, this.horsepower, this.numberOfWheels, this.transmissionType);
        System.out.println("*******************************");
    }
}
