package inheritancePractice;

public class Bicycle extends Vehicle {

    public String typeOfHandlebar;
    public boolean isOneSeater;

    public Bicycle(String typeOfHandlebar, int numberOfWheels, String model,
                   String vehicleType, String color, boolean isOneSeater){

        super(numberOfWheels, color, vehicleType, model);
        this.typeOfHandlebar = typeOfHandlebar;
        this.isOneSeater = isOneSeater;
    }

    public void describe(){
        System.out.println("*******************************");
        System.out.printf("Number of Wheels: %s\nIs One Seater? %s\nType of Handlebar: %s\n",
                this.numberOfWheels, this.isOneSeater, this.typeOfHandlebar);
        System.out.println("*******************************");
    }
}
