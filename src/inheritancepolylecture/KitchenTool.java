package inheritancepolylecture;

public class KitchenTool {

    public boolean isDirty;
    public boolean isSharp;
    public int numberOf;

    KitchenTool() {

    }

    public boolean getSharp() {
        return isSharp;
    }


    public int getNumberOf() {
        return numberOf;
    }


    public void wash() {
        System.out.println("Washing kitchen tool...");
    }




}
