package inheritanceLecture.inheritancePractice;

public class Motorcycle extends Vehicle {

    public String typeOfHandlebar;
    public boolean isOneSeater;
    public String horsePower;


    public Motorcycle(String typeOfHandlebar, int numberOfWheels, String vehicleType,
                      boolean isOneSeater, String horsePower, String color, String model){
        super(numberOfWheels, color, vehicleType, model);
        this.typeOfHandlebar = typeOfHandlebar;
        this.isOneSeater = isOneSeater;
        this.horsePower = horsePower;
    }

    public void describe(){
        System.out.println("*******************************");
        System.out.printf("Number of Wheels: %s\nIs One Seater? %s\nType of Handlebar: %s\nHorsepower: %s\n",
                 this.numberOfWheels, this.isOneSeater, this.typeOfHandlebar, this.horsePower);
        System.out.println("*******************************");

    }
}
