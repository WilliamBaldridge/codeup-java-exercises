package inheritanceLecture.inheritancePractice;

public class Vehicle {

    protected int numberOfWheels;
    protected String color;
    protected String vehicleType;
    protected String model;

    public Vehicle(int numberOfWheels, String color, String vehicleType, String model){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.vehicleType = vehicleType;
        this.model = model;
    }

    public void typeOfVehicle(){
        System.out.printf("\n***%s***\n", this.vehicleType);
    }

    public void popsWheelie(){
        System.out.println("One wheel in the air! WOOOOO!!");
    }

    public void describe(){}
}
